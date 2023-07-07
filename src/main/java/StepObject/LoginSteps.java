package StepObject;

import PageObject.LoginPage;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class LoginSteps extends LoginPage {
    WebDriver driver;
    public LoginSteps(WebDriver driver1) {
        driver = driver1;
    }
    @Step("ელ ფოსტის ჩაწერა")
    public void emailInput(String s) {
        driver.findElement(emailField).sendKeys(s);
    }
    @Step("პაროლის ჩაწერა")
    public void passwordInput(String s) {
        driver.findElement(passwordField).sendKeys(s);
    }
    @Step("ლოგინ ღილაკზე დაჭერა")
    public void loginButton() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(loginButton)).click();
    }
    @Step("ენის შეცვლა")
    public void changeLanguage (){
        driver.findElement(languageButton).click();
    }
    @Step("კალათაში დამატება")
    public void addCartButton (){
        driver.findElement(cartButton).click();
    }
    @Step("პრომო კოდის ჩაწერა")
    public void promoCode (String s){
        driver.findElement(promoCodeField).sendKeys(s);
    }
    @Step("ვალიდაციის ღილაკზე დაჭერა")
    public void validateCode (){
        driver.findElement(validateCodeButton).click();
    }
    @Step("Gmail-ით დალოგინება")
    public void gmailSign (){
        driver.findElement(loginWithGmail).click();
    }
    @Step("ვალუტის ცვლილება დოლარში")
    public void changeCurrency (){
        driver.findElement(currencyButtonUSD).click();
    }
    @Step("ვალუტის ცვლილება ლარში")
    public void changeCurrency1 (){
        driver.findElement(getCurrencyButtonGEL).click();
    }
    @Step("დოკუმენტაციის ნახვა")
    public void knowledgeBase (){
        driver.findElement(knowledgeButton).click();
    }

}