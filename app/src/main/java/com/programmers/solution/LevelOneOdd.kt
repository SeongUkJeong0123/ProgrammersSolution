package com.programmers.solution

/**
 * 홀수인지 짝수인지 판단해주는 함수
 * */
fun numEvenOrOdd(num : Int) : String {

    return when(num%2){
        0 -> "Even"
        else -> "Odd"
    }

}