data class Fruit(val name: String, val contryOfOrigin: String)
val apple = Fruit("apple", "South Korea")

fun describe(obj: Any): String =
        when (obj) {
            is String -> "string"
            is Fruit -> "fruit"
            else -> "unknown"
        }

println(describe(apple))
