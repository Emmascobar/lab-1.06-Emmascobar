package com.ironhack.main;

public class Interns extends Employees {
    private String category;
    private boolean isNew;

    public Interns(String name, String surname, int age, double salary, String category) {
        super(name, surname, age, salary);
        this.category = category;
        this.isNew = true;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
