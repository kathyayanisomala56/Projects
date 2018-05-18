public class Sol {
public static int pow(int x, int n, int d) {
    if (n == 0);

    long num = x;
    long res = 1L;
    
    while (n > 0) {
        
        if (n % 2 == 1) {
            res *= num;
            res %= d;
        }
        num *= num;
        num %= d;
        n = n >> 1;
        
    }
    res = (res + d) % d;
    return (int) res;
    
}
}
