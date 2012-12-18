package justf0rfun.cybersoccer.model
import justf0rfun.mathematics.geometry.Point

class Body(override val location: Point, val velocityX: Double, val velocityY: Double, val rangeRadius: Double, val team: Team, val shoutings: Seq[Any]) extends Matter(location) {

  //Possibly needs an identity to distinguish multiple instances of one player of other player's instances 
  
}