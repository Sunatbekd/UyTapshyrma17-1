package com.company;

public class Sheep extends Animal{

    public Sheep(int weight, int age, String nickName, String gender) {
        super(weight, age, nickName, gender);
    }

    @Override
    public String toString() {
        return "Sheep " + super.toString();
    }
}
