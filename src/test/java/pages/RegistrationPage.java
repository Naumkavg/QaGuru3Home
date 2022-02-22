package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class RegistrationPage {
    // locators


    SelenideElement
            headerTitle = $(".main-header"),
            firstNameInput = $("#firstName"),
            lastNameInput = $("#lastName"),
            userEmailInput = $("#userEmail"),
            userNumberInput = $("#userNumber");

    // actions

public RegistrationPage openPage () {
        open("/automation-practice-form");
        headerTitle.shouldHave(text("Practice Form"));
        return this;
}
public RegistrationPage setFirstName (String firstName) {
        firstNameInput.setValue(firstName);
        return this;
}
public RegistrationPage setUserEmail (String userEmail) {
        userEmailInput.setValue(userEmail);
        return this;
}
public void setLastName (String lastName) {
    lastNameInput.setValue(lastName);

}public void setUserNumber (String UserNumber) {
        userNumberInput.setValue(UserNumber);
}












}
