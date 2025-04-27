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
    /*
    [읽기 전용(Read-only) 프로퍼티]
    - 한 번만 할당할 수 있는 읽기 전용 변수 (immutable)
     */
    val name: String,
    /*
    [읽고 쓸 수 있는(Read-write) 프로퍼티]
    값을 여러 번 변경할 수 있는 가변 변수 (mutable)
     */
    var tmp1: String? = null,
    // 널이 될 수 있는 타입(Int?)과 파라미터 기본값
    val age: Int? = null
)

/*
[최상위 함수]
클래스나 객체에 속하지 않고 파일 최상단에 직접 정의하는 함수
 */
fun main() {
    val person = listOf(
        // 이름 붙은 파라미터
        Person("영희", age = 29),
        Person("철수"),//<- 트레일링 콤마: 리스트나 인자 목록 끝에 추가하는 쉼표로, 코드 수정과 버전 관리(diff)에 유리
        // 트레일링 콤마 참고: https://charliezip.tistory.com/30
    )

    /*
    [람다식]
    이름 없이 바로 사용할 수 있는 간결한 함수 표현
     */
    val oldest = person.maxBy {
        /*
        [null 에 작용하는 엘비스 연산자]
        it(암시적인 디폴트 이름, 변경 가능함).age 가 null 인 경우, 0으로 반환
         */
        it.age ?: 0
    }
    /*
    [문자열 템플릿]
    문자열 안에서 변수나 식(expression)을 ${} 형태로 간편하게 삽입하는 기능
     */
    println("가장 나이가 많은 사람: $oldest")
}