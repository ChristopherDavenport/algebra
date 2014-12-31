package algebra
package ring

import annotation.tailrec
import scala.{specialized => sp}

/**
 * Rig consists of:
 * 
 *  - a commutative monoid for addition (+)
 *  - a monoid for multiplication (*)
 * 
 * Alternately, a Semiring can be thought of as a ring without
 * multiplicative or additive inverses (or as a semiring with a
 * multiplicative identity).

 * Mnemonic: "Rig is a Ring without 'N'egation."
 */
trait Rig[@sp(Byte, Short, Int, Long, Float, Double) A] extends Any with Semiring[A] with MultiplicativeMonoid[A]

object Rig extends AdditiveMonoidFunctions with MultiplicativeMonoidFunctions {
  @inline final def apply[A](implicit ev: Rig[A]): Rig[A] = ev
}
