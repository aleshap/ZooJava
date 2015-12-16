package ru.finstream.domain.family;

import ru.finstream.structure.Animal;

/**
 * Created by pav on 07.12.2015.
 */
abstract public class Mammal extends Animal implements MammalIface {

    /**
     * Кол-во ног
     */
    private int countOfLegs;

    public boolean setCountOfLegs(int value){
        this.countOfLegs =value;
        return true;
    };

    public int getCountOfLegs(){
        return this.countOfLegs;
    };

}