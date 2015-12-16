package ru.finstream.domain;

import ru.finstream.structure.exception.ErrAnimalIsEat;
import ru.finstream.structure.exception.ErrAnimalIsMove;
import ru.finstream.structure.exception.ErrAnimalIsSleep;
import ru.finstream.typesof.gps;

/**
 * Created by pav on 08.12.2015.
 */
public interface AnimalIface {

    /**
     * Кушать
     *
     * @param product - Продукцт
     * @return - true \ false - Животное наелось
     */
    boolean eat(String product) throws ErrAnimalIsSleep, ErrAnimalIsMove;

    /**
     * Перемещать
     *
     * @param point - Координаты
     * @return - true \ false - Успешно
     */
    boolean move(gps point) throws ErrAnimalIsSleep, ErrAnimalIsEat;

    /**
     * Спать
     *
     * @param time - продолжительность
     * @return - true \ false - Успешно
     */
    boolean sleep(int time) throws ErrAnimalIsMove, ErrAnimalIsEat;
}



