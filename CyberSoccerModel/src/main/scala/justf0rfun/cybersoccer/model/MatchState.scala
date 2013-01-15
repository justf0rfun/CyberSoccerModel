package justf0rfun.cybersoccer.model

class MatchState(val field : SoccerField, val ball: Ball, val bodies: Iterable[Body], val host: Team, val guest: Team, val hostTargetGoal: Goal, val guestTargetGoal: Goal, val kickingBody: Option[Body]) {

	/**
	 * the time where this match state was created
	 */
//	val currentTime = System.nanoTime()

	/**
	 * the elapsed time since the beginning of the match, calculated with this state's creation time
	 */
//	def elapsedTime = currentTime - begin

	/**
	 * the elapsed time since the creation time of preceding the state and this state's creation time
	 */
//	def elapsedTimeSincePrecedingMatchState = lastMatchStateTime - currentTime

	/**
	 * the targeted finish of the match
	 */
//	def finish = begin + matchConfiguration.duration

//	def remainingTime = matchConfiguration.duration - elapsedTime

//	def isFinished = remainingTime <= 0

//	def realElapsedTime = System.nanoTime() - begin

//	def realRemainingTime = matchConfiguration.duration - realElapsedTime

//	def realElapsedTimeSincePrecedingMatchState = lastMatchStateTime - System.nanoTime()

//	def realElapsedTimeSinceThisMatchState = System.nanoTime() - currentTime
//
//	def isReallyFinished = realRemainingTime <= 0

//	def nanoSecondsToMilliSeconds(nanoSeconds: Long) = nanoSeconds / 1000000

//	def milliSecondsToNanoSeconds(milliSeconds: Long) = milliSeconds * 1000000

	def oponent(team: Team): Team = team match {
		case team if (team == host) => guest
		case team if (team == guest) => host
	}

	def leftTeam = if (hostTargetGoal == field.rightGoal) host else guest

	def rightTeam = oponent(leftTeam)

}