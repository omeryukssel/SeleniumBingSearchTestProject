package Sayfalar;

import org.openqa.selenium.WebDriver;

public class AnaSayfa extends Sayfa {

    public final String searchBox="q";

    public AnaSayfa(WebDriver driver) {
        super(driver);
    }
}
