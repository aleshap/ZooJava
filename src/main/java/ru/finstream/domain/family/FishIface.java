package ru.finstream.domain.family;

/**
 * Created by pav on 08.12.2015.
 */
public interface FishIface {

    enum WhereIsHome {River,See,Ocean};

    boolean setWhereIsHome(WhereIsHome value);

    WhereIsHome getWhereIsHome();
}
