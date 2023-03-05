package pages.components;

import static com.codeborne.selenide.Selectors.by;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class CalendarComponent {
    public void setDateOfBirth(String day, String month, String year){
        $(by("class", "react-datepicker__year-select")).$(byText(year)).click();
        $(by("class", "react-datepicker__month-select")).$(byText(month)).click();
        $(by("class", "react-datepicker__month-container")).$(byText(day)).click();
    }
}
