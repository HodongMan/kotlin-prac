package main

fun min(lhs: Int, rhs: Int): Int {
    return if ( lhs > rhs) rhs else lhs
}

fun max(lhs: Int, rhs: Int): Int {
    return if ( lhs > rhs ) lhs else rhs
}

fun main(args: Array<String>) {
    println(min(1, 2))
    println(max(1, 2))
}