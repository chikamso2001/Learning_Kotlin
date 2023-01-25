fun main(args : Array<String>){
    print("Enter the day of the week: ")
    var day : String = readLine()!!.toString()
    var openHours : String = when(day){
        "Monday" -> "8AM to 12PM (8:00-12:00)"
        "Tuesday","Wednesday","Thursday" -> "8AM to 6PM(8:00-18:00)"
        "Friday" -> "8AM to 9PM(8:00-21:00)"
        "Saturday","Sunday" -> "8AM to 4PM(8:00-16:00)"
        else -> "Currently not available."
    }
    print("Enter hour of the day between 0 and 23: ")
    var Hour : Int = readLine()!!.toInt()
    var isOpen : Boolean = when(day){
        "Monday" -> Hour in 8..12
        "Tuesday","Wednesday","Thursday" -> Hour in 8..18
        "Friday" -> Hour in 8..21
        "Saturday","Sunday" -> Hour in 8..16
        else -> false
    }
    var openOrClose : String = when(isOpen){
        true -> "OPEN"
        false -> "CLOSE"
        else -> "Currently not available"
    }
    println("Open $openHours, currently we are $openOrClose")
}