fun getStringLength(str: Any): Int? {
    if (str is String) {
        return str.length
    }
    return null
}

println(getStringLength("abc"))
println(getStringLength(""))