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
        .setFirstName("Vito") //имя
        .setLastName("Korleone") //фамилия
        .setUserEmail("baron@boroda.com") //почта
        .setGenterWrapper("Male") //пол
        .setUserNumber("0123456789") //телефон
        .setDateOfBirth("December", "7th", "1900") //дата рождения
        .setSubjectsInput("Commerce") //работа
        .setHobbiesWrapper("Music")    // хобби
        .setUploadPicture("img/1.png")  // фото
        .setCurrentAddress("Sicily") // адрес
        .setStateInput ("Haryana") //штат
        .setCityInput ("Karnal"); //город
        //.setclickSubmit();
        RegistrationPage.openPage().setTableChekInput("Thanks for submitting the form");

            //не могу понять почему после вызова формы, форма закрываается и вызывается еще раз

    }

}
