package ru.finstream.structure;

import ru.finstream.typesof.gps;

/**
 * [03.12.2015 12:51:18] Mike  Kopylov: Для начала строим иерархию животных -
 * освнова - зоологическая классификация (млекопитающие, пресмыкающиеся etc) + морфологическая -
 * количество ног, плавает ходит летает
 [03.12.2015 12:52:15] Mike  Kopylov: Особо разбегаться смысла нет - ограничиваемся 5 - 8 конкретными классами
 (самыми низшими в иерархии). ОБязательно использование интерфейсов  и абстрактных классов
 * Created by pav on 04.12.2015.
 */
abstract public class Animal implements AnimalIface {

    /**
     * Кушать
     * @param product - Продукцт
     * @return - true \ false - Животное наелось
     */
    public boolean eat(String product){
     return true;
    };

    /**
     * Перемещать
     * @param point - Координаты
     * @return - true \ false - Успешно
     */
    public boolean move(gps point) {
      return true;
    };


    /**
     * Спать
     * @param time - продолжительность
     * @return - true \ false - Успешно
     */
    public boolean sleep(int time){
     return true;
    }

}
