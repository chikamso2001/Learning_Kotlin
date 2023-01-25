interface Animal{
    val breed:String
    fun pet(){

    }
    fun printName(){
        println("Breed is $breed")
    }
}
class Dog(
    override val breed: String
):Animal{
    override fun pet(){
        println("wauff!!!")
    }
}
class Cat(
    override val breed: String
):Animal{
    override fun pet(){
        println("Meauu!!!")
    }
}
fun AnAnimal(animal:Animal){
    animal.pet()
}
fun main(){
    //For a cat
    val cat = Cat("husshy")
    cat.printName()
    cat.pet()
    //For a dog
    val dog = Dog("Husky")
    dog.pet()
    dog.printName()
}