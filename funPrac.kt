//Declaring a global variable
var name = "Chikamso"
fun main(){

    println("When where you born: ")
    var age : Int = readLine()!!.toInt()

    //printing a greeting
    fun greeting(){
        println("Good day $name")
    }
    println("$name if you where born in $age then you are ${calAge(age)} you" +
            " might be classified as a ${genType(age)}")

}
fun calAge(age: Int): Int {
    return 2022 - age
}

fun genType(dateOfBirth:Int):String{
    when(dateOfBirth){
        in 1980..2000 -> return "Millenials"
        in 2000..2010 -> return "Gen Z"
        in 1950..1979 -> return "Boomers"
        in 2011..2022 -> return "newbs"
    }
    return " "
}

