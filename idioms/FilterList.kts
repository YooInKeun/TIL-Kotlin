val fruits = listOf("apple", "banana", "mango")

val fruitNameOverFiveLength = fruits.filter { fruit -> fruit.length > 5 }
for (fruitName in fruitNameOverFiveLength) {
    println(fruitName)
}