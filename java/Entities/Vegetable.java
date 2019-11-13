package Entities;

import exceptions.AddVegetableWithInvalidCalories;

public abstract class Vegetable {
    private int id;
    private double weight;
    private String name;
    private double calories;

    public Vegetable(double weight, String name, double calories) {
        this.weight = weight;
        this.name = name;
        this.calories = calories;
    }

    public int getId() {

        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getCalories() {
        return calories;
    }

    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }

    public void setCalories(double calories) throws AddVegetableWithInvalidCalories {

        if (calories < 0) {
            throw new AddVegetableWithInvalidCalories("Product can't consist negative calories amount");
        }
        this.calories = calories;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWeight(double weight) {

        this.weight = weight;
    }

    public Vegetable(int id, double weight, String name, double calories) {
        this.id = id;
        this.weight = weight;
        this.name = name;
        this.calories = calories;
    }

    @Override
    public String toString() {
        return "Name of product - " + name.toString() + " Product's weight - " + weight + " Product's calories - " + calories;
    }
}