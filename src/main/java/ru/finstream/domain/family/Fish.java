package ru.finstream.domain.family;

import ru.finstream.structure.Animal;

/**
 * Created by pav on 07.12.2015.
 */
abstract public class Fish extends Animal implements FishIface {

    private FishIface.WhereIsHome WhereIsHome;

    public boolean setWhereIsHome(FishIface.WhereIsHome value){
        this.WhereIsHome=value;
        return true;
    };

    public FishIface.WhereIsHome getWhereIsHome(){
        return this.WhereIsHome;
    };

}


