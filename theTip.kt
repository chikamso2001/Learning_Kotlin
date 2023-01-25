fun main(args : Array<String>){
    val haveExtraChange : Boolean = true
    var tip : Int
    if (haveExtraChange) tip = 10 else tip = 0
    println(tip)

    //Probability of rain
    var probOfRain = 67
    if(probOfRain >= 70){
        println("Huge chance for rain")
    }else if(probOfRain < 70 && probOfRain > 45){
        println("Mild chance for rain")
    }else if(probOfRain < 45){
        println("Very unlikely for rain")
    }else println("What!!!")

    //Using the when form
    when{
        probOfRain >= 70 -> println("Huge chance for rain")
        probOfRain <= 45 -> println("Very unlikely for rain")
        probOfRain < 70 -> println("Mild chance for rain")
    }
    var today : String = "Tuesday"
    when(today){
        "Thursday" -> println("Looks like the weekend is around the corner")
        "Monday" -> println("The beginning of the week are normally the busiest")
        else -> println("Enjoy your day")
    }
    //Making it a return statement
    var happy : Boolean = true
    var isTrue : Boolean = when(happy){
        true -> true
        else -> false
    }
    println(isTrue)

    val number : Int = 6
    val text : String = when(number){
        in 1..5 -> "The number is between 1 through 5"
        else -> "The number is greater than 5"
    }
    println(text)
}