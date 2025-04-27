package org.example.chapter1.whatIsKotlinAndWhyYouNeedIt.examples.list1_1.kotlinFirstImpression

// data class
data class Person (
    // 읽기 전용 프로퍼티
    val name: String,
    // 널이 도리 수 있는 타입(Int?)과 파라미터 기본값
    val age: Int? = null
)

//최상위 함수
fun main() {
    val person = listOf(
        // 이름 붙은 파라미터
        Person("영희", age = 29),
        //트레일링 콤마
        Person("철수"),
    )

    //람다식
    val oldest = person.maxBy {
        //null 에 작용하는 엘비스 연산자
        it.age ?: 0
    }
    //문자열 템플릿
    println("가장 나이가 많은 사람: $oldest")
}