package com.programmers.solution


/** Programmers Level1
 * 이 문제에는 표준 입력으로 두 개의 정수 n과 m이 주어집니다.
 *별(*) 문자를 이용해 가로의 길이가 n, 세로의 길이가 m인 직사각형 형태를 출력해보세요.
 * */
fun levelOneStar(){

    val (a, b) = readLine()!!.split(' ').map(String::toInt)

        for(i in 0..b.minus(1)){
            for(j in 0..a.minus(1)){
                print("*")
            }
            if(i != b.minus(1)){
                println()
            }

        }


}