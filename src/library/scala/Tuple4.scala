
/*                     __                                               *\
**     ________ ___   / /  ___     Scala API                            **
**    / __/ __// _ | / /  / _ |    (c) 2002-2008, LAMP/EPFL             **
**  __\ \/ /__/ __ |/ /__/ __ |    http://scala-lang.org/               **
** /____/\___/_/ |_/____/_/ | |                                         **
**                          |/                                          **
\*                                                                      */

// $Id$

// generated by genprod on Tue Apr 22 16:48:01 CEST 2008

package scala

/** Tuple4 is the canonical representation of a @see Product4
 *
 */
case class Tuple4[+T1, +T2, +T3, +T4](_1:T1, _2:T2, _3:T3, _4:T4)
  extends Product4[T1, T2, T3, T4]  {

   override def toString() = {
     val sb = new StringBuilder
     sb.append('(').append(_1).append(',').append(_2).append(',').append(_3).append(',').append(_4).append(')')
     sb.toString
   }

}
