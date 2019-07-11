package com.example.faturaapi.dto;

import com.example.faturaapi.domain.InvoiceItem;

import java.util.List;
import java.util.Objects;

public class InvoiceDTO {

    private String invoiceId;
    private String dueDate; // talvez mudar para o modelo padrão de data do Java
    private float paidValue;
    private List<InvoiceItem> items;

    public InvoiceDTO() {
    }

    public InvoiceDTO(String invoiceId, String dueDate, float paidValue, List<InvoiceItem> items) {
        this.invoiceId = invoiceId;
        this.dueDate = dueDate;
        this.paidValue = paidValue;
        this.items = items;
    }

    public String getInvoiceId() {
        return invoiceId;
    }

    public void setInvoiceId(String invoiceId) {
        this.invoiceId = invoiceId;
    }

    public String getDueDate() {
        return dueDate;
    }

    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }

    public float getPaidValue() {
        return paidValue;
    }

    public void setPaidValue(float paidValue) {
        this.paidValue = paidValue;
    }

    public List<InvoiceItem> getItems() {
        return items;
    }

    public void setItems(List<InvoiceItem> items) { // talvez mudar para addItem?
        this.items = items;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        InvoiceDTO invoiceDTO = (InvoiceDTO) o;
        return Objects.equals(invoiceId, invoiceDTO.invoiceId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(invoiceId);
    }
}

