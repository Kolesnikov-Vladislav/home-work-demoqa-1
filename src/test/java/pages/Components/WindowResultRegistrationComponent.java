package pages.Components;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class WindowResultRegistrationComponent {
    public void checkupWindowResultRegistration(String key, String value){
        $(".modal-body").$(byText(key)).parent()
                .shouldHave(text(value));

    }
}
