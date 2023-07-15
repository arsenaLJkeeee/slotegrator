package pro.slotegrator;

import com.codeborne.selenide.ClickOptions;
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
            $(byText("Services")).hover()
                    .shouldBe(visible);

            $(byText("All products")).hover()
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
            $(byText("Industries")).hover()
                    .shouldBe(visible);

            $(byText("About us")).hover()
                    .shouldBe(visible);

            $(byText("Career")).hover()
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

        step("Click on Contacts", () -> {
            $(byText("Contacts")).hover()
                    .shouldBe(visible, Duration.ofSeconds(3))
                    .click(ClickOptions.usingJavaScript());


            $("#form-name")
                    .setValue("Vladimir Borchevskiy");
            $("#form-email")
                    .setValue("arsenaljkeeee10@gmail.com");
            $("#form-phone")
                    .setValue("+995597078392");
            $(".directorist-select__search directorist-select__search--show")
                    .selectOption("Book a meeting");
            $("#form-text")
                    .setValue("Hello, i'm Vladimir, Quality Assurance Engineer with a demonstrated history of working in software product-based companies, and i inspired by Slotegrator, just hire me!");

        });

        sleep(50000);

    }
}




