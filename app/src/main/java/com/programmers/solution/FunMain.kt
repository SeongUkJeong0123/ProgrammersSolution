package com.programmers.solution

fun main(args : Array<String>){

 val arrA  = arrayOf<IntArray>(intArrayOf(1,2), intArrayOf(3,5), intArrayOf(1,1))
 val arrB  = arrayOf<IntArray>(intArrayOf(3,4), intArrayOf(5,6), intArrayOf(1,3))

    matrixPlus(arrA,arrB)

    println("${matrixPlus(arrA,arrB)[0][0]} ")

}
