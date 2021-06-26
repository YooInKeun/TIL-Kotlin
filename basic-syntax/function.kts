// 함수 구현체는 표현식이 될 수 있다(리턴 타입 추론 가능)
fun sum(a: Int, b: Int) = a + b;

//fun sum(a: Int, b: Int) : Int {
//    return a + b;
//}

fun printSum(a: Int, b: Int) {
    println("$a 와 $b 의 합은 ${a + b} 이다")
}

//fun printSum(a: Int, b: Int): Unit {
//    println("$a 와 $b 의 합은 ${a + b} 이다")
//}

printSum(4, 2)