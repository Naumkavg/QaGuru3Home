package pages.components;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class CityComponents {
    public static void setCity (String city) {
        $("#stateCity-wrapper").$(byText("Karnal")).click();
        $("#submit").click();
        }
}
