package com.example.alluretestproject

import io.qameta.allure.AllureId
import org.junit.jupiter.api.*

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
    @TestFactory
    fun test3(): List<DynamicTest> {
        return listOf(DynamicTest.dynamicTest("test 3"){ assert(true) })
    }
}
