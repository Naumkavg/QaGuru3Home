package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class RegistrationPage {
    // locators
    private SelenideElement
            headerTitle = $(".practice-form-wrapper"),
            firstNameInput = $("#firstName"),
            lastNameInput = $("#lastName"),
            userEmailInput = $("#userEmail"),
            userNumberInput = $("#userNumber"),
            genterWrapper = $("#genterWrapper"),
            dateOfBirth = $("#dateOfBirthInput");

    // actions
public RegistrationPage openPage() {
        open("/automation-practice-form");
    headerTitle.shouldHave(text("Student Registration Form"));
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
public RegistrationPage setuserEmail (String setuserEmail) {
    userEmailInput.setValue(setuserEmail);
    return this;
 }
public void setgenterWrapper (String Male) {
        genterWrapper.$(byText(Male)).click();

    }
public void setuserNumber (String userNumber) {
    userNumberInput.setValue(userNumber);

}
    public void setdateOfBirth (String day, String month,String year ) {
        $("#dateOfBirthInput").click(); // календарь
        $(".react-datepicker__month-select").selectOption("December");
        $(".react-datepicker__year-select").selectOption("1900");
        $("[aria-label$='December 7th, 1900']").click();
    }


}
