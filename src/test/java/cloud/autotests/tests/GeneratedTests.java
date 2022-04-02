package cloud.autotests.tests;

import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.Description;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;
import static io.qameta.allure.Allure.step;


public class GeneratedTests extends TestBase {
    @Test
    @Description("Checking change Titles EN version")
    @DisplayName("Beresnev")
    void titleENTestBeresnev() {
        SelenideLogger.addListener("allure", new AllureSelenide());
        step("Открыть 'https://beresnev.games/en'", () -> {
            open("https://beresnev.games/en");
            sleep(200);
        });

        step("Провкручиваем страницу вниз через специальную кнопку", () -> {
            $("[class=BtnScroll_box__3XQTk]", 0).click();
        });

        step("Проверяем корректность написания заголовка Our games", () -> {
            $("[class='text--h2 text--center']", 0).shouldHave(text("Our games"));
        });


        step("Проверяем корректность написания заголовка We’re hiring", () -> {
            $("[class='text--h2 text--center']", 1).scrollTo().shouldHave(text("We’re hiring"));
        });
    }


    @Test
    @Description("Checking change Titles Cz version")
    @DisplayName("Beresnev")
    void titleCZTestBeresnev() {
        step("Открыть 'https://beresnev.games/cz'", () -> {
            open("https://beresnev.games/cz");
            sleep(200);
        });

        step("Провкручиваем страницу вниз через специальную кнопку", () -> {
            $("[class=BtnScroll_box__3XQTk]", 0).click();
        });

        step("Проверяем корректность написания заголовка Naše hry", () -> {
            $("[class='text--h2 text--center']", 0).shouldHave(text("Naše hry"));
        });


        step("Проверяем корректность написания заголовка Volná pracovní místa", () -> {
            $("[class='text--h2 text--center']", 1).scrollTo().shouldHave(text("Volná pracovní místa"));
        });
    }

    @Test
    @Description("Checking change Titles Ru version")
    @DisplayName("Beresnev")
    void titleRUTestBeresnev() {
        step("Открыть 'https://beresnev.games/ru'", () -> {
            open("https://beresnev.games/ru");
            sleep(200);
        });

        step("Провкручиваем страницу вниз через специальную кнопку", () -> {
            $("[class=BtnScroll_box__3XQTk]", 0).click();
        });

        step("Проверяем корректность написания заголовка Наши игры", () -> {
            $("[class='text--h2 text--center']", 0).shouldHave(text("Наши игры"));
        });


        step("Проверяем корректность написания заголовка Открытые вакансии", () -> {
            $("[class='text--h2 text--center']", 1).scrollTo().shouldHave(text("Открытые вакансии"));
        });
    }


}