class subject(
    val name:String,
    var mandatory:Boolean,
    var teacher:Teacher,
    val classSize:Int,
)
class Teacher(
    val name:String,
    val birthDay:String,
    var age:Int,
)
class Student(
    val id:Int,
    val name:String,
    var age:Int,
    var GPA:Double,
)
class Grade(
    val point:Int,
    val StudentId:Int,
    val topicId:Int,
)
fun main(){
    val teacher1:Teacher = Teacher("Gord Smith","1997/08/21",52)
    val class1:subject = subject("physics",true,teacher1,42)
    println(class1.teacher.name)
}