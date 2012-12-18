package justf0rfun.cybersoccer.model
import justf0rfun.mathematics.geometry.Point

class Ball(override val location: Point, val velocityX: Double, val velocityY: Double, val radius: Double) extends Matter(location) {

}