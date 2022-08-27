package co.com.choucair.certification.retopractico.task;

import co.com.choucair.certification.retopractico.userinterface.JoinUtestPage;
import co.com.choucair.certification.retopractico.userinterface.SuscribeUtestPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.MoveMouseToBy;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

public class Suscribe implements Task {

    public static Suscribe in() { return Tasks.instrumented(Suscribe.class); }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue("Giancarlo").into(SuscribeUtestPage.INPUT_NAME),
                Enter.theValue("Reina").into(SuscribeUtestPage.INPUT_LAST_NAME),
                Enter.theValue("Greina@test.com").into(SuscribeUtestPage.INPUT_EMAIL),
                SelectFromOptions.byVisibleText("September").from(SuscribeUtestPage.INPUT_MONTH),
                SelectFromOptions.byVisibleText("5").from(SuscribeUtestPage.INPUT_DAY),
                SelectFromOptions.byVisibleText("1997").from(SuscribeUtestPage.INPUT_YEAR),
                //SelectFromOptions.byVisibleText("Spanish").from(SuscribeUtestPage.INPUT_LENGUAJES),
                Click.on(SuscribeUtestPage.NEXT_LOCATION)

                /*Enter.theValue("Bogota").into(SuscribeUtestPage.CITY),
                Click.on(SuscribeUtestPage.CITY_TWO),
                SelectFromOptions.byVisibleText("Washington D.C").from(SuscribeUtestPage.CITY_TWO),
                SelectFromOptions.byVisibleText("Colorado").from(SuscribeUtestPage.STATE),
                Enter.theValue("00000").into(SuscribeUtestPage.POSTAL_CODE),
                SelectFromOptions.byVisibleText("United States").from(SuscribeUtestPage.COUNTRY),
                Click.on(SuscribeUtestPage.NEXT_DEVICES)*/


        );
    }
}
