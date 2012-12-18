package justf0rfun.cybersoccer.model

class MatchState(val ball: Ball, val bodies: Iterable[Body], val events: List[SoccerEvents], val host: Team, val guest: Team) {

}