package com.company;

public class Main {
    public static void main(String[] args) {
        Sheep sheep = new Sheep(20,2,"Koy","male");
        Sheep sheep1 = new Sheep(21,1,"Koy1","female");
        Sheep sheep2 = new Sheep(22,3,"Koy2","male");
        Sheep sheep3 = new Sheep(23,4,"Koy3","female");

        Horse horse = new Horse(150,5,"Tom","male","red");
        Horse horse1 = new Horse(200,5,"Tom1","female","black");
        Horse horse2 = new Horse(250,5,"Tom2","male","white");

        Cow cow = new Cow(250,2,"zoya","female");
        Cow cow1 = new Cow(300,3,"zoya1","male");
        Cow cow2= new Cow(350,4,"zoya2","female");
        Cow cow3 = new Cow(400,5,"zoya3","male");
        Cow cow4 = new Cow(450,6,"zoya4","female");
        Cow cow5 = new Cow(500,7,"zoya5","female");

        Farm farm1 = new Farm();
        System.out.println("Первый Ферма");
        farm1.setAddress("Kemin");
        farm1.setOwnerName("Asan");
        farm1.setCows(new Cow[] {cow,cow1,cow2,cow3,cow4});
        farm1.setSheep(new Sheep[]{sheep,sheep1,sheep3});
        farm1.setHorses(new Horse[]{horse,horse1});
        System.out.println(farm1);
        System.out.println("-----------------------------------------------------");

        Farm farm2 = new Farm();
        System.out.println("Второй Ферма");
        farm2.setAddress("ChonKemin");
        farm2.setOwnerName("Uson");
        farm2.setCows(new Cow[] {cow5});
        farm2.setSheep(new Sheep[] {sheep2});
        farm2.setHorses(new Horse[]{horse2});
        System.out.println(farm2);
    }
}
