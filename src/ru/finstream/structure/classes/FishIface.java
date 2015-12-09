package ru.finstream.structure.classes;

/**
 * Created by pav on 08.12.2015.
 */
public interface FishIface {

    enum enumWhereIsHome {River,See,Ocean};

    public boolean setWhereIsHome(enumWhereIsHome value);

    public enumWhereIsHome getWhereIsHome();

}
