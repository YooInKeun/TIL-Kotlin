val unmodifiableMap = mapOf(0 to "a", 1 to "b", 2 to "c")
println(unmodifiableMap[0])
println(unmodifiableMap)
//map[2] = "d" // read-only이기 때문에 에러 발생

val mutableMap = mutableMapOf(0 to "a", 1 to "b", 2 to "c")
mutableMap[2] = "d"
println(mutableMap)

for ((key, value) in mutableMap) {
    println("$key : $value")
}