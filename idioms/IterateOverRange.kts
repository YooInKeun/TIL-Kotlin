// 1 ~ 10 출력
for (i in 1..10) {
    println(i)
}

// 1 ~ 9 출력
for (i in 1 until 10) {
    println(i)
}

// 1, 4, 7, 10
for (i in 1..10 step 3) {
    println(i)
}

// 10 ~ 2
for (i in 10 downTo 2) {
    println(i)
}

// for 조건에 부합하지 않아서 아무것도 안 찍힘
for (i in 10..2) {
    println(i)
}
