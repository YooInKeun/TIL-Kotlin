fun getLength(obj: Any): Int? {
    if (obj is String) {
        return obj.length
    }

    if (obj is Number) {
        return obj.toString().length
    }

    return null
}

println(getStringLength("muyaho"))
println(getStringLength(12345))
