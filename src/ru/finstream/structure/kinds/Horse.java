package ru.finstream.structure.kinds;

import ru.finstream.structure.classes.*;
/**
 * Created by pav on 08.12.2015.
 */
public class Horse extends Mammal {

    /**
     * Ћощадь дл¤ езды
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
