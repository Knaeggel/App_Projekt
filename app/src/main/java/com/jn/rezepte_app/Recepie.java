package com.jn.rezepte_app;

import java.util.List;

public class Recepie {
    private String recepieName;
    private double valuation;
    private int portion;

    private List<String> ingredients;
    private List<String> comments;



    public double getValuation() {
        return valuation;
    }
    public void setValuation(double valuation) {
        this.valuation = valuation;
    }

    public void setRecepieName(String recepieName) {
        this.recepieName = recepieName;
    }
    public String getRecepieName() {
        return recepieName;
    }

    public List<String> getIngredients() {
        return ingredients;
    }
    public void setIngredients(List<String> ingredients) {
        this.ingredients = ingredients;
    }

    public boolean addIngredient(String s) {
        return ingredients.add(s);
    }
    public boolean removeIngredient(String s) {
        return ingredients.remove(s);
    }

    public List<String> getComments() {
        return comments;
    }
    public void setComments(List<String> comments) {
        this.comments = comments;
    }

    public boolean addComment(String s) {
        return comments.add(s);
    }

}
