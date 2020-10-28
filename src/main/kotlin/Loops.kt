fun main() {
    // Prints 012345
    for (x in 0..5) print(x)
    println("\n---")

    // Prints 01234
    for (x in 0 until 5) print(x)
    println("\n---")

    // Prints 024
    for (x in 0 until 5 step 2) print(x)
    println("\n---")

    // Prints nothing
    for (x in 5..0) print(x)
    println("\n---")

    // Prints 543210
    for (x in 5 downTo 0) print(x)
    println("\n---")

    // Prints 531
    for (x in 5 downTo 0 step 2) print(x)
    println("\n---")

    // Prints 012345
    (0..5).forEach { print(it) }

    // Prints
    // 0: 0
    // 1: 2
    // 2: 4
    for ((index, value) in (0 until 5 step 2).withIndex()) {
        println("$index: $value")
    }
    println("\n---")

    val arr = arrayOf(1, 2, 3, 4, 5)
    // Prints 12345
    for (x in arr) print(x)
    println("\n---")

    // Prints 12345
    arr.forEach { print(it) }
    println("\n---")

    val someString = "some string"
    // Prints "SOME STRING"
    for (x in someString) print(x.toUpperCase())
    println("\n---")

    // Prints "SOME STRING"
    someString.forEach { print(it.toUpperCase()) }
    println("\n---")

    val map = mapOf(
        1 to "One",
        2 to "Two",
        3 to "Three"
    )
    // Prints
    // Key: 1, value: One
    // Key: 2, value: Two
    // Key: 3, value: Three
    for (x in map)
        println("Key: ${x.key}, value: ${x.value}")
    println("\n---")

    // Prints
    // Key: 1, value: One
    // Key: 2, value: Two
    // Key: 3, value: Three
    for ((key, value) in map)
        println("Key: $key, value: $value")
    println("\n---")

    // Prints
    // Key: 1, value: One
    // Key: 2, value: Two
    // Key: 3, value: Three
    map.forEach { println("Key: ${it.key}, value: ${it.value}") }
    println("\n---")

    // Prints
    // Key: 1, value: One
    // Key: 2, value: Two
    // Key: 3, value: Three
    map.forEach { (key, value) -> println("Key: $key, value: $value") }
    println("\n---")

    var a = 0
    // Prints 01234
    while (a < 5) {
        print(a)
        ++a
    }
    println("\n---")

    var b = 0
    // Prints 01234
    do {
        print(b)
        ++b
    } while (b < 5)
    println("\n---")

    // Prints
    // 1 - 0
    // 3 - 0
    // 5 - 0
    one@ for (x in 0..5) {
        for (y in 0..1) {
            if ((x + y) % 2 == 0)
                continue@one
            println("$x - $y")
        }
    }
    println("\n---")

    // Prints
    // 0 - 1
    // 1 - 0
    // 2 - 1
    // 3 - 0
    // 4 - 1
    // 5 - 0
    for (x in 0..5) {
        for (y in 0..1) {
            if ((x + y) % 2 == 0)
                continue
            println("$x - $y")
        }
    }
    println("\n---")

    // Prints nothing
    one@ for (x in 0..5) {
        for (y in 0..1) {
            if ((x + y) % 2 == 0)
                break@one
            println("$x - $y")
        }
    }
    println("\n---")

    // Prints
    // 1 - 0
    // 3 - 0
    // 5 - 0
    one@ for (x in 0..5) {
        for (y in 0..1) {
            if ((x + y) % 2 == 0)
                break
            println("$x - $y")
        }
    }
    println("\n---")
}
