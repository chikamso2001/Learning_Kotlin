interface Vehicle{
    val vehicleType:String
    val vehicleName:String
    val yearOfProduction:Int
    val usesElectric:Boolean
    fun ignite()
    fun printDetail(){
        println("${this.vehicleType}" +
                "${this.vehicleName}" +
                "${this.yearOfProduction}")
    }
    fun turnOnIgnition(){
        //
    }
}

class Car(override val vehicleType: String,
          override val vehicleName: String,
          override val yearOfProduction: Int,
          override val usesElectric: Boolean) :Vehicle{
              override fun ignite(){
                  if(!usesElectric){
                      println("Ignition has been turned on")
                  }else println("The car has been turned on ;)")
              }
          }
class trucks(
    override val vehicleType: String,
    override val vehicleName: String,
    override val yearOfProduction: Int,
    override val usesElectric: Boolean
):Vehicle{
    override fun ignite() {
        TODO("Not yet implemented")
    }
}
fun main(){
    val car1:Car = Car("Car","Toyota",2014,false)
}