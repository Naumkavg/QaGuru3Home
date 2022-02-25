package pages;

import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.files.DownloadAction;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.files.DownloadActions.click;

public class RegistrationPage {
    // locators
    private SelenideElement
            headerTitle = $(".main-header"),
            firstNameInput = $("#firstName"),
            lastNameInput = $("#lastName"),
            UserEmailInput = $("#UserEmail"),
            userNumberInput = $("#UserNumber"),
            genterWrapper = $("#genterWrapper");

}

    // actions

public RegistrationPage openPage() {
        open("/automation-practice-form");
        headerTitle.shouldHave(text("Practice Form"));
        return this;
        }
public RegistrationPage setFirstName (String firstName) {
        firstNameInput.setValue(firstName);
        return this;
        }
public RegistrationPage setLastName (String LastName) {
        lastNameInput.setValue(LastName);
         return this;
}
public RegistrationPage setUserEmail (String setUserEmail) {
         UserEmailInput.setValue(setUserEmail);
         return this;
        }

public RegistrationPage setUserNumber (String userNumber) {
        userNumberInput.setValue(userNumber);
        return this;
}
    public RegistrationPage setgenterWrapper (String Male) {
        genterWrapper.$(byText(Male)).click();

        return this;

    }









}
