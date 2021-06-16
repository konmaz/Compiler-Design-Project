    do i=1,n
        integer j,k
        a(i*m) = y/2
        k = f(n*m,a,x)
            do j=1,m
            b(j,i+k) = (m-k)*1.
            if (j .eq. k) goto 100
        enddo
        100 continue
    enddo
end