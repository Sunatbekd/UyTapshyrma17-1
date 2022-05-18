package com.company;

import java.util.Arrays;

public class Farm {
    private String address;
    private String ownerName;
    private Cow[] cows;
    private Sheep[] sheep;
    private Horse[] horses;

    public Farm(String address, String ownerName, Cow[] cows, Sheep[] sheep, Horse[] horses) {
        this.address = address;
        this.ownerName = ownerName;
        this.cows = cows;
        this.sheep = sheep;
        this.horses = horses;
    }
    public Farm(){

    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public Cow[] getCows() {
        return cows;
    }

    public void setCows(Cow[] cows) {
        this.cows = cows;
    }

    public Sheep[] getSheep() {
        return sheep;
    }

    public void setSheep(Sheep[] sheep) {
        this.sheep = sheep;
    }

    public Horse[] getHorses() {
        return horses;
    }

    public void setHorses(Horse[] horses) {
        this.horses = horses;
    }

    @Override
    public String toString() {
        return
                "Address = " + address  +
                ",OwnerName = " + ownerName+":"+"\n-------------------------" +
                "\n" + Arrays.toString(cows) +
                "\n" + Arrays.toString(sheep) +
                "\n" + Arrays.toString(horses);
    }
}
