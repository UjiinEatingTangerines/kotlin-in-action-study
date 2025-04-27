package org.example.chapter1.whatIsKotlinAndWhyYouNeedIt.examples.list1_1.kotlinFirstImpression

/*
1. 슈퍼 클래스: 어떤 클래스가 상속을 받을 때 기준이 되는 부모 클래스
슈퍼 클래스 = 다른 클래스가 상속하는 부모 클래스
코틀린에선 open 키워드를 붙여야 상속이 가능하다

 */

/*
[data class]
다양한 메소드를 자동으로 생성해주는 클래스
ex) hashCode(), copy(), equals(), toString(), componentsN() ... etc

1. 기본 생성자에 1개 이상의 파라미터가 있어야 함
2. 기본 생성자의 파라미터가 val 또는 var 로 선언되어야 함
3. 다른 클래스를 상속받을 수 없음(*1.슈퍼 클래스를 가질 수 없음)
 */
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