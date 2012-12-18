package justf0rfun.cybersoccer.model
import justf0rfun.mathematics.geometry.Point

class Matter(val location: Point) {

  def move(timeInterval: Double, velocityX: Double, velocityY: Double) = new Matter(new Point(location.x + velocityX * timeInterval, location.y + velocityY * timeInterval))
  
}