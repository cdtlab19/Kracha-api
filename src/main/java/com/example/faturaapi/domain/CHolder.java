package com.example.faturaapi.domain;

import java.util.Objects;

public class CHolder {

    private String cpf;
    private String sex;
    private String maritalStatus;
    private String scholarity;

    public CHolder() {
    }

    public CHolder(String cpf, String sex, String maritalStatus, String scholarity) {
        this.cpf = cpf;
        this.sex = sex;
        this.maritalStatus = maritalStatus;
        this.scholarity = scholarity;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public String getScholarity() {
        return scholarity;
    }

    public void setScholarity(String scholarity) {
        this.scholarity = scholarity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CHolder cHolder = (CHolder) o;
        return Objects.equals(cpf, cHolder.cpf);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cpf);
    }
}
