package co.com.choucair.certification.proyectobase.tasks;

import co.com.choucair.certification.proyectobase.userinterface.uTestLoginPage;
import co.com.choucair.certification.proyectobase.userinterface.uTestPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.rest.interactions.Ensure;

import javax.naming.directory.Attribute;
import javax.swing.text.html.HTML;

public class Login implements Task {

    public static Login onThePage() {
        return Tasks.instrumented(Login.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(uTestLoginPage.LOGIN_BUTTON),
                Enter.theValue("MANUEL SANTIAGO").into(uTestLoginPage.INPUT_FIRST_NAME),
                Enter.theValue("CASTILLO PALACIO").into(uTestLoginPage.INPUT_LAST_NAME),
                Enter.theValue("MANUECssASTILLO222PALAsCIOssss@GMAIL.COM").into(uTestLoginPage.INPUT_EMAIL),
                Click.on(uTestLoginPage.INPUT_BIRTH_MONTH), Click.on(uTestLoginPage.INPUT_BIRTH_DAY),
                Click.on(uTestLoginPage.INPUT_BIRTH_YEAR), Click.on(uTestLoginPage.BUTTON_NEXT_FORM),
                Enter.theValue("1111190").into(uTestLoginPage.POSTAL_CODE),
                Click.on(uTestLoginPage.COUNTRY_CLICK),
                Enter.theValue("Colombia").into(uTestLoginPage.COUNTRY_ENTER),
                Click.on(uTestLoginPage.BUTTON_NEXT_FORM1),
                Click.on(uTestLoginPage.SO_COMPUTER_CLICK),
                Enter.theValue("Windows").into(uTestLoginPage.SO_COMPUTER_INPUT),
                Click.on(uTestLoginPage.SO_COMPUTER_CLICK_DROPDOWN),
                Click.on(uTestLoginPage.VERSION_CLICK),
                Enter.theValue("Windows 11").into(uTestLoginPage.VERSION_INPUT),
                Click.on(uTestLoginPage.VERSION_CLICK_DROPDOWN),
                Click.on(uTestLoginPage.LANGUAJE_CLICK),
                Enter.theValue("Albanian").into(uTestLoginPage.LANGUAJE_INPUT),
                Click.on(uTestLoginPage.LANGUAJE_CLICK_DROPDOWN),
                Click.on(uTestLoginPage.MOBILE_DEVICE_CLICK),
                Enter.theValue("Motorola").into(uTestLoginPage.MOBILE_DEVICE_INPUT),
                Click.on(uTestLoginPage.MOBILE_DEVICE_INPUT_DROPDOWN),
                Click.on(uTestLoginPage.MOBILE_MODEL_DEVICE_CLICK),
                Enter.theValue("One (Motorola)").into(uTestLoginPage.MOBILE_MODEL_DEVICE_INPUT),
                Click.on(uTestLoginPage.MOBILE_MODEL_DEVICE_INPUT_DROPDOWN),
                Click.on(uTestLoginPage.MOBILE_OS_DEVICE_CLICK),
                Enter.theValue("Android 8.0.1").into(uTestLoginPage.MOBILE_OS_DEVICE_INPUT),
                Click.on(uTestLoginPage.MOBILE_OS_DEVICE_INPUT_DROPDOWN),
                Click.on(uTestLoginPage.BUTTON_NEXT_FORM2),
                Enter.theValue("Contrasenia_nueva1234").into(uTestLoginPage.INPUT_CREATE_PASSWORD),
                Enter.theValue("Contrasenia_nueva1234").into(uTestLoginPage.INPUT_CONFIRM_PASSWORD),
                Click.on(uTestLoginPage.BUTTON_TERMS_OF_USE),
                Click.on(uTestLoginPage.BUTTON_PRIVACY)
        );

        actor.attemptsTo();
    }
}
