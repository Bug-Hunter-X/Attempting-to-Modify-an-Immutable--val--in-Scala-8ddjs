# Attempting to Modify an Immutable `val` in Scala

This example showcases a frequent error in Scala: trying to change the value of a variable declared with `val`. In Scala, `val` signifies immutability.  This means once a `val` is assigned a value, it cannot be reassigned.

The `bug.scala` file contains code demonstrating this error. The `bugSolution.scala` file shows how to properly handle situations where you need a mutable variable using `var`.

This is a fundamental concept in Scala's functional programming paradigm, which emphasizes immutability for increased code predictability and easier concurrency.