package test;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import com.codeborne.selenide.Configuration;


import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class FirstJUnitTest {
    @BeforeAll
    static void beforeAll() {
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.browserSize = "1920x1080";

    }

    @Test
    void successFillTest() {

        open("/automation-practice-form");
        $(".main-header").shouldHave(text("Practice Form"));

        $("#firstName").setValue("Lena");
        $("#lastName").setValue("Masloboishchikova");
        $("#userEmail").setValue("lMaslo@mail.ru");
        //gender, как работает selectRadio("Female")
        $(byText("Female")).click();
        $("#userNumber").setValue("8945632145");
        $("#dateOfBirthInput").click();
        $(".react-datepicker__year-select").selectOptionByValue("1993");
        $(".react-datepicker__month-select").selectOptionByValue("8");
        $(byText("10")).click();
        $("#subjectsInput").setValue("English").pressEnter();
        $(byText("Sports")).click();
        //Picture


        $("#currentAddress").setValue("Address 1 2 3 4 5");
        //state
       // $(".css-1hwfws3").click();
       // $(".css-yk16xz-control").selectOptionByValue("NCR");

        //city


    }
}

