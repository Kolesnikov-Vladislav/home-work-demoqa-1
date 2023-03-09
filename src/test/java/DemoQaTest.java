import com.codeborne.selenide.Configuration;
import com.github.javafaker.Faker;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import pages.components.WindowResultRegistrationComponent;
import pages.PageInputInformationUser;
import utils.RegistrationFakeData;

import static utils.RegistrationFakeData.randomArray;
import static utils.RegistrationFakeData.randomInteger;


public class DemoQaTest extends FakeData {
    String firstNameFake = faker.name().firstName(),
            lastNameFake = faker.name().lastName(),
            userEmailFake = faker.internet().emailAddress(),
            genderWrapperFake = randomArray(gender),
            userNumberFake = String.valueOf(randomInteger(1000000000, 1100000000)),
            choiceSubjectsFake = randomArray(subjects),
            choiceHobbiesFake = randomArray(hobbies),
            currentAddressInFormFake = faker.address().fullAddress(),
            dayFake = String.valueOf(randomInteger(1, 28)),
            monthFake = randomArray(month),
            yearFake = String.valueOf(randomInteger(1990, 2000));
    String state = "NCR";
    String picture = "ToolForm.png";
    String cityFake = randomArray(city);


    @Test
        void demoQaTest() {
        pageInputInformationUser.openPageInputInformationUser()
                .firstNameInput(firstNameFake)
                .lastNameInput(lastNameFake)
                .userEmailInput(userEmailFake)
                .genderWrapperInput(genderWrapperFake)
                .userNumberInput(userNumberFake)
                .DateOfBirthOpen()
                .inputDateOfBirth(dayFake, monthFake, yearFake)
                .choiceSubjects(choiceSubjectsFake)
                .choiceHobbies(choiceHobbiesFake)
                .uploadPictureInForm()
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
