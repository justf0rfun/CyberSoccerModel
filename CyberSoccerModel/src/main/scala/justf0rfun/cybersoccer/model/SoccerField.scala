package justf0rfun.cybersoccer.model
import justf0rfun.mathematics.geometry.Point

class SoccerField private (val width: Double, val height: Double, val leftGoal: Goal, val rightGoal: Goal) {

  val kickOffPoint = Point(width / 2, height / 2)

  def this(width: Double, height: Double, goalWidth: Double) = {
    this(width, height, new Goal(Point(0, 0.5 - goalWidth / 2.), Point(0, 0.5 + goalWidth / 2.)), new Goal(Point(0, 0.5 - goalWidth / 2.), Point(0, 0.5 + goalWidth / 2.)))
  }

}