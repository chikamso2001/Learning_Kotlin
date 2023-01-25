fun main(args : Array<String>){
    //Task 1
    println(456 * 789)
    println(1+2*3+4*5+6*7+8*9)
    println((1+2)*3+4*5+6*(7+8)*9)
    println(13530.0/1.23)
    println("\nThe next task\n")
    //Task 2
    val scoreLevel1 = 79
    val scoreLevel2 = 92
    val scoreLevel3 = 86
    //
    var totalScore : Int = scoreLevel1 + scoreLevel2 + scoreLevel3
    var averageScore : Int = totalScore / 3
    println("The total score is $totalScore")
    println("The average score is $averageScore")
    val boostMultiplier = 4
    val scoreBoost = totalScore * boostMultiplier
    val finalBoostScore = totalScore + scoreBoost
    println("Score boost is: $scoreBoost")
    println("Final boosted score is $finalBoostScore")

}