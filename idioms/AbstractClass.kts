abstract class AbstractClass {
    abstract fun printObjectName()
    fun printHello() {
        println("Hello")
    }
}

val obj = object : AbstractClass() {
    override fun printObjectName() {
        println(this)
    }
}

obj.printClassName()
obj.printHello()
