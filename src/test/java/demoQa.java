import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.WebDriverRunner;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.awt.*;

import static com.codeborne.selenide.Selectors.by;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class demoQa {

    @BeforeAll
    static void beforeAll() {
        Configuration.browserSize = "1920x1080";
    }

    //Configuration.browserSize = "1920*1080";
    @Test
        void creatForm() {
        open("https://demoqa.com/automation-practice-form");
        $("#firstName").setValue("TestFirstName");
        $("#lastName").setValue("TestLastName");
        $("#userEmail").setValue("testUserEmail@test.ru");
        $("#gender-radio-1").sendKeys(" ");
        $("#userNumber").setValue("+73534252545");
        $("#dateOfBirthInput").click();
        $(by("class", "react-datepicker__year-select")).$(byText("1996")).click();
        $(by("class", "react-datepicker__month-select")).$(byText("January")).click();
        $(by("class", "react-datepicker__month-container")).$(byText("27")).click();


        $("#subjectsInput").setValue("History").pressEnter();
        $("#hobbies-checkbox-3").sendKeys(" ");
        $("#uploadPicture").val("D:\\Загрузки\\ToolsQA.png");

        $("#currentAddress").setValue("Moscow never sleep");
        $("#state").click();
        $("#react-select-3-option-2").click();
        $(".css-1wa3eu0-placeholder").click();
        $("#react-select-4-option-1").click();
        $("#submit").click();
//.css-1pahdxg-control


    }
}
