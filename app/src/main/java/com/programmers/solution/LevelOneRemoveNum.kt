package com.programmers.solution

/**
 * 배열의 가장 작은값을 지워주는 함수
 *
 * 정수를 저장한 배열, arr 에서 가장 작은 수를 제거한 배열을 리턴하는 함수, solution을 완성해주세요.
 * 단, 리턴하려는 배열이 빈 배열인 경우엔 배열에 -1을 채워 리턴하세요.
 * 예를들어 arr이 [4,3,2,1]인 경우는 [4,3,2]를 리턴 하고, [10]면 [-1]을 리턴 합니다.
 *
 *제한 조건
 *arr은 길이 1 이상인 배열입니다.
 *인덱스 i, j에 대해 i ≠ j이면 arr[i] ≠ arr[j] 입니다.
 * */

// 정렬을 쓰려고 하다보니 코드가 길어지고 복잡해짐
// 한가지 방법만 고집하지 말자
fun removeNumMin(arr : IntArray) : IntArray {

    val arrSort = arr.clone()
    arrSort.sortDescending()

    var arrClone : MutableList<Int> = mutableListOf(-1)

    if(arr.size != 1){
        arrClone = MutableList<Int>(arr.size){arr[it]}

        var indexCheck = 0

        for(i in arrClone.indices){
            if(arrClone[i] == arrSort[arrSort.lastIndex]){
                indexCheck = i
                break
            }
        }

        arrClone.removeAt(indexCheck)

    }


    val intArrayEx = IntArray(arrClone.size){arrClone[it]}
    return intArrayEx
}

// 다른사람 풀이
//fun removeNumMin(arr : IntArray) : IntArray = when(arr.size){
//    1 -> arrayOf(-1).toIntArray()
//    else -> arr.filter { it != arr.min() }.toIntArray()
//}