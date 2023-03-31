import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;
import static org.openqa.selenium.By.linkText;

public class SearchIssueInGitHub {
    @Test
    @Tag("")
    public void searchIssueWitchLambda(){
        step("Открываем главную страницу GitHub", () -> {
            open("https://github.com");
        });
        step("Кликаем на 'Поиск'", () -> {
            $(".header-search-input").click();
        });
        step("Вводим наименование репозитория", () -> {
            $(".header-search-input").sendKeys("eroshenkoam/allure-example");
        });
        step("Подтверждаем поиск/Производим поиск", () -> {
            $(".header-search-input").submit();
        });
        step("Ищем репозиторий в списке результата поиска", () -> {
            $(linkText("eroshenkoam/allure-example")).click();
        });
        step("Ищем на странице репозитория раздел 'Issue' и переходим в него", () -> {
            $("#issues-tab").click();
        });
        step("Проверяем Issue с наименование на наличие в разделе Issue", () -> {
            $("div[aria-label=\"Issues\"]").shouldBe(Condition.text("issue_to_test_allure_report")).shouldBe(Condition.visible);
        });
    }
}
