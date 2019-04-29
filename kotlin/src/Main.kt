fun main(args: Array<String>) {
    if (args.isEmpty()) {
        println("Using Main.kt <Euler problem number>")
        System.exit(0)
    }

    when (args[0]) {
        "1" -> problem1()
        "2" -> problem2()
        else -> println("Unsolved problem")
    }
}