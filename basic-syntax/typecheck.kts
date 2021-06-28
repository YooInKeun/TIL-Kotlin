fun getLength(obj: Any): Int? {
    if (obj is String) {
        return obj.length
    }

    if (obj is Number) {
        return obj.toString().length
    }

    return null
}

// when 사용하기
//fun getLength(obj: Any): Int? =
//    when (obj) {
//        is String -> obj.length
//        is Number -> obj.toString().length
//        else -> null
//    }

println(getLength("muyaho"))
println(getLength(12345))
