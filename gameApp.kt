//Store and display the player's full name
//Store, manipulate and display the player's score data
//Store and display a personal best score(Player gets a score for each level played)
//Display the winning player's name and their total score and their best level score
class Player(
    val name:String,
    val SurName:String,
    var totalScore:Double = 0.0,
    var personalBestScore:Double = 0.0,
){
    fun fullName():String{
        return "$name $SurName"
    }

}
class Scores(){

    fun checkIfBest(best:Int,current:Int):Int{
        return if(best > current){
            best
        }else current
    }
}
fun main(){
    val P1 = Player("Nicola","Tesla")
    val P2 = Player("Thomas","Edison")
    println("${P1.fullName()}\n${P2.fullName()}")
}