package test;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;

public class FirstJUnitTest {
    @Test
    void successFillTest() {
        open("https://demoqa.com/automation-practice-form");
    }
}

