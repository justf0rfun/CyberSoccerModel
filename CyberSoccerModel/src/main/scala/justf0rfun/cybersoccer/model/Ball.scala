package justf0rfun.cybersoccer.model

import justf0rfun.mathematics.geometry.Point
import scala.math.pow
import scala.math.min
import scala.math.max
import justf0rfun.mathematics.geometry.linear.LineSegment
import justf0rfun.mathematics.geometry.linear.Vector

class Ball(val location: Point, val radius: Double, val move: Move, val friction: Double) {

	def diameter = 2 * radius

	def left = new Point(location.x - radius, location.y)

	def right = new Point(location.x + radius, location.y)

	def top = new Point(location.x, location.y - radius)

	def bottom = new Point(location.x, location.y + radius)

	def move(timeInterval: Double): Ball = {
		val newMove = new Move(move.vector * pow(friction, timeInterval))
		new Ball(move.vector * timeInterval point(location), radius, newMove, friction)
	}
	
	def kick(kick: Kick, timeInterval: Double): Ball = {
//		val validatedKick = new Kick(new Vector(kick.vector.angle, max(0, min(kick.vector.distance, matchConfiguration.kickForceMaximum))))
		//			val inaccuracy = Random.nextDouble() * matchConfiguration.kickAngleInaccuracyMaximum
		return new Ball(location, radius, new Move(kick.vector), friction)
	}
	

	override def toString = "Ball %s: radius = %f,\tmove: %s".format(location, radius, move)

}