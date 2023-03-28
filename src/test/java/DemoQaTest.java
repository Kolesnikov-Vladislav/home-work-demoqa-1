
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class DemoQaTest extends FakeData{

    @Tag("BLOCK")
    @Test
    void demoQaTest () {
        SelenideLogger.addListener("allure", new AllureSelenide());
        pageInputInformationUser.openPageInputInformationUser()
                .firstNameInput(firstNameFake)
                .lastNameInput(lastNameFake)
                .userEmailInput(userEmailFake)
                .genderWrapperInput(genderWrapperFake)
                .userNumberInput(userNumberFake)
                .dateOfBirthOpen()
                .inputDateOfBirth(dayFake, monthFake, yearFake)
                .choiceSubjects(choiceSubjectsFake)
                .choiceHobbies(choiceHobbiesFake)
                .uploadPictureInForm(pictureStatic)
                .currentAddressInForm(currentAddressInFormFake)
                .openListState(state)
                .openListCity(cityFake)
                .buttonSubmit()
                .checkupWindowResultRegistration("Student Name", firstNameFake + " " + lastNameFake)
                .checkupWindowResultRegistration("Student Email", userEmailFake)
                .checkupWindowResultRegistration("Gender", genderWrapperFake)
                .checkupWindowResultRegistration("Mobile", userNumberFake)
                .checkupWindowResultRegistration("Date of Birth", dayFake + " " + monthFake + "," + yearFake)
                .checkupWindowResultRegistration("Subjects", choiceSubjectsFake)
                .checkupWindowResultRegistration("Hobbies", choiceHobbiesFake)
                .checkupWindowResultRegistration("Picture", picture)
                .checkupWindowResultRegistration("Address", currentAddressInFormFake)
                .checkupWindowResultRegistration("State and City", state + " " + cityFake)
                        .buttonCloseFormResult();
    }
}
