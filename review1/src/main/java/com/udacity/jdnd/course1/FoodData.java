package com.udacity.jdnd.course1;

public class FoodData {

    private String name;
    private Integer calories;

    public FoodData(String name, Integer calories) {
        this.name = name;
        this.calories = calories;
    }

    public FoodData() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCalories() {
        return calories;
    }

    public void setCalories(Integer calories) {
        this.calories = calories;
    }
}
