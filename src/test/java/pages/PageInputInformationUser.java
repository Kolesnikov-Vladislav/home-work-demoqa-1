package pages;

import io.qameta.allure.Step;
import pages.components.CalendarComponent;
import pages.components.WindowResultRegistrationComponent;

import static com.codeborne.selenide.Configuration.baseUrl;
import static com.codeborne.selenide.Selectors.byText;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class PageInputInformationUser {
    CalendarComponent calendarComponent = new CalendarComponent();
    WindowResultRegistrationComponent windowResultRegistrationComponent = new WindowResultRegistrationComponent();

    @Step("Открываем страницу 'DemoQA.com/automation-practice-form'")
    public PageInputInformationUser openPageInputInformationUser(){
        open(baseUrl + "/automation-practice-form");
        return this;
    }
    @Step("Заполняем поле 'Имя'")
    public PageInputInformationUser firstNameInput(String value){
        $("#firstName").setValue(value);
        return this;
    }
    @Step("Заполняем поле 'Фамилия'")
    public PageInputInformationUser lastNameInput(String value){
        $("#lastName").setValue(value);
        return this;
    }
    @Step("Заполняем поле 'Почта'")
    public PageInputInformationUser userEmailInput(String value){
        $("#userEmail").setValue(value);
        return this;
    }
    @Step("Выбираем 'Пол'")
    public PageInputInformationUser genderWrapperInput(String value){
        $("#genterWrapper").$(byText(value)).click();
        return this;
    }
    @Step("Заполняем поле 'Номер телефона'")
    public PageInputInformationUser userNumberInput(String value){
        $("#userNumber").setValue(value);
        return this;
    }
    @Step("Открываем форму 'Дата рождения'")
    public PageInputInformationUser dateOfBirthOpen(){
        $("#dateOfBirthInput").click();
        return this;
    }
    @Step("Заполняем поле 'Дата рождения'")
    public PageInputInformationUser inputDateOfBirth(String day, String month, String year){
        calendarComponent.setDateOfBirth(day, month, year);
        return this;
    }
    @Step("Заполняем поле 'Темы'")
    public PageInputInformationUser choiceSubjects(String value){
        $("#subjectsInput").setValue(value).pressEnter();
        return this;
    }
    @Step("Заполняем поле 'Хобби'")
    public PageInputInformationUser choiceHobbies(String value){
        $("#hobbiesWrapper").$(byText(value)).click();
        return this;
    }
    @Step("Загружаем фотографию")
    public PageInputInformationUser uploadPictureInForm(String value){
        $("#uploadPicture").uploadFromClasspath(value);
        return this;
    }
    @Step("Заполняем поле 'Адрес'")
    public PageInputInformationUser currentAddressInForm(String value){
        $("#currentAddress").setValue(value);
        return this;
    }
    @Step("Указываем 'Штат'")
    public PageInputInformationUser openListState(String value){
        $("#state").hover().click();
        $("#state").$(byText(value)).click();
        return this;
    }
    @Step("Указываем 'Город'")
    public PageInputInformationUser openListCity(String value){
        $("#city").hover().click();
        $("#city").$(byText(value)).click();
        return this;
    }
    @Step("Отправляем заполненную форму")
    public PageInputInformationUser buttonSubmit(){
        $("#submit").click();
        return this;
    }
    @Step("Проверяем заполненную форму")
    public PageInputInformationUser checkupWindowResultRegistration(String key, String value){
        windowResultRegistrationComponent.checkupWindowResultRegistration(key, value);
        return this;
    }
    @Step("Закрываем заполненную форму")
    public PageInputInformationUser buttonCloseFormResult(){
        $("#closeLargeModal").click();
        return this;
    }
}
