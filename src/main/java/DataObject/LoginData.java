package DataObject;

import com.github.javafaker.Faker;

import static Utils.ChromeRunner.driver;

public interface LoginData {
    Faker faker = new Faker();
    String
            incorrectEmailData = "swtester@gmail.com",
            incorrectPasswordData = "12341234",
            correctEmailData = "zukabitsadze@gmail.com",
            promoCodeData = "SALE4TESTERS",
            expectedTitle = "Login - CLOUD9.GE",
            expectedTitle1 = "Login - CLOUD9.GE",
            expectedTitle2 = "Login - CLOUD9.GE",
            actualTitle = driver.getTitle();

}
