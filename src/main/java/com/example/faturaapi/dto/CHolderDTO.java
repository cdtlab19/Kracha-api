package com.example.faturaapi.dto;

import java.io.Serializable;

public class CHolderDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    private String name;
    private String cpf;
    private String sex;
    private String birthday;

    public CHolderDTO(){
    }

    public CHolderDTO(String name ,String cpf, String sex, String birthday) {
        this.cpf = cpf;
        this.sex = sex;
        this.name = name;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }
}
