package com.example.faturaapi.controllers;

import com.example.faturaapi.dto.CreditCardDTO;
import com.example.faturaapi.services.CreditCardService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value="/api/creditcard")
@Api(value="Credit Card", description="Credit card's Controller")
public class CreditCardController {

    @Autowired
    private CreditCardService service;

    @ApiOperation(value="Create a Credit card")
    @PostMapping(path="/")
    public ResponseEntity<?> create(@RequestBody CreditCardDTO objDto) {
        return ResponseEntity.ok().body(objDto);
    }

    @ApiOperation(value="Delete a Credit card")
    @DeleteMapping(path="/{number}")
    public ResponseEntity<?> delete(@PathVariable  String number) {
        return ResponseEntity.ok().body(number);
    }

    @ApiOperation(value="Find a Credit card by number")
    @GetMapping(path="/cc/{number}")
    public ResponseEntity<?> findByNumber(@PathVariable String number) {
        return ResponseEntity.ok().body(number);
    }

    @ApiOperation(value="Find ALL Credit card by holder.")
    @GetMapping(path="/holder/{holderCPF}")
    // public ResponseEntity<List<?>> findByHolder(@PathVariable String holderCPF) {
    public ResponseEntity<?> findByHolder(@PathVariable String holderCPF) {
        return ResponseEntity.ok().body(holderCPF);
    }

    @ApiOperation(value="Find ALL Credit card.")
    @GetMapping(path="/")
    // public ResponseEntity<List<?>> findAll() {
    public ResponseEntity<?> findAll() {
        return ResponseEntity.ok().body("Oii");
    }

}
