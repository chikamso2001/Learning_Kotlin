abstract class ShapeDraw(){

    abstract fun drawLine(fromX:Int,fromY:Int,toX:Int,toY:Int)
    fun drawSquare(x:Int,y:Int,size:Int){
        drawLine(x,y,x+size,y)
        drawLine(x+size,y,x+size,y+size)
        drawLine(x,y,x,y+size)
        drawLine(x,y+size,x+size,y+size)
    }
    fun drawRectangle(x: Int,y: Int,height:Int,width:Int){
        drawLine(x,y,x+width,y)
        drawLine(x+width,y,x+width,y)
    }
}