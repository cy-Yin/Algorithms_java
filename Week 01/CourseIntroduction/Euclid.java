// Book Exercise 1.1.24

/*
 * Compute the greatest common divisor of 
 * two nonnegative integers p and q as follows: 
 * If q is 0, the answer is p. If not, divide p by q
 * and take the remainder r. The answer is the
 * greatest common divisor of q and r.
 * 
 * Compilation:  javac Euclid.java
 * Execution:    java Euclid p q
 * Reads two command-line arguments p and q and computes the greatest
 * common divisor of p and q using Euclid's algorithm.
 */

public class Euclid {
    public static int gcd(int p, int q) {
        if (q == 0) return p;
        int r = p % q;
        return gcd(q, r);
    }
    public static void main(String[] args) {
        int p = Integer.parseInt(args[0]);
        int q = Integer.parseInt(args[1]);
        int d = gcd(p, q);
        System.out.println("gcd(" + p + ", " + q + ") = " + d);
    }
}
