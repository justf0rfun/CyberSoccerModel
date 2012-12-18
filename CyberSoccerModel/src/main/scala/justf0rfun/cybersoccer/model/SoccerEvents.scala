package justf0rfun.cybersoccer.model

sealed class SoccerEvents {

  case class Goal(team: Team)
  case object KickOff

}