package org.example.chapter3.code

fun <T> joinToString(
    collection: Collection<T>,
    separator: String,
    prefix: String,
    postfix: String
): String {
    val result = StringBuilder(prefix)

    for ((index, element) in collection.withIndex()) {
        if (index > 0) result.append(separator) // <- 첫 원소 앞에는 구분자를 붙이면 안된다.
        result.append(element)
    }

    result.append(postfix)
    return result.toString()
}

//개선된 함수
fun <T> smartJoinToString(
    collection: Iterable<T>,
    separator: String = ", ",
    prefix: String = "",
    suffix: String = ""
): String {
    val result = StringBuilder(prefix)
    for ((index, element) in collection.withIndex()) {
        if (index > 0) result.append(separator)
        result.append(element)
    }
    result.append(suffix)
    return result.toString()
}


//검증
fun main() {
    val list = listOf("one", "two", "eight")
    println(joinToString(list, "; ", "(", ")"))

    println("디폴트 설정: ${joinToString(list, separator = "; ", prefix = "(", postfix = ")")}")
    println("순서 변경: ${joinToString(list, postfix = "!", separator = "; ", prefix = "<")}")

    println("개선된 버전1: ${smartJoinToString(list, "","", "")}")
    println("개선된 버전2: ${smartJoinToString(list)}")
    println("개선된 버전3: ${smartJoinToString(list,";")}")
}