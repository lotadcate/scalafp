def fib(n: Int): Int =
  if n == 0 || n == 1 then n
  else fib(n-1) + fib(n-2)

print(fib(6))
