package com.ironhack.main;

public class Employees {
    private String name;
    private String surname;
    private int age;
    private double salary;

    public Employees(String name, String surname, int age, double salary) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public final void setSalary(double salary) {
        if(salary <= 20000){
        this.salary = salary;
    }else if(salary > 20000){
            int MAX_SALARY = 20000;
            this.salary = MAX_SALARY;
            System.out.println("El salario maximo es de 20000 anuales, se establecerá el mismo");
        }
        }
}
