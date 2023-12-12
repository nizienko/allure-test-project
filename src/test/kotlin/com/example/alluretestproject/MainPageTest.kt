package com.example.alluretestproject

import com.codeborne.selenide.Condition.attribute
import com.codeborne.selenide.Condition.visible
import com.codeborne.selenide.Configuration
import com.codeborne.selenide.Selectors.*
import com.codeborne.selenide.Selenide
import com.codeborne.selenide.Selenide.element
import com.codeborne.selenide.Selenide.open
import org.openqa.selenium.chrome.ChromeOptions
import com.codeborne.selenide.logevents.SelenideLogger
import io.qameta.allure.selenide.AllureSelenide
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.*

class MainPageTest {


    @Test
    fun test1() {
        assert(true)
    }

    @Test
    fun test2() {
        assert(true)
    }

    @Test
    fun test3() {
        assert(true)
    }
}
