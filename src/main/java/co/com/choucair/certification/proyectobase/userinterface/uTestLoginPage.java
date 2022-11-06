package co.com.choucair.certification.proyectobase.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class uTestLoginPage extends PageObject {
    public static final Target LOGIN_BUTTON = Target.the("button that shows us the form to login").located(By.xpath("/html/body/ui-view/unauthenticated-container/div/div/unauthenticated-header/div/div[3]/ul[2]/li[2]/a"));
    public static final Target INPUT_FIRST_NAME = Target.the("text field to fill the names").located(By.id("firstName"));
    public static final Target INPUT_LAST_NAME = Target.the("text field to fill the last names").located(By.id("lastName"));
    public static final Target INPUT_EMAIL = Target.the("text field to fill the email").located(By.id("email"));
    public static final Target INPUT_BIRTH_MONTH = Target.the("text field to fill the birthday month").located(By.xpath("//*[@id=\"birthMonth\"]/option[10]"));
    public static final Target INPUT_BIRTH_DAY = Target.the("text field to fill the birthday day").located(By.xpath("//*[@id=\"birthDay\"]/option[31]"));
    public static final Target INPUT_BIRTH_YEAR = Target.the("text field to fill the birthday year").located(By.xpath("//*[@id=\"birthYear\"]/option[7]"));
    public static final Target BUTTON_NEXT_FORM = Target.the("button to continue filling in the form").located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[2]/a"));

    public static final Target POSTAL_CODE = Target.the("text field text postal code").located(By.id("zip"));
    public static final Target COUNTRY_CLICK = Target.the("text field text country").located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[1]/div[4]/div[2]/div/div/div[1]/span"));
    public static final Target COUNTRY_ENTER = Target.the("text field text country").located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[1]/div[4]/div[2]/div/div/input[1]"));
    public static final Target BUTTON_NEXT_FORM1 = Target.the("button to continue filling in the form").located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[2]/div/a"));

    public static final Target SO_COMPUTER_CLICK = Target.the("dropdown field to fill the SO").located(By.xpath("//*[@id=\"web-device\"]/div[1]/div[2]/div/div[1]/span"));
    public static final Target SO_COMPUTER_INPUT = Target.the("text field to fill the SO").located(By.xpath("//*[@id=\"web-device\"]/div[1]/div[2]/div/input[1]"));
    public static final Target SO_COMPUTER_CLICK_DROPDOWN = Target.the("click field to fill the OS").located(By.xpath("//*[@id=\"ui-select-choices-row-3-0\"]/span/div"));
    public static final Target VERSION_CLICK = Target.the("dropdown field to fill the version computer").located(By.xpath("//*[@id=\"web-device\"]/div[2]/div[2]/div/div[1]/span"));
    public static final Target VERSION_INPUT = Target.the("text field to fill the version computer").located(By.xpath("//*[@id=\"web-device\"]/div[2]/div[2]/div/input[1]"));
    public static final Target VERSION_CLICK_DROPDOWN = Target.the("click field to fill the version computer").located(By.xpath("//*[@id=\"ui-select-choices-row-4-0\"]/span/div"));
    public static final Target LANGUAJE_CLICK = Target.the("dropdown field to fill the language").located(By.xpath("//*[@id=\"web-device\"]/div[3]/div[2]/div/div[1]/span"));
    public static final Target LANGUAJE_INPUT = Target.the("text field to fill the language").located(By.xpath("//*[@id=\"web-device\"]/div[3]/div[2]/div/input[1]"));
    public static final Target LANGUAJE_CLICK_DROPDOWN = Target.the("click field to fill the language").located(By.xpath("//*[@id=\"ui-select-choices-row-5-0\"]/span/div"));
    public static final Target MOBILE_DEVICE_CLICK = Target.the("dropdown field to fill mobile device").located(By.xpath("//*[@id=\"mobile-device\"]/div[1]/div[2]/div/div[1]/span"));
    public static final Target MOBILE_DEVICE_INPUT = Target.the("text field to fill the mobile device").located(By.xpath("//*[@id=\"mobile-device\"]/div[1]/div[2]/div/input[1]"));
    public static final Target MOBILE_DEVICE_INPUT_DROPDOWN = Target.the("click field to fill the mobile device").located(By.xpath("//*[@id=\"ui-select-choices-row-6-0\"]/span"));
    public static final Target MOBILE_MODEL_DEVICE_CLICK = Target.the("dropdown field to fill model of the mobile device").located(By.xpath("//*[@id=\"mobile-device\"]/div[2]/div[2]/div/div[1]/span"));
    public static final Target MOBILE_MODEL_DEVICE_INPUT = Target.the("text field to fill the model of the mobile device").located(By.xpath("//*[@id=\"mobile-device\"]/div[2]/div[2]/div/input[1]"));
    public static final Target MOBILE_MODEL_DEVICE_INPUT_DROPDOWN = Target.the("click field to fill the model of the mobile device").located(By.xpath("//*[@id=\"ui-select-choices-row-7-0\"]/span"));
    public static final Target MOBILE_OS_DEVICE_CLICK = Target.the("dropdown field to fill os of the mobile device").located(By.xpath("//*[@id=\"mobile-device\"]/div[3]/div[2]/div/div[1]/span"));
    public static final Target MOBILE_OS_DEVICE_INPUT = Target.the("text field to fill the os of the mobile device").located(By.xpath("//*[@id=\"mobile-device\"]/div[3]/div[2]/div/input[1]"));
    public static final Target MOBILE_OS_DEVICE_INPUT_DROPDOWN = Target.the("click field to fill the OS of the mobile device").located(By.xpath("//*[@id=\"ui-select-choices-row-8-0\"]/span"));
    public static final Target BUTTON_NEXT_FORM2 = Target.the("button to continue filling in the form").located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/div[2]/div/a"));

    public static final Target INPUT_CREATE_PASSWORD = Target.the("text field to fill the password").located(By.id("password"));
    public static final Target INPUT_CONFIRM_PASSWORD = Target.the("text field to fill the confirm the password").located(By.id("confirmPassword"));
    public static final Target BUTTON_TERMS_OF_USE = Target.the("button to accept terms of use").located(By.id("termOfUse"));
    public static final Target BUTTON_PRIVACY = Target.the("button to accept privacy Settings").located(By.id("privacySetting"));
    public static final Target BUTTON_COMPLETE_SETUP = Target.the("button to accept privacy Settings").located(By.id("laddaBtn"));




}
