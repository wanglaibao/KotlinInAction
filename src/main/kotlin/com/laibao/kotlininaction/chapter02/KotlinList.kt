package com.laibao.kotlininaction.chapter02
import java.util.*

fun main(args: Array<String>) {
    val list: List<String> = ArrayList()//Arrays.asList("asdfasdf","asfdasf","fasfasf","asfasf","asfasfdasf")
    for (element in list) {
        println("element = $element")
    }
    println()
    list.forEach { element -> println(element) }

    println()
    val list1:MutableList<String> = ArrayList()
    list1.add("asfdasfd")
    list1.add("asfdasdf")
    list1.add("asfdasdf")

    for (element in list1) {
        println("element = $element")
    }
    println()

    list1.forEach { element -> println(element) }
}