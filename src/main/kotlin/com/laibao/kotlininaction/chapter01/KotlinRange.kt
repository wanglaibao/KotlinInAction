package com.laibao.kotlininaction.chapter01

/**
 * @author laibao wang
 * @date 2018-03-10
 * @version 1.0
 */
fun main(args: Array<String>) {
    //m..n
    //m..n corresponds to the range[m,n] given m<n. By default, m and n are included in the range.
    upRange()

    //n downTo m
    //n downTo m corresponds to the range[n,m] given m<n. By default, m and n are included in the range
    downToRange()

    //m until n
    //m until n corresponds to the range[m,n) given m<n. By default, m is included in the range and n is excluded from the range

    utilRange()
}


fun upRange(): Unit {
    val intRange: IntProgression = 1 .. 1000
    val charRange: CharProgression = 'A' .. 'z'
    val longRange: LongProgression = 1L .. 200L

    intRange.forEach{println(it)}
    longRange.forEach{println(it)}
    charRange.forEach{println(it)}

    for(intElement in intRange) {
        println("intElement: $intElement")
    }

    for(longElement in longRange) {
        println("longElement: $longElement")
    }

    for(charElement in charRange) {
        println("charElement: $charElement")
    }
}

fun downToRange():Unit {
    val intRange: IntProgression = 1000 downTo 1

    val charRange: CharProgression = 'z' downTo 'A'

    val longRange: LongProgression = 200L downTo 1L

    intRange.forEach{println(it)}
    longRange.forEach{println(it)}
    charRange.forEach{println(it)}

    for(intElement in intRange) {
        println("intElement: $intElement")
    }

    for(longElement in longRange) {
        println("longElement: $longElement")
    }

    for(charElement in charRange) {
        println("charElement: $charElement")
    }
}

fun utilRange(): Unit {
    val intRange: IntProgression = 1 until 100

    val charRange: CharProgression = 'A' until 'z'

    val longRange: LongProgression = 1L until 200L

    intRange.forEach{println(it)}
    longRange.forEach{println(it)}
    charRange.forEach{println(it)}

    for(intElement in intRange) {
        println("intElement: $intElement")
    }

    for(longElement in longRange) {
        println("longElement: $longElement")
    }

    for(charElement in charRange) {
        println("charElement: $charElement")
    }
}