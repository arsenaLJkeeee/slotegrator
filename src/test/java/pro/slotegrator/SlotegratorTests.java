package pro.slotegrator;

import com.codeborne.selenide.ClickOptions;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import java.time.Duration;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Configuration.baseUrl;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
import static io.qameta.allure.Allure.step;

public class SlotegratorTests extends SlotegratorTestBase{
    @Tag("remote")
    @Test
    void smokeEvolvingWebMainPageTest() {


        SelenideLogger.addListener("allure", new AllureSelenide());
        step("Open main page", () -> open(baseUrl));
        step("Check if Solutions menu is working", () -> {
            $(byText("Solutions")).hover()
                    .shouldBe(visible);
        });

        step("Check if Solutions menu items are working", () -> {
            $(byText("All Solutions")).hover()
                    .shouldBe(visible);

            $(byText("Turnkey online casino")).hover()
                    .shouldBe(visible);

            $(byText("White Label casino")).hover()
                    .shouldBe(visible);

            $(byText("Crypto casino")).hover()
                    .shouldBe(visible);

            $(byText("Frontend Builder")).hover()
                    .shouldBe(visible);
        });

        step("Check if Products and services menu is working", () -> {
            $(byText("Products and services")).hover()
                    .shouldBe(visible);

            $(byText("All Products")).hover()
                    .shouldBe(visible);

            $(byText("Payment systems")).hover()
                    .shouldBe(visible);

            $(byText("Online sportsbook")).hover()
                    .shouldBe(visible);

            $(byText("Telegram casino")).hover()
                    .shouldBe(visible);

            $(byText("Affiliate management")).hover()
                    .shouldBe(visible);

            $(byText("Bonus system")).hover()
                    .shouldBe(visible);

            $(byText("Licensing")).hover()
                    .shouldBe(visible);

            $(byText("Advisory services")).hover()
                    .shouldBe(visible);

            $(byText("Hosting")).hover()
                    .shouldBe(visible);

            $(byText("Platform updates")).hover()
                    .shouldBe(visible);
        });

        step("Check if Company menu items are working", () -> {

            $(byText("Company")).hover()
                    .shouldBe(visible);

            $(byText("About us")).hover()
                    .shouldBe(visible);

            $(byText("Careers")).hover()
                    .shouldBe(visible);

            $(byText("News")).hover()
                    .shouldBe(visible);

            $(byText("Reviews")).hover()
                    .shouldBe(visible);

            $(byText("Partners")).hover()
                    .shouldBe(visible);

            $(byText("FAQ")).hover()
                    .shouldBe(visible);
        });


        step("Check search field", () -> {

            $("#toggle_search_main_menu")
                    .shouldBe(visible)
                    .click();
        });


        sleep(50000);

    }
}




