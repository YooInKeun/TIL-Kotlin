val fruits = listOf("apple", "banana", "mango")
for (fruit in fruits) {
    println(fruit)
}

when {
    "mango" in fruits -> println("mango는 frutis에 포함되어 있음")
    "onion" !in fruits -> println("onion은 fruits에 포함되지 않음")
}

// collection, lambda 식 적용하기
fruits
        .filter { it.startsWith("a") }
        .sortedBy { it }
        .map { it.toUpperCase() }
        .forEach{ println(it) }
