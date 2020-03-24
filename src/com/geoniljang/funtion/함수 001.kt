package com.geoniljang.funtion


//main의 경우는 최상의 함수 이기 때문에 제일 먼저 실행
//함수를 만나면 메모에 프레인 단위 공간을 할당하게 된다. 오호! 스코프 내부 지역변수 느낌입니다.

fun main(args: Array<String>) {

    //해당안에 있는 변수 : 지역변수

    println("Hello world")
    val result = sum(10, 20)
    val result2 = sum(20,40)
    val result3 = sum(result, result2)

    println("$result + $result =  $result3")

    println(max(100,200))
}



fun sum(a:Int, b: Int):Int = a+b
fun max(a:Int, b:Int): Int{
    var max = a > b
    return if(max) a else b
}
