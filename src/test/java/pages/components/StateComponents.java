package pages.components;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class StateComponents {
    public static void setState (String state) {
    $("#stateCity-wrapper").$(byText("Haryana")).click();
    $("#city").click();



}


}