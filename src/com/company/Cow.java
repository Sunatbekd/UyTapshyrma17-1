package com.company;

public class Cow extends Animal{

    public Cow(int weight, int age, String nickName, String gender) {
        super(weight, age, nickName, gender);
    }

    @Override
    public String toString() {
        return "Cow = " + super.toString();
    }
}
