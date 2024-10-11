package ru.otus.homework

fun main() {
    val n = 5
    fizzbuzz(n)
}

fun fizzbuzz(n: Int): Array<String> {
    var i = 0
    val numbers = Array(n) { i++ }
    val strings = Array<String>(numbers.size) {

        when {
            it % 3 == 0 && it % 5 == 0->"FizzBuzz"
            it % 3 == 0->"Fizz"
            it % 5 == 0->"Buzz"
            else-> {
                it.toString()
            }
        }
    }
    return strings
}