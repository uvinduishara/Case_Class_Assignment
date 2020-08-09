import scala.math.pow

object CaseClass extends App{
  
  val p1 = Point(3,2)
  val p2 = Point(7,8)
  
  println(p1+p2)
  println(p1.move(2,3))
  println(p1.distance(p2))
  println(p1.invert())
}

case class Point(x:Int,y:Int){
  
  def +(p:Point) = Point(this.x+p.x,this.y+p.y)
  def move(dx:Int,dy:Int) = Point(this.x+dx,this.y+dy)
  def distance(p:Point) = {
    val dx = scala.math.pow(p.x-this.x,2.0)
    val dy = scala.math.pow(p.y-this.y,2.0)
    
    scala.math.pow(dx+dy,0.5)
  }
  def invert() = Point(this.y,this.x)
}