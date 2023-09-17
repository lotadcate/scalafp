def uncurry[A,B,C](f: A=>(B=>C)): (A,B)=>C =
  (a: A, b: B) => f(a)(b)

println(uncurry((a: Int)=>(b: Int)=>a+b)(1, 2))
println(uncurry((a: String) => (b: String) => a+" "+b)("Hello", "World"))
