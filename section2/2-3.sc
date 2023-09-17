def curry[A,B,C](f: (A, B) => C): A => (B => C) =
  (a: A) => (b: B) => f(a, b)

val f = (a: Int, b: Int) => (a+b).toString


println(f(1, 2))
println(curry(f)(1)(2))
