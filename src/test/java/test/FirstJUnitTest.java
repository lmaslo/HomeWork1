package test;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;


import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class FirstJUnitTest {
   @BeforeAll
   static void beforeAll() {
       open("https://demoqa.com/automation-practice-form");
   }

    @Test
    void successFillTest() {
        $(".main-header").shouldHave(text("Practice Form"));

        $("#firstName").setValue("Lena");
        $("#lastName").setValue("Masloboishchikova");
        $("#userEmail").setValue("lMaslo@mail.ru");
        //gender
        //$("enterWrapper").selectRadio("Female");
        $("#userNumber").setValue("8945632145");
        //date
        //Subjects
        //hobbies
        //Picture
        $("#currentAddress").setValue("Address 1 2 3 4 5");
        //state
        //city




    }
}

