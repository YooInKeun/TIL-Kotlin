// for loop
val fruits = listOf("apple", "mango", "banana")
for (fruit in fruits) {
    println(fruit)
}

for (index in fruits.indices) {
    println("${index}번째 과일: ${fruits[index]}")
}

// while loop
var index = 0
while (index < fruits.size) {
    println("${index}번째 과일: ${fruits[index]}")
    index++
}