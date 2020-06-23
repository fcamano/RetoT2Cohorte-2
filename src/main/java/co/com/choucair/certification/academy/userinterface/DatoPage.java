package co.com.choucair.certification.academy.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class DatoPage extends PageObject {
   public static final Target INPUT_FIRSTNAME= Target.the("nombre")
            .located(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[1]/input"));

    public static final Target INPUT_LASTNAME= Target.the("nombre")
            .located(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[2]/input"));

    public static final Target INPUT_ADDRESS= Target.the("nombre")
            .located(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[2]/div/textarea"));

    public static final Target INPUT_EMAIL= Target.the("CORREO")
            .located(By.xpath("//*[@id=\"eid\"]/input"));

    public static final Target INPUT_NUMBER= Target.the("NUMERO")
            .located(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[4]/div/input"));
    public static final Target CHECK_GENDER = Target.the("where do we write the gender")
            .located(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[5]/div/label[1]"));

    public static final Target CHECK_HOBBIES = Target.the("Hobbies")
            .located(By.xpath("//*[@id=\"checkbox2\"]"));
    public static final Target CHECK_LANGUAGE1 = Target.the("languge")
            .located(By.xpath("//form[@id='basicBootstrapForm']/div[7]/div/multi-select/div"));
 public static final Target CHECK_SKILLCLICK = Target.the("Skill")
         .located(By.xpath("//form[@id='basicBootstrapForm']/div[8]/div/select"));

   public static final Target CHECK_COUNTRY = Target.the("CIUDAD")
         .located(By.id("countries"));

 public static final Target CHECK_SELECTCOUNTRY = Target.the("CIUDAD")
         .located(By.id("country"));
   public static final Target OPTION_YEAR = Target.the("where do we write the option sele year")
           .located(By.id("yearbox"));
 public static final Target OPTION_MONTH = Target.the("where do we write the option sele month")
         .located(By.xpath("//form[@id='basicBootstrapForm']/div[11]/div[2]/select"));
 public static final Target OPTION_DAY = Target.the("where do we write the option sele day")
         .located(By.id("daybox"));
 public static final Target INPUT_PASSWORD = Target.the("where do we write the password")
         .located(By.id("firstpassword"));
 public static final Target INPUT_CONFIRPASSWORD = Target.the("where do we write the confir password")
         .located(By.id("secondpassword"));
 public static final Target ENTER_BUTTON = Target.the("where do we write the confir password")
         .located(By.id("submitbtn"));

}
