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
        .setuserEmail("baron@boroda.com")
        .setgenterWrapper("Male")
        .setuserNumber("0123456789")
        .setdateOfBirth("December", "7th", "1900")
        .setsubjectsInput("Commerce");
        RegistrationPage.sethobbiesWrapper("Music")    // хобби
        .uploadPicture("img/1.png")  // фото
        .setCurrentAddress("Sicily"); // адрес



        $("#stateCity-wrapper").$(byText("Haryana")).click();
        $("#city").click();

        $("#stateCity-wrapper").$(byText("Karnal")).click();
        $("#submit").click();

        $("#example-modal-sizes-title-lg").shouldHave(text("Thanks for submitting the form"));
        $(".table-responsive")
        .parent().shouldHave(text("Vito Korleone"),text("baron@boroda.com"),
        text("Male"),text("0123456789"), text("07 December,1900"),
        text("Commerce"), text("Music"), text("1.png"), text("Sicily"), text("Haryana Karnal"));


    }


}
