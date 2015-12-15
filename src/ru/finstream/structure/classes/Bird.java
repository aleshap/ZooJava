package ru.finstream.structure.classes;

import ru.finstream.structure.Animal;


/**
 * Created by pav on 07.12.2015.
 */
abstract public class Bird extends Animal implements BirdIface {

    /**
     * Цвет
     */
    private String Color;

    /**
     * Размер
     */
    private int Size;

    /**
     * Умеет петь
     */
    private boolean IsSing;


    public boolean setColor(String value){
        this.Color=value;
        return true;
    };

    public String getColor() {
        return this.Color;
    };

    public boolean setSize(int value){
        this.Size=value;
        return true;
    };

    public int getSize(){
        return this.Size;
    };

    public boolean setIsSing(boolean value){
        this.IsSing=value;
        return true;
    };

    public boolean getIsSing(){
        return this.IsSing;
    };

}

