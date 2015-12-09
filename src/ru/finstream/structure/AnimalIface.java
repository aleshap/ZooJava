package ru.finstream.structure;

import ru.finstream.typesof.*;
/**
 * Created by pav on 08.12.2015.
 */
public interface AnimalIface {

    /**
     * Кушать
     * @param product - Продукцт
     * @return - true \ false - Животное наелось
     */
    public boolean eat(String product) throws ErrAnimalsIsSleep,ErrAnimalsIsMove;

    /**
     * Перемещать
     * @param point - Координаты
     * @return - true \ false - Успешно
     */
    public boolean move(gps point)  throws ErrAnimalsIsSleep,ErrAnimalsIsEat;

    /**
     * Спать
     * @param time - продолжительность
     * @return - true \ false - Успешно
     */
    public boolean sleep(int time) throws ErrAnimalsIsMove,ErrAnimalsIsEat;

};

class ErrAnimalsIsSleep extends Exception{
   private int howLong;
   public ErrAnimalsIsSleep() {};
   public ErrAnimalsIsSleep(String msg,int howLong) {
       super(msg);
       this.howLong=howLong;
   };
   public int howLongGet() {
        return this.howLong;
   }
   public String getMessage() {
        return super.getMessage();
   }
};

class ErrAnimalsIsEat extends Exception {
    public ErrAnimalsIsEat() {
    };

    public ErrAnimalsIsEat(String msg) {
        super(msg);
    };
};

class ErrAnimalsIsMove extends Exception{
    public ErrAnimalsIsMove() {};
    public ErrAnimalsIsMove(String msg) {
        super(msg);
    };
};




