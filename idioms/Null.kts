import java.lang.IllegalArgumentException

// List
val fruitList = mutableListOf("apple", "banana", "mango")
fruitList.removeIf({ it.length >= 0 })

val firstFruitOfList = fruitList.firstOrNull() ?: "empty"
println(firstFruitOfList)

// Map
val fruitMap = mutableMapOf(0 to "grape", 1 to "strawberry")
var thirdFruitOfMap = fruitMap[2]?.let { fruitMap[3] } ?: "watermelon"
fruitMap.put(2, thirdFruitOfMap)
thirdFruitOfMap = fruitMap[2] ?: throw IllegalArgumentException("third fruit is empty")
println(thirdFruitOfMap)