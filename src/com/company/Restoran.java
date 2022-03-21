package com.company;

public abstract class Restoran {

    private String name;

    public String getName(){return name;}

    public Restoran(String name)
    {
        this.name = name;
    }

    public abstract void Show();


}

//Ресторан логика его взаимодействий через абстракцию (Повар)