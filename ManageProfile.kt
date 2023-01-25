package Learning_Kotlin

import kotlin.system.exitProcess

class Profile(
    var userName:String,
    var age:Int = 0,
){
    fun chanegeName(newName:String){
        println("Your name has been changed from ${this.userName} to $newName")
        this.userName = newName
    }
}
fun main(){
    println("Good day!!, welcome to faceApp...")
    print("\n\nWould you like to create a profile: ")
    when(readLine()!!.toString().toLowerCase()){
        "yes"-> {
            println("Please enter your username:")
            var userName: String = readLine().toString()
            var profile1 = Profile(userName)
        }
        "no"->{println("Alright then have a nice day....BYE")
            exitProcess(-1)
        }
    }
    println("Thank you for creating a profile with us.\n\n")
    print("Would you like to update your profile: ")
    var response2 :String = readLine()!!.toLowerCase()
    when(response2){
        "yes"->{println("Would like to change your username or you age")
            var response3:String = readLine()!!.toLowerCase()
            when(response3){
                "username"->{}
            }

        }
    }
}