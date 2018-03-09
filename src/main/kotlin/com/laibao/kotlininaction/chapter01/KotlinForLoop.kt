package com.laibao.kotlininaction.chapter01

/**
 * @author laibao wang
 * @date 2018-03-09
 * @version 1.0
 */

fun main(args: Array<String>) {
    //val daysOfWeek : List<String> = listOf("Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday")
    val daysOfWeek = listOf("Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday");
    //pure for loop
    for(day in daysOfWeek) {
        println(day)
    }

    //pairs
    for((index,day) in daysOfWeek.withIndex()) {
        println("$index :$day")
    }

    //forEach Loop
    daysOfWeek.forEach{day -> println(day)}

    // loop in range
    val range:IntRange = 1 .. 100
    for(element in range){
        println(element)
    }

    val range1:IntRange = 1 until 100
    for(element in range1){
        println(element)
    }

    // repeat statement
    repeat(100) {
        println("金戈")
        daysOfWeek.forEach{day -> println(day)}
    }
}