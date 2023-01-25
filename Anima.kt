open class chicken(val breed:String)

class broiler(breed:String):chicken(breed){

}
fun main(){
    val myChicken = broiler("broiler")
    println(myChicken.breed)
}