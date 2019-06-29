package main

data class Script( val name: String,
                   val description: String )

fun main( args: Array<String> ) {

    val scriptList = listOf( Script("Hello.js", "let hello = 'hello'"),
                             Script("Hello.js", "console.log( hello )") )

    scriptList.forEach {
        println("Script is : $it")
    }
}
