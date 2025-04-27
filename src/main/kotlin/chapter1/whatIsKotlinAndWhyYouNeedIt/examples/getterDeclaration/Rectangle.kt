package org.example.chapter1.whatIsKotlinAndWhyYouNeedIt.examples.getterDeclaration

class Rectangle (val height:Int, val width: Int){
    val isSquare: Boolean
        get() {
            return height == width
        }
}