import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import pages.components.WindowResultRegistrationComponent;
import pages.PageInputInformationUser;

public class DemoQaTest {
    PageInputInformationUser pageInputInformationUser = new PageInputInformationUser();
    WindowResultRegistrationComponent windowResultRegistrationComponent = new WindowResultRegistrationComponent();
    @BeforeAll
    static void beforeAll() {
        Configuration.browserSize = "1680x1050";
    }
    @Test
        void demoQaTest() {
        pageInputInformationUser.openPageInputInformationUser()
                .inputFirstNameUser("TestFirstName")
                .inputLastNameUser("TestLastName")
                .inputUserEmail("testUserEmail@test.ru")
                .inputGenderWrapper("Male")
                .inputUserNumber("1735342525")
                .openInputDateOfBirth()
                .inputDateOfBirth("27", "January", "1996")
                .choiceSubjects("History")
                .choiceHobbies("Music")
                .uploadPictureInForm("pictures/ToolForm.png")
                .currentAddressInForm("Moscow never sleep")
                .openListState("NCR")
                .openListCity("Delhi")
                .buttonSubmit()
                .checkupWindowResultRegistration("Student Name", "TestFirstName TestLastName")
                .checkupWindowResultRegistration("Student Email", "testUserEmail@test.ru")
                .checkupWindowResultRegistration("Gender", "Male")
                .checkupWindowResultRegistration("Mobile", "1735342525")
                .checkupWindowResultRegistration("Date of Birth", "27 January,1996")
                .checkupWindowResultRegistration("Subjects", "History")
                .checkupWindowResultRegistration("Hobbies", "Music")
                .checkupWindowResultRegistration("Picture", "ToolForm.png")
                .checkupWindowResultRegistration("Address", "Moscow never sleep")
                .checkupWindowResultRegistration("State and City", "NCR Delhi")
                        .buttonCloseFormResult();
    }
}
