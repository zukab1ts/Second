import StepObject.LoginSteps;
import Utils.ChromeRunner;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.apache.commons.logging.Log;
import org.testng.Assert;
import org.testng.annotations.Test;

import static DataObject.LoginData.*;

public class Login extends ChromeRunner {

    @Test (priority = 1)
    @Description("არასწორი მონაცემებით დალოგინება")
    @Severity(SeverityLevel.CRITICAL)
    public void loginWithIncorrectData() throws InterruptedException {
        LoginSteps step1 = new LoginSteps(ChromeRunner.driver);
        step1.emailInput(incorrectEmailData);
        step1.passwordInput(incorrectPasswordData);
        step1.loginButton();
        Thread.sleep(5000);
    }

    @Test (priority = 2)
    @Description("სწორი მონაცემებით დალოგინება")
    @Severity(SeverityLevel.CRITICAL)
    public void loginWithCorrectEmail() throws InterruptedException {
        LoginSteps step2 = new LoginSteps(ChromeRunner.driver);
        step2.emailInput(correctEmailData);
        step2.passwordInput(incorrectPasswordData);
        step2.loginButton();
        Thread.sleep(5000);
    }

    @Test (priority = 3)
    @Description("მოსალოდნელი და არსებული შედეგი")
    public void assertResult() throws InterruptedException {
        LoginSteps step3 = new LoginSteps(ChromeRunner.driver);
        Assert.assertEquals(actualTitle, expectedTitle);
        Thread.sleep(5000);
    }

    @Test (priority = 8)
    @Description("ვებ გვერდზე ენის შეცვლა")
    public void languageBar () throws InterruptedException {
        LoginSteps step4 = new LoginSteps(ChromeRunner.driver);
        step4.changeLanguage();
        Assert.assertEquals(actualTitle, expectedTitle1);
        Thread.sleep(5000);
    }

    @Test (priority = 5)
    @Description("კალათაში დამატების გვერდზე გადასვლა")
    public void addToCart () throws InterruptedException {
        LoginSteps step5 = new LoginSteps(driver);
        step5.addCartButton();
        step5.promoCode(promoCodeData);
        step5.validateCode();
        Thread.sleep(5000);
    }

    @Test (priority = 0)
    @Description("შესვლა Gmail-ით")
    public void signInWithGmail() throws InterruptedException {
        LoginSteps step6 = new LoginSteps(ChromeRunner.driver);
        step6.gmailSign();
        Thread.sleep(5000);
    }

    @Test (priority = 6)
    @Description("ვალუტის ცვლილება")
    public void gelToUSD () throws InterruptedException {
        LoginSteps step7 = new LoginSteps(ChromeRunner.driver);
        step7.addCartButton();
        step7.changeCurrency();
        step7.changeCurrency1();
        Thread.sleep(5000);
    }
    @Test (priority = 4)
    @Description("დოკუმენტაციის გვერდზე გადასვლა")
    public void knowledgeBasePage () throws InterruptedException {
        LoginSteps step8 = new LoginSteps(ChromeRunner.driver);
        step8.knowledgeBase();
        Assert.assertEquals(actualTitle, expectedTitle2);
        Thread.sleep(5000);
    }

}





























