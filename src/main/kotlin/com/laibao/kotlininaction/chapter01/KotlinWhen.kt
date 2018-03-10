package com.laibao.kotlininaction.chapter01

import com.laibao.kotlininaction.chapter01.WeekDay.*

/**
 * @author laibao wang
 * @date 2018-03-10
 * @version 1.0
 */
fun main(args: Array<String>) {
    val weekDay = WeekDay.WEDNESDAY
    println(getWeekDay(weekDay))

    println(getWeekDay2(WeekDay.MONDAY))

    val values:Array<WeekDay> = WeekDay.values()
    values.forEach{println(it.name)}
}

// 表达式函数体
fun getWeekDay(weekDay: WeekDay) = when(weekDay) {
                                                    SUNDAY -> "Sunday"
                                                    MONDAY -> "Monday"
                                                    TUESDAY -> "Tuesday"
                                                    WEDNESDAY -> "Wednesday"
                                                    THURSDAY -> "Thursday"
                                                    FRIDAY -> "Friday"
                                                    SATURDAY -> "Saturday"
                                                    else -> throw IllegalArgumentException("参数不正确") }



// 块状函数体
fun getWeekDay2(weekDay: WeekDay):Any {
    when(weekDay) {
            SUNDAY -> {
                println(SUNDAY.name)
                return "Sunday"
            }
            MONDAY -> {
                println(MONDAY.name)
                return "Monday"
            }
            TUESDAY -> {
                println(TUESDAY.name)
                return "Tuesday"
            }
            WEDNESDAY -> {
                println(WEDNESDAY.name)
                return "Wednesday"
            }
            THURSDAY -> {
                println(THURSDAY.name)
                return "Thursday"
            }
            FRIDAY -> {
                println(FRIDAY.name)
                return "Friday"
            }
            SATURDAY -> {
                println(SATURDAY.name)
                return "Saturday"
            }
            else -> {
                println("参数不正确")
                throw IllegalArgumentException("参数不正确")
            }
    }
}






