package org.example.chapter1.whatIsKotlinAndWhyYouNeedIt.examples.getterDeclaration

class Rectangle (val height:Int, val width: Int){
    val isSquare: Boolean
        get() {
            return height == width
        }
}

//호출 테스트
fun main(){
    val rectangle = Rectangle(41, 43)
    println(rectangle.isSquare)
}