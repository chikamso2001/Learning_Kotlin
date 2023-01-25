abstract class ShapeDrawer(){
    fun drawSquare(){
        drawLine()
    }
    fun drawRectangle(){
        drawLine()
    }
    internal abstract fun drawLine()
}
class AndroidShapeDrawer:ShapeDrawer(){
    override fun drawLine() {
        println("Test Code- Draw Line for Android platforms")
    }
}
class DesktopShapeDrawer:ShapeDrawer(){
    override fun drawLine() {
        println("Test Code- Draw line for Desktop platforms")
    }
}
fun main(){
    val androidDrawer:ShapeDrawer = AndroidShapeDrawer()
    androidDrawer.drawSquare()
    val desktopDrawer:ShapeDrawer = DesktopShapeDrawer()
    desktopDrawer.drawRectangle()
}