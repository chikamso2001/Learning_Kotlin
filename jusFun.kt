fun main(){
    printUpward(5)
    println(" ")
    printDownWards(5)
    println(" ")
    printIsoceles(10)

    val theArea:Double = AreaOfTriangle(12.5,7.5)
    println(theArea)

    val ans:Int = factorial(5)
    print(ans)

}
//Create a function that prints stars
fun printStars(num:Int){
    for(i in 1..num){
        print("*")
    }
    print("\n")
}
fun printUpward(length:Int){
    for(i in 1..length){
        printStars(i)
    }
}
fun printDownWards(length:Int){
    for(i in length downTo 1){
        printStars(i)
    }
}
fun printIsoceles(length: Int){
    printUpward(length)
    printDownWards(length-1)
}
//A function that returns the area of a triangle
fun AreaOfTriangle(base:Double,Height:Double):Double{
    return (0.5)*Height*base
}
//Try out the recursive function on factorial
fun factorial(num:Int):Int{
    if(num <= 1){
        return num
    }else return factorial(num -1)*num
}