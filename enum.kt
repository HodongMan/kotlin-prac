package main

enum class Color{
    RED,
    ORANGE,
    YELLOW,
    GREEN,
    BLUE,
    INDIGO,
    VIOLET
}

fun convertEnumToStringColor(color: Color) {
    when(color) {
        Color.RED -> "Red",
        Color.ORANGE -> "Orange"
        Color.YELLOW -> "Yellow"
        Color.GREEN -> "Green"
        Color.BLUE -> "Blue"
        Color.INDIGO -> "Indigo"
        Color.VIOLET -> "Violet"
    }
}