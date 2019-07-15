package com.example.faturaapi.services;

import com.example.faturaapi.services.exceptions.CHolderException;
import io.swagger.models.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CHolderService {

    @Autowired
    private BlockchainService blockchainService;

    public List<Response> QueryCHolder(String [] args, String method) {
        //return blockchainService.query("coffee", method, "github.com/cdtlab19/coffee-chaincode/entry/coffee", args);
    }

    public List<io.swagger.models.Response> InvokeCHolder(String[] args, String method) throws CHolderException {
        //return blockchainService.invoke("coffee", method, "github.com/cdtlab19/coffee-chaincode/entry/coffee", args);
    }

    public BlockchainService getBlockchainService() {
        return blockchainService;
    }
}
