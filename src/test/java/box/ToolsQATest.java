package box;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class ToolsQATest {

    @BeforeAll
    static void beforeAll() {

        Configuration.baseUrl = "https://demoqa.com";
    }

    @Test
    void successFillTest() {
        open("/automation-practice-form");

        $(".main-header").shouldHave(text("Practice Form"));

        $("#firstName").setValue("Don"); // имя
        $("#lastName").setValue("Korleone"); // фамилия
        $("#userEmail").setValue("baron@boroda.com");// почта
              $("#gender-radio-1").setValue("Male"); // пол
        $("#Mobile Number").setValue("123456789"); // номер телефона

    }



}
