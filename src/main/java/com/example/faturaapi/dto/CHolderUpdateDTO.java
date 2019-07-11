package com.example.faturaapi.dto;

public class CHolderUpdateDTO {

    private String sex;
    private String birthday;
    private String name;

    public CHolderUpdateDTO() {
    }

    public CHolderUpdateDTO(String sex, String name, String birthday) {
        this.sex = sex;
        this.name = name;
        this.birthday = birthday;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
