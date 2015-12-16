package ru.finstream.domain.family;

/**
 * Created by Mike Kopylov on 15.12.15 10:23.
 *
 * @author mike@jetmoney.ru
 */
public interface BirdIface {

    boolean setColor(String value);

    String getColor();

    boolean setSize(int value);

    int getSize();

    boolean setIsSing(boolean value);

    boolean getIsSing();

}