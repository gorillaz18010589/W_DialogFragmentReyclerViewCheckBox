package com.example.dialogfragmentreyclerviewv3;

public class RechargeCheckBox {
    private String name,bankNum;

    public RechargeCheckBox() {
    }

    public RechargeCheckBox(String name, String bankNum) {
        this.name = name;
        this.bankNum = bankNum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBankNum() {
        return bankNum;
    }

    public void setBankNum(String bankNum) {
        this.bankNum = bankNum;
    }
}

