package starter.PageObject;
/*
 **@Autor: gequintero
 */
import org.openqa.selenium.By;

public class FormInputPage {

    public static By inputInteres = By.xpath("//input[@id='interes']");
    public static By listPeriodicidad = By.xpath("//select[@id='periodicidad-deseada']");
    public static By selectPeriodicidadSemestrail = By.xpath("//body/div[@id='main-content']/div[2]/div[2]/section[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/select[1]/option[3]");
    public static By selectCapitalizacionAnual = By.xpath("//body/div[@id='main-content']/div[2]/div[2]/section[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/select[1]/option[2]");
    public static By lblResult = By.xpath(" //h3[@id='respuesta']");


}
