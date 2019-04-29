import kotlin.system.measureTimeMillis

fun main(args: Array<String>) {
    if (args.isEmpty()) {
        println("Using Main.kt <Euler problem number> <impl Method>")
        System.exit(0)
    }

    val problem = args[0].toInt()
    val method = if (args.size > 1 ) args[1].toInt() else 1

    println("Starting solve problem: $problem with method: $method")

    val milli = measureTimeMillis {
        when (problem) {
            1 -> problem1(method)
            2 -> problem2(method)
            3 -> problem3(method)
            else -> println("Unsolved problem: $problem")
        }
    }
    println("Execution time: $milli ms")
}