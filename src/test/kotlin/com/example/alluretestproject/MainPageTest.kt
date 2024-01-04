package com.example.alluretestproject

import io.qameta.allure.AllureId
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
    @TestFactory
    fun test2(): List<DynamicTest> {
        return listOf(DynamicTest.dynamicTest("test 2"){ assert(true) })
    }

    @AllureId("10358")
    @ParameterizedTest
    @ValueSource(strings = ["param1", "param2"])
    fun test3(param: String) {
        assert(param == "param2")
    }
}
