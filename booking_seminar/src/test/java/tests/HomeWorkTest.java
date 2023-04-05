package tests;

import org.junit.Test;
import pages.HomePage;
import pages.HotelSearchPage;


public class HomeWorkTest extends BaseTest {

    @Test()
    public void Test() {
        String cityName = "Будапешт";
     //   int countStars = 5;

        HomePage homePage = new HomePage();
        HotelSearchPage hotelSearchPage = new HotelSearchPage();

        homePage.openPage()
                .acceptCookies()
                .findByCity(cityName)
                .findByArrivalDate()
                .findByDateOfDeparture();

        hotelSearchPage.showOnTheMap()
                .chooseGeoPosition();

     //   hotelCardPage.checkCorrectData();
      //          .setStars(countStars)
      //          .checkThatAllHotelsHaveStars(countStars);
    }
}


