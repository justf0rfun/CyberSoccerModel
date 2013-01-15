package justf0rfun.cybersoccer.model

import justf0rfun.mathematics.geometry.linear.Vector

//TODO Possible candidate as a value class in new scala version (must extend AnyVal). What if this must the serializable or otherwise be tranfered over a network?
class Move(val vector: Vector) {

//	override def toString = "Move: angle = %s,\tvelocity = %f)".format(directionAngle, velocity)

}