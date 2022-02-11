package box;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class ToolsQATest {

    @BeforeAll
    static void beforeAll() {

        Configuration.baseUrl = "https://demoqa.com";
        Configuration.browserSize = "1920x1880";

    }

    @Test
    void successFillTest() {
        open("/automation-practice-form");

        $(".main-header").shouldHave(text("Practice Form"));

        $("#firstName").setValue("Don"); // имя
        $("#lastName").setValue("Korleone"); // фамилия
        $("#userEmail").setValue("baron@boroda.com"); // почта
        $(byText("Male")).click(); // пол
        $("#userNumber").setValue("0123456789"); // номер телефона

        $("#dateOfBirthInput").click(); // календарь
        $("#react-datepicker__month-select").selectOptionByValue("March");
        $("#react-datepicker__year-select").selectOptionByValue("1964");
        $("#react-datepicker__week").$(byText("7")).click();
        $("#subjectsInput").setValue("999999").pressEnter();




    }


}
