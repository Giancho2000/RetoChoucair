package co.com.choucair.certification.retopractico.task;

import co.com.choucair.certification.retopractico.userinterface.JoinUtestPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Join implements Task{

    public static Join the() { return Tasks.instrumented(Join.class); }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(JoinUtestPage.BUTTON_JN)
        );
    }
}
