package com.programmers.solution

fun solution(phone_number: String): String {

    val lastNumber = phone_number.substring(phone_number.length.minus(4),phone_number.length)
    var starNumber = ""
    for(i in 0..phone_number.length.minus(5)){
        starNumber += "*"
    }

    return starNumber.plus(lastNumber)

}