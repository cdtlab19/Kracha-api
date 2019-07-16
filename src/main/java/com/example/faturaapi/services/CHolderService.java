package com.example.faturaapi.services;

import com.example.faturaapi.responses.Response;
import org.hyperledger.fabric.sdk.exception.TransactionException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CHolderService {

    @Autowired
    BlockchainService blockchainService;

    public List<Response> QueryCHolder(String [] args, String method) {
        return blockchainService.query("cardholder", method, "https://github.com/cdtlab19/kracha/entry/cardholder", args);
    }

    public List<Response> InvokeCHolder(String[] args, String method) throws TransactionException {
        return blockchainService.invoke("cardholder", method, "https://github.com/cdtlab19/kracha/entry/cardholder", args);
    }

    public BlockchainService getBlockchainService() {
        return blockchainService;
    }
}
