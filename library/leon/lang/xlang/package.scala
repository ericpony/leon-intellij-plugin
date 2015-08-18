/* Copyright 2009-2015 EPFL, Lausanne */

package leon.lang

import leon.annotation._

package object xlang {
  @ignore
  def waypoint[A](i: Int, expr: A): A = expr

  @ignore
  def epsilon[A](pred: (A) => Boolean): A = throw new RuntimeException("Implementation not supported")
}
