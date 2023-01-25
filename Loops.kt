fun main() {

    //I will try to build a pyramid with a for loop
    for(i in 1..10){
        for(j in 1..i){
            print("i")
            if(j == i){
                if(j == 10){
                    break
                }else print("\n")
            }
        }
    }
    for(i in 10 downTo 1){
        for(j in i downTo 1){
            if(i > j){
                print("i")
                continue
            }else print("\n")
        }
    }
    //Lets print a square
    for(i in 1..6){
        for(j in 1..6){
            print("*  ")
            if(j == 6){
                print("\n")
            }
        }
    }

}