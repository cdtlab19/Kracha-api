package com.example.faturaapi.services;

import com.example.faturaapi.dto.InvoiceDTO;
import com.example.faturaapi.dto.PurchaseDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PurchaseService {

//    @Autowired
//    private BlockchainService blockchainService;

    public PurchaseDTO buy(PurchaseDTO purchaseDTO) {
        return new PurchaseDTO();
    }

    public PurchaseDTO cancel(String purchaseId) {
        return new PurchaseDTO();
    }

    public PurchaseDTO findPurchaseByNumber(String number) {
        return new PurchaseDTO();
    }

    public List<PurchaseDTO> findPurchaseByCreditCard(String ccNumber) {
        List<PurchaseDTO> list = new ArrayList<>();
        return list;
    }

    public  List<PurchaseDTO> findAllPurchase() {
        List<PurchaseDTO> list = new ArrayList<>();
        return list;
    }

    public List<InvoiceDTO> findInvoicesByCreditCard(String number) {
        List<InvoiceDTO> list = new ArrayList<>();
        return list;
    }

    public InvoiceDTO findInvoiceById(String invoiceId) {
        return new InvoiceDTO();
    }

    public void payInvoice(String invoiceNumber, float amount) {

    }
}
