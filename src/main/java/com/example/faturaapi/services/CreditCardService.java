package com.example.faturaapi.services;

import com.example.faturaapi.domain.CreditCard;
import com.example.faturaapi.dto.CreditCardDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CreditCardService {

//    @Autowired
//    private BlockchainService blockchainService;


    public CreditCardDTO create(CreditCardDTO ccDto) {
        return new CreditCardDTO(null, null, null, null, null);
    }

    public void delete(String number) {

    }

    public CreditCardDTO findByNumber(String number) {
        return new CreditCardDTO(null, null, null, null, null);
    }

    public List<CreditCardDTO> findByHolder(String cpf) {
        List<CreditCardDTO> list = new ArrayList<>();
        return list;
    }

    public List<CreditCardDTO> findAll() {
        List<CreditCardDTO> list = new ArrayList<>();
        return list;
    }

//    public CreditCard fromDTO(CreditCardDTO objDto) {
//        return new CreditCard(objDto.getNumber(), objDto.getCvv(), objDto.getMaxLimit(), objDto.getAvailableLimit());
//    }
}
