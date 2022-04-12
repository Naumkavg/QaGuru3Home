package pages;

import com.codeborne.selenide.SelenideElement;
import pages.components.CalendarComponent;
import pages.components.CityComponents;
import pages.components.StateComponents;

import java.io.File;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class RegistrationPage<setStateInput> {

    // components
    CalendarComponent calendarComponent = new CalendarComponent();
    StateComponents StateComponents = new StateComponents();
    CityComponents CityComponents = new CityComponents();
    // locators
private SelenideElement
     headerTitle = $(".practice-form-wrapper"),
     firstNameInput = $("#firstName"),
     lastNameInput = $("#lastName"),
     userEmailInput = $("#userEmail"),
     genterWrapper = $("#genterWrapper"),
     userNumberInput = $("#userNumber"),
    // dateOfBirth = $("#dateOfBirthInput"),
     subjectsInput = $("#subjectsInput"),
     hobbiesWrapper = $("#hobbiesWrapper"),
     uploadPicture = $("#uploadPicture"),
     CurrentAddress = $("#currentAddress"),
     tableChekInput = $("#example-modal-sizes-title-lg");
    // clickSubmitInput = $("submit");
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
public RegistrationPage setUserEmail (String userEmail) {
    userEmailInput.setValue(userEmail);
    return this;
 }
public RegistrationPage setGenterWrapper (String Male) {
    genterWrapper.$(byText(Male)).click();
    return this;
}
public RegistrationPage setUserNumber (String userNumber) {
    userNumberInput.setValue(userNumber);
    return this;
}
public RegistrationPage setDateOfBirth (String day, String month,String year ) {
          calendarComponent.setdate(day, month, year);
    return this;
}
public RegistrationPage setSubjectsInput (String Subjects) {
    subjectsInput.setValue(Subjects).pressEnter();
    return this;
}
public RegistrationPage setHobbiesWrapper (String Music) {
    hobbiesWrapper.$(byText(Music)).click();
    return this;
}
public RegistrationPage setUploadPicture (String uploadFile) {
    uploadPicture.uploadFromClasspath("img/1.png");

    return this;
}
public RegistrationPage setCurrentAddress (String currentAddress) {
    CurrentAddress.setValue(currentAddress);
    $("#state").click();
        return this;
}

public RegistrationPage  setStateInput (String setState){
    StateComponents.setState(setState);
    return this;
}

public RegistrationPage  setCityInput (String setCity){
    CityComponents.setCity(setCity);
    $("#submit").click();
    return this;
    }
//public RegistrationPage setclickSubmit (){
  //  $("clickSubmitInput").click();
   //     return this;
  //  }

public RegistrationPage setTableChekInput (String tableChek){
    tableChekInput.shouldHave(text("Thanks for submitting the form"));
    $(".table-responsive")
    .parent().shouldHave(text("Vito Korleone"),text("baron@boroda.com"),
    text("Male"),text("0123456789"), text("07 December,1900"),
    text("Commerce"), text("Music"), text("1.png"), text("Sicily"), text("Haryana Karnal"));

    return this;



}
}