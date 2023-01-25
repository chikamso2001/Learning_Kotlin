open class Drone(
    open val color:String = "Red",
){
    fun move(
        X:Int,Y:Int,Z:Int
    ){
        println("The drone flies in the direction $X $Y $Z in the " +
                "X, Y and Z directions respectively")
    }
}
class superDrone:Drone(){
    override val color:String = "Dragon Blue"
}
fun main(){
    val drone1 = superDrone()
    drone1.move(4,1,6)
}
