package box;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import pages.RegistrationPage;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class ToolsQATestPageObjects {
    RegistrationPage RegistrationPage = new RegistrationPage();

    @BeforeAll
    static void beforeAll() {

        Configuration.baseUrl = "https://demoqa.com";
        Configuration.browserSize = "1920x1080";

    }

    @Test
    void successFillTest() {
        RegistrationPage.openPage()
        .setFirstName("Vito")
        .setLastName("Korleone")
        .setUserEmail("baron@boroda.com")
        .setGenterWrapper("Male")
        .setUserNumber("0123456789")
        .setDateOfBirth("December", "7th", "1900")
        .setSubjectsInput("Commerce")
        .setHobbiesWrapper("Music")    // хобби
        .setUploadPicture("img/1.png")  // фото
        .setCurrentAddress("Sicily") // адрес
        .setStateInput ("Haryana")
        .setCityInput ("Karnal");
        RegistrationPage.openPage().setTableChekInput("Thanks for submitting the form");

    }

}
