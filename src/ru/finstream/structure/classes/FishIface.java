package ru.finstream.structure.classes;

/**
 * Created by pav on 08.12.2015.
 */
public interface FishIface {

    enum enumWhereIsHome {River,See,Ocean};

    boolean setWhereIsHome(enumWhereIsHome value);

    enumWhereIsHome getWhereIsHome();
}
