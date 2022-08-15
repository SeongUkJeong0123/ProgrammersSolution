package com.programmers.solution

class levelOneXn {


    /**
     * Programmers Level1
     * 함수 solution은 정수 x와 자연수 n을 입력 받아, x부터 시작해 x씩 증가하는 숫자를 n개 지니는 리스트를 리턴해야 합니다. 다음 제한 조건을 보고, 조건을 만족하는 함수, solution을 완성해주세요.
     *
     *제한 조건
     *x는 -10000000 이상, 10000000 이하인 정수입니다.
     *n은 1000 이하인 자연수입니다.
     *
     * x를 toLong으로 하지 않으면 Int의 범위에서 벗어나기 때문에
     * 테스트 13, 14에서 오류가 발생한다.
     * */

    //내가 작성한 코드
    /*  fun solution(x: Int, n: Int): LongArray {

          val answer : LongArray = LongArray(n) { 0L }
          for (i in 0..n.minus(1)) {
              answer[i] = x.toLong().times(i+1)
          }

          return answer
      }*/

    //다른 사람이 작성한 코드 -> 람다식을 활용해 훨씬더 간결하게 작성하였다.
    fun levelOneXn(x: Int, n: Int): LongArray = LongArray(n) { x.toLong() * (it + 1) }

}