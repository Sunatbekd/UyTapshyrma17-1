package com.company;

public class Horse extends Animal{
    private String color;

    public Horse(int weight, int age, String nickName, String gender, String color) {
        super(weight, age, nickName, gender);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Horse = " +
                "color = " + color +
                 super.toString();
    }
}
