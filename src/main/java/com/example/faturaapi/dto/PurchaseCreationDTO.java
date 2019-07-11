package com.example.faturaapi.dto;

public class PurchaseCreationDTO {

    private String ccNumber;
    private String local;
    private String data; // talvez mudar para o modelo padrão de data do Java, caso seja realmente a data
    private Integer numParcel;
    private float amount;

    public PurchaseCreationDTO() {
    }

    public PurchaseCreationDTO(String ccNumber, String local, String data, Integer numParcel, float amount) {
        this.ccNumber = ccNumber;
        this.local = local;
        this.data = data;
        this.numParcel = numParcel;
        this.amount = amount;
    }

    public String getCcNumber() {
        return ccNumber;
    }

    public void setCcNumber(String ccNumber) {
        this.ccNumber = ccNumber;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public Integer getNumParcel() {
        return numParcel;
    }

    public void setNumParcel(Integer numParcel) {
        this.numParcel = numParcel;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }
}
