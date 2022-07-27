package hepsiburada.tests;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.aspectj.lang.annotation.After;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class SampleTest{
    private AndroidDriver driver;
    public WebDriverWait wait;

    private final By closedAdvert = By.id("com.pozitron.hepsiburada:id/com_braze_inappmessage_modal_close_button");
    private final By location = By.id("com.pozitron.hepsiburada:id/textViewTitle");
    private final By citySelector = By.id("com.pozitron.hepsiburada:id/citySelectorView");
    private final By city = By.xpath("//android.widget.TextView[@content-desc=\"İlçe seçin\"]");
    private final By townSelector = By.id("com.pozitron.hepsiburada:id/townSelectorView");
    private final By town = By.xpath("//android.widget.TextView[@content-desc=\"Mahalle seçin\"]");
    private final By districtSelector = By.id("com.pozitron.hepsiburada:id/districtSelectorView");
    private final By district = By.id("com.pozitron.hepsiburada:id/tvOneProvinceSelectBox");
    private final By locationSaveBtn = By.id("com.pozitron.hepsiburada:id/button");
    private final By categoryBtn = By.id("com.pozitron.hepsiburada:id/nav_graph_category");
    private final By androidPhone_category = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/androidx.cardview.widget.CardView/android.widget.ImageView");
    private final By xiaomi_phone = By.xpath("//android.widget.ImageView[@content-desc=\"xiaomi\"]");




    @Given("Uygulama acilir")
    public void uygulamaAcilir() throws MalformedURLException, InterruptedException {
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability("platformName", "Android");
        desiredCapabilities.setCapability("appium:platformVersion", "11 RP1A.200720.011");
        desiredCapabilities.setCapability("appium:deviceName", "Redmi Note 8 Pro");
        desiredCapabilities.setCapability("appium:automationName", "UIAutomator2");
        desiredCapabilities.setCapability("appium:udid", "wos4w4rojfbugqs4");
        desiredCapabilities.setCapability("appium:app", "C:\\Users\\Dell\\Documents\\MOBVEN\\apk\\Hepsiburada_ Online Alışveriş_5.4.0_apkcombo.com.apk");
        desiredCapabilities.setCapability("appium:autoGrantPermissions", true);

        driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"),desiredCapabilities);
        wait = new WebDriverWait(driver,15);
        driver.manage().timeouts().implicitlyWait(15000, TimeUnit.SECONDS);
    }

    @When("Anasayfada Konum alanina tiklanir")
    public void anasayfadaKonumAlaninaTiklanir() throws InterruptedException {
        Thread.sleep(15000);
        wait.until(ExpectedConditions.visibilityOfElementLocated(closedAdvert)).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(location)).click();
    }

    @And("Il ilce ve mahalle secilir ve kaydet butonuna tiklanir")
    public void ilIlceVeMahalleSecilirVeKaydetButonunaTiklanir() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(citySelector)).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(city)).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(townSelector)).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(town)).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(districtSelector)).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(district)).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(locationSaveBtn)).click();
    }

    @And("Tab bar uzerinden kategoriler tabina tiklanir")
    public void tabBarUzerindenKategorilerTabinaTiklanir(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(categoryBtn)).click();
    }

    @And("Herhangi bir kategori secilip listeleme sayfasina yonlendirilir")
    public void herhangiBirKategoriSecilipListelemeSayfasinaYonlendirilir() throws InterruptedException {
        Thread.sleep(10000);
        wait.until(ExpectedConditions.visibilityOfElementLocated(androidPhone_category)).click();
    }

    @Then("Secilen urun kategorisinin listelendigi gorulur")
    public void secilenUrunKategorisininListelendiğiGorulur() throws InterruptedException {
        wait.until(ExpectedConditions.visibilityOfElementLocated(xiaomi_phone)).click();
        Thread.sleep(10000);
    }

    @After("Then")
    public void tearDown(){
        driver.quit();
    }

}
