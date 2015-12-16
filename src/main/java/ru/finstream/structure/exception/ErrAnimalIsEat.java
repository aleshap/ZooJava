package ru.finstream.structure.exception;

/**
 * Created by Mike Kopylov on 15.12.15 10:19.
 *
 * @author mike@jetmoney.ru
 */
public class ErrAnimalIsEat extends Exception {
    public ErrAnimalIsEat() {
    }

    public ErrAnimalIsEat(String msg) {
        super(msg);
    };
}

