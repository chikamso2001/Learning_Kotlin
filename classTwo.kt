package Learning_Kotlin// data classes do not necessarily refer to objects but to info about those objects
// Therefore if you have objects with the same info then they are the same, this wouldn't
// be the case if we used normal class to create those objects

data class Persons(
    val name:String,
    val age:Int
){

}
fun main(){
    val person1 = Persons("chikamso",21)
    val person2 = Persons("Neche",17)
    val person3 = Persons("chikamso",21)
    println("$person1\n$person2\n$person3")
    println(person1 == person2)//false
    println(person2 == person3)//false
    println(person1 == person3)//true
    //Let's say I want to make an update to the object's age
    val newPerson1 = person1.copy(age = 22)
    println(newPerson1)
    println(newPerson1 == person1)//false

    //This modified class also allows for destructuring
    //Here is an illustration
    val(name,age) = person2
    println("$name $age")// Neche 17
}