def isSorted[A] (as: Array[A], ordered: (A, A) => Boolean): Boolean =
  @annotation.tailrec
  def loop(n: Int): Boolean =
    if (n >= as.length - 1) then true
    else if ordered(as(n), as(n+1)) then loop(n+1)
    else false
  loop(0)

println(isSorted(Array(1, 3, 5), (a: Int, b: Int) => a <= b))
println(isSorted(Array(4, 3, 2), (a: Int, b: Int) => a > b))
println(isSorted(Array(1, 3, 6), (a: Int, b: Int) => a > b))
