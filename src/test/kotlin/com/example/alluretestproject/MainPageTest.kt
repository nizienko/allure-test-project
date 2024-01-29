package com.example.alluretestproject

import io.qameta.allure.AllureId
import io.qameta.allure.Step
import org.junit.jupiter.api.*
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.ValueSource

class MainPageTest {


    @AllureId("10357")
    @TestFactory
    fun test1(): List<DynamicTest> {
        return listOf(DynamicTest.dynamicTest("test 1"){ assert(true) })
    }

    @AllureId("10356")
    @Test
    fun test2() {
        step1()
        step2()
        step3()
    }



    @AllureId("10358")
    @ParameterizedTest
    @ValueSource(strings = ["param1", "param2", "param3"])
    fun test3(param: String) {
        assert(false)
    }

    @Step("step 1 ssdsdsd")
    fun step1() {

    }

    @Step("step 2 ssdsdsd")
    fun step2() {

    }

    @Step("step 3 ssdsdsd")
    fun step3() {

    }


}
