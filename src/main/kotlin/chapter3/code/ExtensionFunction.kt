package org.example.chapter3.code

fun String.addQuotes(): String {
    return "\"$this\""
}

//this는 수신 객체, 즉 이 함수를 호출한 문자열 인스턴스를 가리킴
fun String.lastChar(): Char = this.get(this.length - 1)
//수신 객체 멤버를 this 없이 접근 할 수 있다
//fun String.lastChar(): Char = get(length - 1)

fun main() {
    val text = "Hello"
    println(text.addQuotes()) // 출력: "Hello"

    println(text.lastChar())
    /*
    여기서 무슨 일이 일어나냐면?
    1. text.lastChar()를 호출하면,
    2. lastChar() 함수 안에서 this는 "Hello"이 돼요.
    3. 따라서 this.length는 5이고,
    4. this.get(4)는 'n'을 반환합니다.
    5. 즉, "Hello".lastChar()는 "Hello"이라는 수신 객체에 대해 실행되는 거예요.
     */
}