package com.osman.myapplication;

public class Transaction {
    int id;
    String FullName;
    double amount;
    long ref;

    public Transaction(int id, String fullName, double amount, long ref) {
        this.id = id;
        FullName = fullName;
        this.amount = amount;
        this.ref = ref;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullName() {
        return FullName;
    }

    public void setFullName(String fullName) {
        FullName = fullName;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public long getRef() {
        return ref;
    }

    public void setRef(long ref) {
        this.ref = ref;
    }
}
