package main.airport.entry;

import main.airport.creator.Creator;
import main.airport.entity.Passenger;
import main.airport.pool.PlanePool;
/*
* Аэропорт. Посадка/высадка пассажиров может осуществляться через конечное число терминалов и наземным способом через \
* конечное число трапов. Самолеты бывают разной вместимости и дальности полета. Организовать функционирование
*  аэропорта, если пунктов назначения 4–6, и зон
* дальности 2–3
 */
public class Main {

  public static void main(String[] args) {
    PlanePool pool = new PlanePool();
    pool.addToPool(Creator.createAirport0());
    pool.addToPool(Creator.createAirport1());
    pool.addToPool(Creator.createAirport2());

    for (int i = 0; i < 200; i++) {
      new Passenger(pool).start();
    }

  }

}
