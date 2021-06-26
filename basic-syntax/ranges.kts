// in 사용법
val x = 3
val y = 2
if (x in 1..y+1) {
    println("x: ${x}")
}
for (x in 1..10) {
    println(x)
}

// !in 사용법
val fruits = listOf("banana", "apple", "mango")
if (4 !in 0..fruits.lastIndex) {
    println("fruits의 index 범위를 벗어남")
}
if (fruits.size !in fruits.indices) {
    println("fruits의 size는 fruits의 index 범위를 벗어남")
}

// step과 같이 사용
for (x in 1..10 step 3) {
    println(x)
}
for (x in 9 downTo 0 step 3) {
    println(x)
}