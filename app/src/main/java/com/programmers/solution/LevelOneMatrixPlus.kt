package com.programmers.solution

import kotlin.coroutines.EmptyCoroutineContext.plus

/**
 *  Programmers Level1
* 행렬의 덧셈은 행과 열의 크기가 같은 두 행렬의 같은 행, 같은 열의 값을 서로 더한 결과가 됩니다.
 * 2개의 행렬 arr1과 arr2를 입력받아, 행렬 덧셈의 결과를 반환하는 함수, solution을 완성해주세요.
 *
*제한 조건
*행렬 arr1, arr2의 행과 열의 길이는 500을 넘지 않습니다.
* */
fun matrixPlus(arr1: Array<IntArray>, arr2: Array<IntArray>): Array<IntArray> {

    //이중 포문과 배열의 범위가 중요, answer의 길이를 설정해주는것도 중요
    var answer = arrayOf<IntArray>()
    answer = arr1
   for(i in arr1.indices){
       for(j in arr1[i].indices){
           answer[i][j] = arr1[i][j].plus(arr2[i][j])
       }
   }
//
    return answer

}
