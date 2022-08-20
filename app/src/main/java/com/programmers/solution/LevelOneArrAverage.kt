package com.programmers.solution

/**
 * 문제
 * 정수를 담고 있는 배열 arr의 평균값을 return하는 함수, solution을 완성해보세요.
 *
 *제한사항
 *arr은 길이 1 이상, 100 이하인 배열입니다.
 *arr의 원소는 -10,000 이상 10,000 이하인 정수입니다.
 */
fun arrAverage(arr: IntArray): Double {
    var sum = 0.0
    arr.forEach{
        sum += it.toDouble()
    }
    return sum/arr.size.toDouble()
    // return arr.average() --> 코드는 간결하지만 속도도 느리고 메모리를 많이 사용한다.
}