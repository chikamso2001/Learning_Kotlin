abstract class Cars(){
    fun speedUp(){
        hitTheGas()
    }
    fun slowDown(){
        hitTheBrakes()
    }
    internal abstract fun hitTheGas()
    internal abstract fun hitTheBrakes()
}
//This class is for object that are of type buggati
class Buggatti:Cars(){
    override fun hitTheGas() {
        //This body contains the code for a buggati to hit the gas
        println("The Bugatti is hitting the gas")
    }

    override fun hitTheBrakes() {
        //This body contains the code for a buggati to hit the has brakes
        println("The Buggati is hitting the brakes")
    }
}
class Lamborgini:Cars(){
    override fun hitTheBrakes() {
        //This function defines how a lamborgini hits the brakes
        println("The Lamborgini is hitting the brakes")
    }

    override fun hitTheGas() {
        //This code contains the code for a Lamborgini hitting the gas
        println("The lamborgini is hitting the gas")
    }
}
fun main(){
    val myCar:Cars = Buggatti()
    val mySecondCar:Cars = Lamborgini()

    myCar.slowDown()
    mySecondCar.speedUp()
}