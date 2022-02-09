package box;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class ToolsQATest {

    @BeforeAll
    static void beforeAll(){
        Configuration.baseUrl = "https://demoqa.com";
    }

    @Test
    void successFillTest() {
        open("/automation-practice-form");
        $(".=main-header").shouldHave(text("Practice Form"));

                $("#firstName").setValue("Don");
                $("#lastName").setValue("Korleone");
                $("#userEmail").setValue("baron@boroda.com");
    }

}
