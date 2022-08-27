package co.com.choucair.certification.retopractico.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SuscribeUtestPage extends PageObject{
    public static final Target INPUT_NAME = Target.the("Put the name into the input")
            .located(By.id("firstName"));

    public static final Target INPUT_LAST_NAME = Target.the("Put the Lastname into the input")
            .located(By.id("lastName"));

    public static final Target INPUT_EMAIL = Target.the("Put the Email into the input")
            .located(By.id("email"));

    public static final Target INPUT_MONTH = Target.the("Put the Month into the input")
            .located(By.id("birthMonth"));

    public static final Target INPUT_DAY = Target.the("Put the day into the input")
            .located(By.id("birthDay"));

    public static final Target INPUT_YEAR = Target.the("Put the year into the input")
            .located(By.id("birthYear"));

    /*public static final Target INPUT_LENGUAJES = Target.the("Click on the button Join Today")
            .located(By.xpath("//input[@class='ui-select-search']"));*/

    public static final Target NEXT_LOCATION = Target.the("Click on the button next location")
            .located(By.xpath("//a[@class='btn btn-blue']"));

    public static final Target CITY = Target.the("fill the input City")
            .located(By.id("city"));

    public static final Target CITY_TWO = Target.the("Select the city")
            .located(By.xpath("//input[@ng-model='registrationData.city']"));



    public static final Target STATE = Target.the("Select the state")
            .located(By.xpath("//span[@class='ui-select-match-text']"));


    public static final Target POSTAL_CODE = Target.the("Put the postal code")
            .located(By.id("zip"));


    public static final Target COUNTRY = Target.the("Select the contry into the input")
            .located(By.xpath("//div[@class='ui-select-match']"));

    public static final Target NEXT_DEVICES = Target.the("Click on the button Next device")
            .located(By.xpath("//a[@class='btn btn-blue']"));

}
