package com.jn.rezepte_app;

import java.util.List;

/**
 * maybe als lib
 */
public class Recepie {
    private String recepieName;
    private double valuation;
    private int portion;

    private List<Ingridient> ingredients;
    private List<String> comments;


    public Recepie() {
        this.ingredients = null;
        this.comments = null;
    }

    public Recepie(List<Ingridient> ingredients, List<String> comments) {
        this.ingredients = ingredients;
        this.comments = comments;
    }

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

    public List<Ingridient> getIngredients() {
        return ingredients;
    }
    public void setIngredients(List<Ingridient> ingredients) {
        this.ingredients = ingredients;
    }

    public boolean addIngredient(Ingridient s) {
        return ingredients.add(s);
    }
    public boolean removeIngredient(Ingridient s) {
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
