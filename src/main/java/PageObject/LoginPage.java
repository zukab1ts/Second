package PageObject;

import com.codeborne.selenide.commands.Val;
import com.codeborne.selenide.conditions.Attribute;
import com.codeborne.selenide.conditions.Value;
import com.codeborne.selenide.selector.ByAttribute;
import com.sun.jna.Structure;
import org.openqa.selenium.By;

import java.lang.reflect.Type;

import static com.codeborne.selenide.Selenide.$;

public class LoginPage {
    protected By

            emailField = By.id("inputEmail"),
            passwordField = By.name("password"),
            loginButton = By.id("login"),
            languageButton = By.xpath("//*[@id=\"nav-burger\"]/li/form/span/div/button"),
            promoCodeField = By.id("inputPromotionCode"),
            loginWithGmail = By.id("btnGoogleSignin1"),
            cartButton = By.xpath("//*[@id=\"header\"]/div[2]/div/div/ul/li[2]/a/i"),
            currencyButtonUSD = By.xpath("//*[@id=\"header\"]/div[2]/div/div/ul/li[1]/form/div/div/button"),
            getCurrencyButtonGEL = By.xpath("//*[@id=\"header\"]/div[2]/div/div/ul/li[1]/form/div/div/button"),
            knowledgeButton = By.xpath("//*[@id=\"Primary_Navbar-Knowledgebase\"]/a"),
            validateCodeButton = By.name("validatepromo");



}
