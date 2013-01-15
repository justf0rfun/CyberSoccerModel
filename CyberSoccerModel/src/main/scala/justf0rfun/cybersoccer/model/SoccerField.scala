package justf0rfun.cybersoccer.model
import justf0rfun.mathematics.geometry.circular.Circle
import justf0rfun.mathematics.geometry.linear.LineSegment
import justf0rfun.mathematics.geometry.Point
import justf0rfun.mathematics.geometry.Offspring

class SoccerField private (val width: Double, val height: Double, val leftGoal: Goal, val rightGoal: Goal, val kickOffPoint: Circle) {

	lazy val upperLeft = Point(-width / 2, -height / 2)

	lazy val upperRight = Point(width / 2, -height / 2)

	lazy val bottomLeft = Point(-width / 2, height / 2)

	lazy val bottomRight = Point(width / 2, height / 2)

	lazy val upperLine = new LineSegment(upperLeft, upperRight)

	lazy val bottomLine = new LineSegment(bottomLeft, bottomRight)

	lazy val leftLine = new LineSegment(upperLeft, bottomLeft)

	lazy val rightLine = new LineSegment(upperRight, bottomRight)

	lazy val middleLine = new LineSegment(Point(0, -height / 2), Point(0, height / 2))

	lazy val middleCircle: Circle = new Circle(.1 * width, kickOffPoint.location)

	def this(width: Double, height: Double, goalWidth: Double, kickOffPointRadius: Double) {
		this(width, height, new Goal(Point(-width / 2, -goalWidth / 2.), Point(-width / 2, goalWidth / 2.)), new Goal(Point(width / 2, -goalWidth / 2.), Point(width / 2, goalWidth / 2.)), new Circle(kickOffPointRadius, Offspring))
	}

	def isInsideField(point: Point): Boolean = {
		upperLine.isXBetweenAandB(point.x) && leftLine.isYBetweenAandB(point.y)
		//		val location = point
		//		val radius = ball.radius
		//		if (location.x + radius < upperLeft.x) return false
		//		if (upperRight.x < location.x - radius) return false
		//		if (location.y + radius < upperLeft.y) return false
		//		if (bottomRight.y < location.y - radius) return false
		//		return true
	}

	def isOutsideField(point: Point): Boolean = !isInsideField(point)

	def isInsideField(ball: Ball): Boolean = isInsideField(ball.left) || isInsideField(ball.right) || isInsideField(ball.top) || isInsideField(ball.bottom)

	def isOutsideField(ball: Ball): Boolean = !isInsideField(ball)

}