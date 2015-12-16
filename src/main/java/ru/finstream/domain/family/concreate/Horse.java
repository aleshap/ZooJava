package ru.finstream.domain.family.concreate;

import ru.finstream.structure.classes.Mammal;

/**
 * Created by pav on 08.12.2015.
 */
public class Horse extends Mammal {

    /**
     * Лошаль для езды
     */
    private boolean IsOutForRide;

    public boolean setIsOutForRide(boolean value){
        this.IsOutForRide=value;
        return true;
    };

    public boolean getIsOutForRide(){
        return this.IsOutForRide;
    };

}
