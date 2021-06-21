open class Shape

class Rectangle(var height: Double, var length: Double): Shape() {
    var perimeter = (height + length) * 2
}

val rectangle = Rectangle(3.0, 4.0)
println("둘레의 길이는 ${rectangle.perimeter} 이다")