package com.github.retronym.macrocosm

import scala.reflect.macros.Context
import language.experimental.macros

/**
 * Macros useful in the implementation of other macros.
 *
 * Just a placeholder to see how this works out, nothing
 * very useful is currently provided.
 */
object MacrocosmGround {
	def id[A <: AnyRef](a: A): a.type = macro idImpl[a.type]

	def idImpl[A: c.WeakTypeTag](c: Context)(a: c.Expr[A]): c.Expr[A] = a
}
