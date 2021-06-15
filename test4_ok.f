integer n
write "Give fibonacci n = "
read n
write fibonacci(n)

end

integer function fibonacci(integer number)
    if(number .eq. 0) fibonacci = 0
    if(number .eq. 1) fibonacci = 1
    fibonacci = fibonacci(number - 1) + fibonacci(number-2)
end