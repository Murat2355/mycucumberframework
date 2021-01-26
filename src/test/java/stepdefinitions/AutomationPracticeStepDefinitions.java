package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import pages.AutomationPracticePage;
import utilities.ConfigReader;
import utilities.Driver;

public class AutomationPracticeStepDefinitions {
    AutomationPracticePage automationPracticePage=new AutomationPracticePage();
    Actions actions=new Actions(Driver.getDriver());
    @Then("Ap sign_in tusuna tiklar")
    public void ap_sign_in_tusuna_tiklar() {
        automationPracticePage.signInButton.click();
    }

    @And("ap email kutusuna email bilgisi yazar")
    public void ap_email_kutusuna_email_bilgisi_yazar() {
        automationPracticePage.emailTextBox.sendKeys(ConfigReader.getProperty("Ap_email"));
    }

    @Then("ap create an account tusuna basar")
    public void ap_create_an_account_tusuna_basar() {
        automationPracticePage.createAnAccountButton.click();
    }

    @Then("ap cinsiyet secer")
    public void ap_cinsiyet_secer() {
        automationPracticePage.title.click();
    }

    @Then("ap isim girer")
    public void ap_isim_girer() {
        automationPracticePage.firstName.sendKeys(ConfigReader.getProperty("Ap_isim"));
    }

    @Then("ap soyisim girer")
    public void ap_soyisim_girer() {
        automationPracticePage.lastName.sendKeys(ConfigReader.getProperty("Ap_soyisim"));
    }



    @Then("ap password girer")
    public void ap_password_girer() {
        automationPracticePage.password.sendKeys(ConfigReader.getProperty("Ap_password"));
    }

    @Then("pagedown tusuna basar")
    public void pagedown_tusuna_basar() {
        actions.sendKeys(Keys.PAGE_DOWN).perform();
    }

    @Then("ap gun secer")
    public void ap_gun_secer() {

        Select select=new Select(automationPracticePage.days);
        select.selectByValue("3");

    }

    @Then("ap ay secer")
    public void ap_ay_secer() {
        Select select=new Select(automationPracticePage.months);
        select.selectByValue("5");
    }

    @Then("ap yil secer")
    public void ap_yil_secer() {
        Select select=new Select(automationPracticePage.years);
        select.selectByValue("1997");
    }

    @Then("ap adres isim yazar")
    public void ap_adres_isim_yazar() {
        automationPracticePage.adresFirstName.sendKeys(ConfigReader.getProperty("Ap_isim"));
    }

    @Then("ap adres soyisim yazar")
    public void ap_adres_soyisim_yazar() {
        automationPracticePage.adresLastName.sendKeys(ConfigReader.getProperty("Ap_soyisim"));
    }

    @Then("ap sirket ismi yazar")
    public void ap_sirket_ismi_yazar() {
        automationPracticePage.company.sendKeys(ConfigReader.getProperty("Ap_sirket"));
    }

    @Then("ap adress yazar")
    public void ap_adress_yazar() {
        automationPracticePage.address.sendKeys(ConfigReader.getProperty("Ap_adres"));
    }

    @Then("ap adress2 yazar")
    public void ap_adress2_yazar() {
        automationPracticePage.secondAdress.sendKeys(ConfigReader.getProperty("Ap_adres2"));
    }

    @Then("ap adres sehir yazar")
    public void ap_adres_sehir_yazar() {
        automationPracticePage.city.sendKeys(ConfigReader.getProperty("Ap_city"));
    }

    @Then("ap state dropdown secer")
    public void ap_state_dropdown_secer() {
        Select select=new Select(automationPracticePage.state);
        select.selectByVisibleText("Alaska");
    }

    @Then("ap adres zip kod yazar")
    public void ap_adres_zip_kod_yazar() {
        automationPracticePage.zipCode.sendKeys(ConfigReader.getProperty("Ap_zip"));
    }

    @Then("ap country dropdown secer")
    public void ap_country_dropdown_secer() {
        Select select=new Select(automationPracticePage.country);
        select.selectByVisibleText("United States");
    }

    @Then("bilgi ekleme yapar")
    public void bilgi_ekleme_yapar() {
        automationPracticePage.additionalInformation.sendKeys(ConfigReader.getProperty("Ap_aditional"));
    }

    @Then("home phone yazar")
    public void home_phone_yazar() {
        automationPracticePage.homePhone.sendKeys(ConfigReader.getProperty("Ap_home_phone"));
    }

    @Then("reference alanini temizler")
    public void reference_alanini_temizler() {
        automationPracticePage.reference.clear();
    }

    @Then("reference yazar")
    public void reference_yazar() {
        automationPracticePage.reference.sendKeys(ConfigReader.getProperty("Ap_referance"));
    }

    @Then("ap register butonuna basar")
    public void ap_register_butonuna_basar() {
        automationPracticePage.registerButton.click();
    }

}
