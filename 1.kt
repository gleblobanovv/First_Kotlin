import kotlin.math.pow

fun main(){
    var number1= readLine()!!.toDouble()
    var number2= readLine()!!.toDouble()

    when{
        (number1>number2)-> number1=number1+1
        (number1<number2)-> number2=number2+1
        (number1==number2)-> number1=number1.pow(3)
    }
    println(number1)
    println(number2)


}