package ru.finstream.structure.classes;

import ru.finstream.structure.Animal;

/**
 * Created by pav on 07.12.2015.
 */
abstract public class Mammal extends Animal implements MammalIface {

    /**
     * Кол-во ног
     */
    private int CountOfLegs;

    public boolean setCountOfLegs(int value){
        this.CountOfLegs=value;
        return true;
    };

    public int getCountOfLegs(){
        return this.CountOfLegs;
    };

}
