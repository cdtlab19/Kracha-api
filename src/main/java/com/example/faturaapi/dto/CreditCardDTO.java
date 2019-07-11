package com.example.faturaapi.dto;

public class CreditCardDTO {

    private String number;
    private String cvv;
    private Integer maxLimit;
    private Integer availableLimit;
    private String holderCPF;

    public CreditCardDTO() {
    }

    public CreditCardDTO(String number, String cvv, Integer maxLimit, Integer availableLimit, String holderCPF) {
        this.number = number;
        this.cvv = cvv;
        this.maxLimit = maxLimit;
        this.availableLimit = availableLimit;
        this.holderCPF = holderCPF;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getCvv() {
        return cvv;
    }

    public void setCvv(String cvv) {
        this.cvv = cvv;
    }

    public Integer getMaxLimit() {
        return maxLimit;
    }

    public void setMaxLimit(Integer maxLimit) {
        this.maxLimit = maxLimit;
    }

    public Integer getAvailableLimit() {
        return availableLimit;
    }

    public void setAvailableLimit(Integer availableLimit) {
        this.availableLimit = availableLimit;
    }

    public String getHolderCPF() {
        return holderCPF;
    }

    public void setHolderCPF(String holderCPF) {
        this.holderCPF = holderCPF;
    }
}
