package tests;

import org.junit.Test;
import pages.HomePage;


public class MyOwnTest extends BaseTest {

    @Test()
    public void Test2() {
        String placeName = "Пхукет";

        HomePage homePage = new HomePage();

        //зайти на сайт Booking.com
        //Место получения: Вильнюс
        //Дата получения: 10 апреля
        //Дата отъезда: 17 апреля
        homePage.openPage()
                .acceptCookies()
                .findByCity(placeName)
                .findByArrivalDate()
                .findByDateOfDeparture();

        //Место получения: Вильнюс
        //Дата и время получения: 17 апреля 12:00
        //Дата и время возврата: 21 апреля 10:00

    }
}



