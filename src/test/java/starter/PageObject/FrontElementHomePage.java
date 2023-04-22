package starter.PageObject;
/*
 **@Autor: gequintero
 */
import org.openqa.selenium.By;

public class FrontElementHomePage {

    public static By lblNegocios = By.xpath("//a[@id='header-pymes']");
    public static By lblHerramientas = By.xpath("//header/section[1]/div[3]/div[1]/nav[1]/ul[1]/li[4]/a[1]");

    public static By btnNext = By.xpath("//i[contains(text(),'arrow2-right')]");

    public static By btnGestionarFinanzas = By.xpath("//a[contains(text(),'Gestionar las finanzas de mi negocio')]");
    public static By btnTasaDeInteres = By.xpath("//h5[contains(text(),'Convertidor de tasas de interés')]");
    public static By btnCalcular = By.xpath("//div[@id='btntoolUno']");

}
