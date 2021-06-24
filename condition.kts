// 기본 if-else 구문
val score = 100
if (score >= 90) {
    println("A")
} else if (score in 80..89) {
    println("B")
} else {
    println("C")
}

// 다음과 같이 조건식의 결과를 변수에 할당할 수 있다
val answerString: String = if (score >= 90) {
    "A"
} else if (score in 80..89) {
    "B"
} else {
    "C"
}
println(answerString)

// when 사용법
fun describe(obj: Any): String =
        when (obj) {
            3 -> "Three"
            "Hi" -> "Bye"
            is Long -> "Long Type"
            is String -> "String Type"
            else -> "Unknown"
        }

println(describe(3)) // Three
println(describe("Hi")) // Bye
println(describe("Hello")) // String Type
println(describe(123L)) // Long Type
println(describe(1)) // Unkown
