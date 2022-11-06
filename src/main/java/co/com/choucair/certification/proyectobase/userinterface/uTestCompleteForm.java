package co.com.choucair.certification.proyectobase.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class uTestCompleteForm extends PageObject {
    public static final Target FINALIZE_FORM = Target.the( "extract the name from the end ").located(By.xpath("//*[@id=\"mainContent\"]/div/div/div[1]/div/h1"));
}
