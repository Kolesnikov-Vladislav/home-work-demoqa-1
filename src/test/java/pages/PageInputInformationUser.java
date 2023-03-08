package pages;

import pages.components.CalendarComponent;
import pages.components.WindowResultRegistrationComponent;

import static com.codeborne.selenide.Selectors.byText;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class PageInputInformationUser  {
    CalendarComponent calendarComponent = new CalendarComponent();
    WindowResultRegistrationComponent windowResultRegistrationComponent = new WindowResultRegistrationComponent();
    public PageInputInformationUser openPageInputInformationUser(){
        open("https://demoqa.com/automation-practice-form");
        return this;
    }
    public PageInputInformationUser firstNameInput(String value){
        $("#firstName").setValue(value);
        return this;
    }
    public PageInputInformationUser lastNameInput(String value){
        $("#lastName").setValue(value);
        return this;
    }
    public PageInputInformationUser userEmailInput(String value){
        $("#userEmail").setValue(value);
        return this;
    }
    public PageInputInformationUser genderWrapperInput(String value){
        $("#genterWrapper").$(byText(value)).click();
        return this;
    }
    public PageInputInformationUser userNumberInput(String value){
        $("#userNumber").setValue(value);
        return this;
    }
    public PageInputInformationUser DateOfBirthOpen(){
        $("#dateOfBirthInput").click();
        return this;
    }
    public PageInputInformationUser inputDateOfBirth(String day, String month, String year){
        calendarComponent.setDateOfBirth(day, month, year);
        return this;
    }
    public PageInputInformationUser choiceSubjects(String value){
        $("#subjectsInput").setValue(value).pressEnter();
        return this;
    }
    public PageInputInformationUser choiceHobbies(String value){
        $("#hobbiesWrapper").$(byText(value)).click();
        return this;
    }
    public PageInputInformationUser uploadPictureInForm(String value){
        $("#uploadPicture").uploadFromClasspath(value);
        return this;
    }
    public PageInputInformationUser currentAddressInForm(String value){
        $("#currentAddress").setValue(value);
        return this;
    }
    public PageInputInformationUser openListState(String value){
        $("#state").click();
        $("#state").$(byText(value)).click();
        return this;
    }
    public PageInputInformationUser openListCity(String value){
        $("#city").click();
        $("#city").$(byText(value)).click();
        return this;
    }
    public PageInputInformationUser buttonSubmit(){
        $("#submit").click();
        return this;
    }
    public PageInputInformationUser checkupWindowResultRegistration(String key, String value){
        windowResultRegistrationComponent.checkupWindowResultRegistration(key, value);
        return this;
    }

    public PageInputInformationUser buttonCloseFormResult(){
        $("#closeLargeModal").click();
        return this;
    }

}
