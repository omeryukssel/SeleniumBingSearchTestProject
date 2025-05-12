package Testler;

import Sayfalar.AnaSayfa;
import Sayfalar.AramaSayfasi;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class AramaMotoruTest {
    private WebDriver driver;
    private AnaSayfa anaSayfa;
    private AramaSayfasi aramaSayfasi;

    @BeforeEach
    void setup(){

        driver=new ChromeDriver();
        driver.manage().window().maximize();
        anaSayfa=new AnaSayfa(driver);
        aramaSayfasi=new AramaSayfasi(driver);
        driver.get("https://bing.com");

    }



    @Test
    void bingTest() throws InterruptedException {

        anaSayfa.elemanGozukeneKadarBekleName(anaSayfa.searchBox);

        anaSayfa.tikla(anaSayfa.searchBox);

        anaSayfa.yaziYaz(anaSayfa.searchBox,"Selenium Java");

        anaSayfa.klavyeTusunaBas(anaSayfa.searchBox, Keys.ENTER);

        aramaSayfasi.elemanGozukeneKadarBekleNameCss(aramaSayfasi.baslik);

        aramaSayfasi.sonucBasliklariniCek(aramaSayfasi.baslik);


    }

    @AfterEach
    void tearDown(){
        driver.close();

    }


}
