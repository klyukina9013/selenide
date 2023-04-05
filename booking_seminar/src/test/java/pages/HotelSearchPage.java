package pages;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class HotelSearchPage {
    // мое
    private final By SHOW_ON_THE_MAP = By.xpath("//span[@class=\"fc63351294 a822bdf511 d4b6b7a9e7 f7db01295e c334e6f658 f4605622ad d2c52b10ce\"]");
    private final By IMAGE = By.xpath("(//div[@class=\"map-card__image\"])[1]");
  //  private final By HOTEL = By.xpath("//span[@class=\"map-card__title-link\"]");
   // private final String nameOfHotel = "span.map-card__title-link";
  //  private final String ratingOfHotel = "div.bui-review-score__badge";
  //  private final String reviewsOfHotel = "div.bui-review-score__text";
  //  private final String costOfHotel = "span.prco-valign-middle-helper";
 //   private final String costOfHotel = "span.bui-rating.bui-rating--smaller";
  //  private final String stars = "span.bui-rating.bui-rating--smaller";
    private final By GEO_POSITION = By.xpath("//div[@class=\"hotel-marker hotel-marker--likable\"]");




    // пример
  /*private final By SEARCH_LABEL = By.xpath("//h1");
    private final By LOADING_BOX = By.cssSelector("[data-testid='overlay-card']");
    private final By CHECK_BOX = By.cssSelector(".bbdb949247");
    private final By FIELD_WITH_STARS = By.cssSelector("[data-testid='rating-stars']");
    private final By STAR = By.cssSelector("span");

    private final String COUNT_STARS_CHECKBOX = "[data-filters-item='class:class=%s']";

    public SearchPage checkLabel(String label) {
        $(SEARCH_LABEL).shouldHave(text(label));
        return this;
    }

    public SearchPage setStars(int count) {
        $(String.format(COUNT_STARS_CHECKBOX, count)).$(CHECK_BOX).click();
        waitUntilPageLoaded();
        return this;
    }

    private SearchPage waitUntilPageLoaded() {
        $(LOADING_BOX).shouldBe(visible, Duration.ofSeconds(20)).shouldBe(Condition.not(visible), Duration.ofSeconds(20));
        return this;
    }

    public SearchPage checkThatAllHotelsHaveStars(int countOfStars) {
        ElementsCollection allElements = $$(FIELD_WITH_STARS);
        for (SelenideElement selenideElement : allElements) {
            ElementsCollection allStars = selenideElement.findAll(STAR);
            allStars.shouldHave(CollectionCondition.size(countOfStars));
        }
        return this;
    } */

    //мое
    public HotelSearchPage showOnTheMap() {
        $(SHOW_ON_THE_MAP).click();
     //   $(IMAGE).shouldBe(visible, Duration.ofSeconds(10));
        return this;
    }

  //  public HotelSearchPage chooseFirstHotel() {
  //      $(HOTEL).click();
       // $(NAME_OF_HOTEL).shouldHave(text("Dunapest Apartman"));
    //    return this;
    //}

    public HotelSearchPage chooseGeoPosition() {
        $(GEO_POSITION).click();
        return this;
    }


}