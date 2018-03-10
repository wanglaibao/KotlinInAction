package com.laibao.kotlininaction

import org.junit.Test
import org.junit.runner.RunWith

/**
 * @author laibao wang
 * @date 2018-03-10
 * @version 1.0
 */
class KotlinBasicTest {

	@Test
	fun testSum() {
		val value = sum(10,20)
		println("value = $value")
	}

	@Test
	fun testStringTemplate() {
		val name = "金戈"
		println("hello,$name nice to meet you")
	}

	@Test
	fun testRange() {
		for (x in 1..3) {
			println(x)
		}
	}

	@Test
	fun testStream() {
		val daysOfWeek = listOf("Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday");
		daysOfWeek.filter {
			println("aaaaa")
			it.startsWith("S")
		}
		.sortedBy {
			println("bbbbbbbbb")
			it
		}
		.map {
			println("ccccccccccc")
			it.toUpperCase()
		}
		.forEach {
			println("dddddddd")
			println(it)
		}

	}

	@Test
	fun  testSequence() {
		val daysOfWeek = listOf("Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday");
		daysOfWeek.asSequence()
				 .filter {
						println("aaaaa")
						it.startsWith("S")
				 }
				.sortedBy {
					println("bbbbbbbbb")
					it
				}
				.map {
					println("ccccccccccc")
					it.toUpperCase()
				}
				.forEach{println(it)}
	}

	fun sum(a:Int,b:Int) = a + b
}
