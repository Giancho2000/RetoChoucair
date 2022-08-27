package co.com.choucair.certification.retopractico.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class JoinUtestPage extends PageObject{

    public static final Target BUTTON_JN = Target.the("Click on the button Join Today")
            .located(By.xpath("//a[@class='unauthenticated-nav-bar__sign-up']"));
}
