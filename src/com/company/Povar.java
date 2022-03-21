package com.company;

public class Povar extends Restoran {

    private String dish;

    public Povar(String name,String dishs)
    {
        super(name);
        this.dish = dishs;
    }

    public void Show()
    {
        System.out.printf("Povar name: %s \t Dish: %s \n " , super.getName(), dish );
    }

}
