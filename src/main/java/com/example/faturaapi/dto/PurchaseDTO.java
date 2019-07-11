package com.example.faturaapi.dto;

import java.util.Objects;

public class PurchaseDTO {

    private String id;
    private String ccNumber;
    private String local;
    private String data; // talvez mudar para o modelo padrão de data do Java, caso seja realmente a data
    private Integer numParcel;
    private float amount;
    private boolean canceled;

    public PurchaseDTO() {
    }

    public PurchaseDTO(String id, String ccNumber, String local, String data, Integer numParcel, float amount, boolean canceled) {
        this.id = id;
        this.ccNumber = ccNumber;
        this.local = local;
        this.data = data;
        this.numParcel = numParcel;
        this.amount = amount;
        this.canceled = canceled;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public boolean isCanceled() {
        return canceled;
    }

    public void setCanceled(boolean canceled) {
        this.canceled = canceled;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PurchaseDTO that = (PurchaseDTO) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

}
