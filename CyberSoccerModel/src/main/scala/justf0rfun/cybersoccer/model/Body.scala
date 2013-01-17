package justf0rfun.cybersoccer.model
import scala.math.abs
import justf0rfun.mathematics.geometry.Point
import justf0rfun.mathematics.geometry.circular.Circle
import justf0rfun.mathematics.geometry.linear.LineSegment
import justf0rfun.mathematics.geometry.linear.Vector

class Body(val team: Team, val index: Int, val location: Point, val move: Move, val rangeRadius: Double, val velocityMaximum: Double, val kickForceMaximum: Double, val shoutings: Seq[Any]) {

	def isBallInRange(ball: Ball) = location.distance(ball.location) <= rangeRadius

	def circle = new Circle(rangeRadius, location)
	
	def move(move: Move, timeInterval: Double): Body = {
		val validatedMove = if (abs(move.vector.distance) <= velocityMaximum) {
			move 
		} else {
			new Move(Vector.createPolarVector(move.vector.angle, velocityMaximum))
		}
//		val distance = move.vector.distance * timeInterval
//		val newLocation = new LineSegment(location, move.directionAngle, distance).pointB
//		println(move.vector, validatedMove.vector)
//		println(location, validatedMove.vector * timeInterval, validatedMove.vector * timeInterval point(location))
		new Body(team, index, validatedMove.vector * timeInterval point(location), validatedMove, rangeRadius, velocityMaximum, kickForceMaximum, shoutings)
	}	
	
	override def toString = "Body %s: team = \"%s\",\tindex = %d,\tradius = %f,\tmove = %s".format(location, team, index, rangeRadius, move)
	
}