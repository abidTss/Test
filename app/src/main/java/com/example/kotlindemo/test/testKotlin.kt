package com.example.kotlindemo.test

fun main() {
    println("the value is ${add(3, 5)}")

    highorderFun({ a, b ->
        println("")
        add(a, b)
    }, 7, {
        abc(this) })
}


fun add(a: Int, b: Int): Int {
    println("the received value is $a : $b")
    return a + b
}

fun abc(x:Int) {
    println("bbb $x")
}

fun highorderFun(abd: (a: Int, b: Int) -> Int, c: Int, fc: Int.() -> Unit) {
    abd(3, 6)
    println("inside highorder fun $c")
    fc(2)
}



