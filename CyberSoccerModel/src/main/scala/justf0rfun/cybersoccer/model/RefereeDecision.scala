package justf0rfun.cybersoccer.model
import justf0rfun.mathematics.geometry.Point

sealed trait RefereeDecision 

object RefereeDecision {
	
	case class KickOff(team: Team) extends RefereeDecision
	case class Goal(team: Team) extends RefereeDecision
	case class ThrowIn(team: Team, throwInPoint: Point) extends RefereeDecision
	case class CornerKick(team: Team, point: Point) extends RefereeDecision
	case class FreeKick(team: Team, point: Point) extends RefereeDecision
	case class Penalty(team: Team) extends RefereeDecision
	case class GoalKick(team: Team) extends RefereeDecision
	case class Finish(winner: Option[Team]) extends RefereeDecision
	
}