package ru.finstream.structure.exception;

/**
 * Created by Mike Kopylov on 15.12.15 10:18.
 *
 * @author mike@jetmoney.ru
 */
public class ErrAnimalIsSleep extends Exception {
    private int howLong;

    public ErrAnimalIsSleep() {
    }

    public ErrAnimalIsSleep(String msg, int howLong) {
        super(msg);
        this.howLong = howLong;
    }

    public int howLongGet() {
        return this.howLong;
    }

    public String getMessage() {
        return super.getMessage();
    }
}