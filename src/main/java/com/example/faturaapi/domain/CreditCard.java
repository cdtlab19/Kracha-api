package com.example.faturaapi.domain;

import java.util.Objects;

public class CreditCard {

    private String number;
    private String cvv;
    private Integer maxLimit;
    private Integer availableLimit;

    public CreditCard() {
    }

    public CreditCard(String number, String cvv, Integer maxLimit, Integer availableLimit) {
        this.number = number;
        this.cvv = cvv;
        this.maxLimit = maxLimit;
        this.availableLimit = availableLimit;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CreditCard that = (CreditCard) o;
        return Objects.equals(number, that.number);
    }

    @Override
    public int hashCode() {
        return Objects.hash(number);
    }
}
