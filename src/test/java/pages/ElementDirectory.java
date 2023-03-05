package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class ElementDirectory {
    public SelenideElement
            inputFirstName = $("#firstName"),
            inputlastName = $("#lastName"),
            inputUserEmail = $("#userEmail"),
            inputGenderWrapper = $("#genterWrapper"),
            inputUserNumber = $("#userNumber"),
            openInputDateOfBirth = $("#dateOfBirthInput"),
            choiceSubjects = $("#subjectsInput"),
            choiceHobbies = $("#hobbiesWrapper"),
            uploadPictureInForm = $("#uploadPicture"),
            currentAddressInForm = $("#currentAddress"),
            openListState = $("#state"),
            openListCity = $("#city"),
            buttonSubmit = $("#submit"),
            buttonCloseFormResult = $("#closeLargeModal");
}
