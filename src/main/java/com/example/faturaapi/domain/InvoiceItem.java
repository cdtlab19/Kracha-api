package com.example.faturaapi.domain;

import java.util.Objects;

public class InvoiceItem {

    private String purchaseId;
    private float amount;

    public InvoiceItem() {
    }

    public InvoiceItem(String purchaseId, float amount) {
        this.purchaseId = purchaseId;
        this.amount = amount;
    }

    public String getPurchaseId() {
        return purchaseId;
    }

    public void setPurchaseId(String purchaseId) {
        this.purchaseId = purchaseId;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        InvoiceItem that = (InvoiceItem) o;
        return Objects.equals(purchaseId, that.purchaseId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(purchaseId);
    }
}
