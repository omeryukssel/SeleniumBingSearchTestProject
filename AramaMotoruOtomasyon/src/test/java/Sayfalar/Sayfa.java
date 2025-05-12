package Sayfalar;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Sayfa {
    WebDriver driver;

    public Sayfa(WebDriver driver) {
        this.driver = driver;
    }

   public void elemanGozukeneKadarBekleName(String name){
       WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20L));
       wait.until(ExpectedConditions.elementToBeClickable(By.name(name)));

   }

    public void elemanGozukeneKadarBekleNameCss(String name){
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(50L));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(name)));

    }

   public void tikla(String name){
        driver.findElement(By.name(name)).click();
   }

   public void yaziYaz(String name,String yazi){
        driver.findElement(By.name(name)).sendKeys(yazi);
   }

public void klavyeTusunaBas(String name, Keys klavyeTusu){
        driver.findElement(By.name(name)).sendKeys(klavyeTusu);
}

public void sonucBasliklariniCek(String cssName){
        java.util.List<WebElement> sonuclar=driver.findElements(By.cssSelector(cssName));

        for (int i=0;i<Math.min(sonuclar.size(),5);i++){
            System.out.println((i+1)+". Başlık: "+ sonuclar.get(i).getText());
        }
}




}
