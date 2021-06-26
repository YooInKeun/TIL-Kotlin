enum class Color(
        val r: Int, val g: Int, val b: Int
) {
    RED(255, 0, 0),
    GREEN(0, 255, 0),
    BLUE(0, 0, 255); // enum안에 아래와 같이 함수를 정의한다면, 상수 목록과 메소드 사이에 세미콜론을 넣어야한다

    fun rgb() = (r * 256 + g) * 256 + b
}

println(Color.BLUE.rgb())
