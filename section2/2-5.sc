def compose[A,B,C](f: B=>C, g: A=>B): A=>C =
  (a: A) => f(g(a))

val f = (b: String) => b.toInt * 10
val g = (a: Int) => a.toString

println(compose(f, g)(10))
println(f.compose(g)(100))
