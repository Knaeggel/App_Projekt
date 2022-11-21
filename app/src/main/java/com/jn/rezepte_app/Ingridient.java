package com.jn.rezepte_app;

public class Ingridient {

    private String name;

    /**
     * in gram
     */
    private int amount;


    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }
}
