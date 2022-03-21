package com.company;

public class Client extends Restoran {

    private String dish;

    public Client(String name, String dishs) {
        super(name);
        this.dish = dishs;
    }

    public void Show() {
        System.out.printf("Client name: %s \t Dish: %s \n ", super.getName(), dish);
        System.out.printf("Client name: %s \t Dish: %s \n ", super.getName(), dish);
        System.out.printf("Client name: %s \t Dish: %s \n ", super.getName(), dish);
        System.out.printf("Client name: %s \t Dish: %s \n ", super.getName(), dish);
        System.out.printf("Client name: %s \t Dish: %s \n ", super.getName(), dish);
        System.out.printf("Client name: %s \t Dish: %s \n ", super.getName(), dish);
//         dsaadsasd
        System.out.printf("Client name: %s \t Dish: %s \n ", super.getName(), dish);
    }
}
