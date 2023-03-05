package pages;

import pages.Components.CalendarComponent;
import pages.Components.WindowResultRegistrationComponent;

import static com.codeborne.selenide.Selectors.byText;

import static com.codeborne.selenide.Selenide.open;

public class PageInputInformationUser extends ElementDirectory{
    CalendarComponent calendarComponent = new CalendarComponent();
    WindowResultRegistrationComponent WindowResultRegistrationComponent = new WindowResultRegistrationComponent();
    public PageInputInformationUser openPageInputInformationUser(){
        open("https://demoqa.com/automation-practice-form");
        return this;
    }
    public PageInputInformationUser inputFirstNameUser(String value){
        inputFirstName.setValue(value);
        return this;
    }
    public PageInputInformationUser inputLastNameUser(String value){
        inputlastName.setValue(value);
        return this;
    }
    public PageInputInformationUser inputUserEmail(String value){
        inputUserEmail.setValue(value);
        return this;
    }
    public PageInputInformationUser inputGenderWrapper(String value){
        inputGenderWrapper.$(byText(value)).click();
        return this;
    }
    public PageInputInformationUser inputUserNumber(String value){
        inputUserNumber.setValue(value);
        return this;
    }
    public PageInputInformationUser openInputDateOfBirth(){
        openInputDateOfBirth.click();
        return this;
    }
    public PageInputInformationUser inputDateOfBirth(String day, String month, String year){
        calendarComponent.setDateOfBirth(day, month, year);
        return this;
    }
    public PageInputInformationUser choiceSubjects(String value){
        choiceSubjects.setValue(value).pressEnter();
        return this;
    }
    public PageInputInformationUser choiceHobbies(String value){
        choiceHobbies.$(byText(value)).click();
        return this;
    }
    public PageInputInformationUser uploadPictureInForm(String value){
        uploadPictureInForm.uploadFromClasspath(value);
        return this;
    }
    public PageInputInformationUser currentAddressInForm(String value){
        currentAddressInForm.setValue(value);
        return this;
    }
    public PageInputInformationUser openListState(String value){
        openListState.click();
        openListState.$(byText(value)).click();
        return this;
    }
    public PageInputInformationUser openListCity(String value){
        openListCity.click();
        openListCity.$(byText(value)).click();
        return this;
    }
    public PageInputInformationUser buttonSubmit(){
        buttonSubmit.click();
        return this;
    }
    public PageInputInformationUser checkupWindowResultRegistration(String key, String value){
        WindowResultRegistrationComponent.checkupWindowResultRegistration(key, value);
        return this;
    }

    public PageInputInformationUser buttonCloseFormResult(){
        buttonCloseFormResult.click();
        return this;
    }

}
