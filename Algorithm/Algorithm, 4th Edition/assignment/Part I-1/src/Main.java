import java.util.Arrays;

public class Main {
    public static int gcd(int q, int p)
    {
        while (q != 0 && p != 0)
        {
            p = p % q;
            if (p != 0) {
                q = q % p;
            }
        }
        if (q == 0)
        {
            return p;
        }
        else
        {
            return q;
        }
    }
    public static void main(String[] args)
    {
        System.out.println(gcd(105, 24));
    }
}