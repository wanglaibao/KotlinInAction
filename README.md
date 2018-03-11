#   Kotlin In Action

##  1:  kotlin is more than a better java
Kotlin aims to be a better Java by cutting down on boilerplate code and introducing some features that Java is sorely lacking, such as a null safe design.

Kotlin is a language that aims to be a better version of Java,so it's a good choice to use Kotlin in Java-Based Project.

##  2: Design Philosophy of Kotlin
* 实用的
* 简洁的
* 类型安全的
* 静态类型的
* 互操作的

## 3: How Kotlin improve the usage of existed Java libraries,especially Java Collection FrameWork.【It too important】

Kotlin has a feature called Extension Functions which enables Kotlin Standard Library (stdlib) to extend functionality of JDK’s classes. 
For instance, if you open _Collections.kt file from stdlib you can find many methods similar to this:

`
public inline fun <T> Iterable<T>.filter(predicate: (T) -> Boolean): List<T> {
    return filterTo(ArrayList<T>(), predicate)
}
`
