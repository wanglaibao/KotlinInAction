package com.laibao.kotlininaction.chapter01

/**
 * @author laibao wang
 * @date 2018-03-10
 * @version 1.0
 */
fun main(args: Array<String>) {

    var a: Int = 0
    while(a < 100) {
        println("the number is = $a")
        println("我是金戈")
        a++
    }

    var b = 0;
    do{
        println("我是中国人")
        println("b = $b")
        if(b > 90) {
            break
        }
        b = b + 1
    }while(b < 100)
}
