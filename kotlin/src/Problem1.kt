fun problem1(method: Int) {
    println(
        """
        If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9.
        The sum of these multiples is 23.
        Find the sum of all the multiples of 3 or 5 below 1000.
        """.trimIndent()
    )

    var sum: Int = 0;
    for (i in 1..999) {
        if (i % 3 == 0) {
            sum += i;
        } else if (i % 5 == 0) {
            sum += i;
        }
    }
    println("Result: $sum")
    assert(sum == 233168)
}