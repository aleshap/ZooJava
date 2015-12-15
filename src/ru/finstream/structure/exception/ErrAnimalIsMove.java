package ru.finstream.structure.exception;

/**
 * Created by Mike Kopylov on 15.12.15 10:21.
 *
 * @author mike@jetmoney.ru
 */
public class ErrAnimalIsMove extends Exception{
    public ErrAnimalIsMove() {};
    public ErrAnimalIsMove(String msg) {
        super(msg);
    };
};

