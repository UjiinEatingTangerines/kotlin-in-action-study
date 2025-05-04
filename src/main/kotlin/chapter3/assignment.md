<!-- 실습 과제나 추가 공부거리 -->

1. 가변 문자 시퀀스 (StringBuilder ...)
2. collection.withIndex() 에 대하여  
   1. collection.withIndex()는 Kotlin에서 컬렉션을 인덱스와 값 쌍(Pair) 으로 다룰 수 있게 해주는 확장 함수예요.
   쉽게 말하면, for문 등에서 인덱스와 함께 값에 접근하고 싶을 때 쓰는 도구입니다.  
   2. 언제 쓰면 좋을까?  
   단순히 for (i in list.indices)로 인덱스를 사용하는 것보다 코드가 간결하고 가독성이 좋을 때. 인덱스와 값을 동시에 써야 할 때 편리함.
   3. ✅ 기본 설명
      collection.withIndex()는 각 요소에 대해 인덱스와 값 쌍 (IndexedValue) 을 반환합니다. for 루프에서 구조 분해 선언을 통해 인덱스와 값을 쉽게 꺼낼 수 있습니다.
   4. [ 예제 코드 ]
       ```
      val list = listOf("a", "b", "c")
      for ((index, value) in list.withIndex()) {
      println("index: $index, value: $value")
      }
   
   5. [ 출력 ]
      ```
      index: 0, value: a
      index: 1, value: b
      index: 2, value: c
   💡 언제 사용할까? 인덱스와 값을 동시에 사용해야 할 때
   