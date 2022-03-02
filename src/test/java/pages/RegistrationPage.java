package pages;

import com.codeborne.selenide.SelenideElement;

import java.io.File;

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
            dateOfBirth = $("#dateOfBirthInput"),
            subjectsInput = $("#subjectsInput"),
            hobbiesWrapper = $("#hobbiesWrapper"),
            uploadPicture = $("#uploadPicture"),
            setCurrentAddress = $("#currentAddress");


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
public RegistrationPage setuserEmail (String userEmail) {
    userEmailInput.setValue(userEmail);
    return this;
 }
public RegistrationPage setgenterWrapper (String Male) {
        genterWrapper.$(byText(Male)).click();
    return this;
}
public RegistrationPage setuserNumber (String userNumber) {
    userNumberInput.setValue(userNumber);
    return this;
}
public RegistrationPage setdateOfBirth (String day, String month,String year ) {
        $("#dateOfBirthInput").click(); // календарь
        $(".react-datepicker__month-select").selectOption("December");
        $(".react-datepicker__year-select").selectOption("1900");
        $("[aria-label$='December 7th, 1900']").click();
    return this;
}
public void setsubjectsInput (String subjects) {
        subjectsInput.setValue(subjects).pressEnter();

}
public RegistrationPage sethobbiesWrapper (String Music) {
        hobbiesWrapper.$(byText(Music)).click();
    return this;
}
public RegistrationPage uploadPicture(String upload) {
    uploadPicture.uploadFile(new File("img/1.png"));
    $("#state").scrollTo().click();
    return this;
}
public RegistrationPage setCurrentAddress (String currentAddress) {
    setCurrentAddress.setValue(currentAddress);
        return this;
}
}
