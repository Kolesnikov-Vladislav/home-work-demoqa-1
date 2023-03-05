import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import pages.Components.WindowResultRegistrationComponent;
import pages.PageInputInformationUser;

public class DemoQaTest {
    PageInputInformationUser pageInputInformationUser = new PageInputInformationUser();
    WindowResultRegistrationComponent windowResultRegistrationComponent = new WindowResultRegistrationComponent();
    @BeforeAll
    static void beforeAll() {
        Configuration.browserSize = "1680x1050";
    }

    //Configuration.browserSize = "1920*1080";
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








        //Проверка
        //$(".modal-body").shouldHave(text("TestFirstName TestLastName"));
        //$(".modal-body").shouldHave(text("testUserEmail@test.ru"));
        //$(".modal-body").shouldHave(text("Male"));
        //$(".modal-body").shouldHave(text("1735342525"));
        //$(".modal-body").shouldHave(text("27 January "));
        //$(".modal-body").shouldHave(text("History"));
        //$(".modal-body").shouldHave(text("Music"));
        //$(".modal-body").shouldHave(text("ToolForm.png"));
        //$(".modal-body").shouldHave(text("Moscow never sleep"));
        //$(".modal-body").shouldHave(text("NCR Delhi"));
        //$("#closeLargeModal").click();

    }
}
