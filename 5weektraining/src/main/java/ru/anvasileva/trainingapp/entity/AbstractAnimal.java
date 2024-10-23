package ru.anvasileva.trainingapp.entity;

public abstract class AbstractAnimal {

    abstract void eat();

    void sleep(){
        System.out.println("Животное уснуло");
    }
}
