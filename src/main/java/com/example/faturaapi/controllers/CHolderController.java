package com.example.faturaapi.controllers;

import com.example.faturaapi.dto.CHolderDTO;
import com.example.faturaapi.dto.CHolderUpdateDTO;
import com.example.faturaapi.services.CHolderService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import io.swagger.models.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value="/api/holder")
@Api(value="Card Holder", description="Card Holder's Controller")
public class CHolderController {

    @Autowired
    private CHolderService service;

    @ApiOperation(value="Create a card holder")
    @ApiResponses(value={@ApiResponse(code=200, message = "Sucesso")})
    @PostMapping(path="/")
    public ResponseEntity<List<Response>> create(@RequestBody CHolderDTO objDto) {
        String[] args={objDto.getName(),objDto.getCpf(),objDto.getSex(),objDto.getBirthday()};
        List<Response> response = service.InvokeCHolder(args,"CreateCHolder");
        return new ResponseEntity<>(response , HttpStatus.CREATED);
    }

    @ApiOperation(value="Update a card holder")
    @PutMapping(path="/{cpf}")
    public ResponseEntity<List<Response>> update(@PathVariable String cpf, @RequestBody CHolderUpdateDTO objDto) {
        String[] args={cpf,objDto.getName(),objDto.getSex(),objDto.getBirthday()};
        List<Response> response = service.InvokeCHolder(args, "UpdateCHolder");
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @ApiOperation(value="Delete a card holder")
    @DeleteMapping(path="/{cpf}")
    public ResponseEntity<List<Response>> delete(@PathVariable String cpf) {
        List<Response> response = service.InvokeCHolder(new String[] {cpf}, "UpdateCHolder");
        return new ResponseEntity<>(response , HttpStatus.OK );
    }

    @ApiOperation(value="Find a card holder")
    @GetMapping(path="/{cpf}")
    public ResponseEntity<List<Response>> find(@PathVariable String cpf) {
        List<Response> response = service.QueryCHolder(new String[] {cpf}, "GetCHolder");
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @ApiOperation(value="Find ALL card holder")
    @GetMapping(path="/")
    // public ResponseEntity<List<?>> findAll() {
    public ResponseEntity<List<Response>> findAll() {
        List<Response> response = service.QueryCHolder(new String[] {""}, "AllCHolder");
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}
