fun isPrime(number: Long): Boolean {
    if (number == 1L) {
        return false
    }
    if (number == 2L) {
        return true
    }

    for (i: Long in 3 until number step 2) {
        if (number % i == 0L) {
            return false
        }
    }
    return true
}

fun main() {
    assert(!isPrime(1))
    assert(isPrime(2))
    assert(isPrime(3))
    assert(isPrime(29))
}

fun problem3(method: Int) {
    println(
        """
        The prime factors of 13195 are 5, 7, 13 and 29.
        What is the largest prime factor of the number 600851475143 ?
        """.trimIndent()
    )

    val number: Long = 600_851_475_143
    var maxPrimeFactor = 0L
    for (i: Long in 3 until number step 2) {
        if (number % i == 0L) {
            maxPrimeFactor = if (isPrime(i)) i else maxPrimeFactor
        }
    }

    println("Result: $maxPrimeFactor")
    assert(maxPrimeFactor == 6857L)
}