package justf0rfun.cybersoccer.model
import justf0rfun.mathematics.geometry.Point
import justf0rfun.mathematics.geometry.linear.LineSegment

class Goal(val leftPostLocation: Point, val rightPostLocation: Point) {

	lazy val goalLine = new LineSegment(leftPostLocation, rightPostLocation)
	
}