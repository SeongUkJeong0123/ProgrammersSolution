package com.programmers.solution



fun arrGCD(n : Int, m : Int) : IntArray{

    var div = 0
    var mul = 0

    for(i in 1..n){
        if(n%i == 0 && m%i == 0){
            div = i
        }
    }
    mul = div.times(n/div).times(m/div)

    val answer = IntArray(2)

    answer[0] = div
    answer[1] = mul

    return answer

}