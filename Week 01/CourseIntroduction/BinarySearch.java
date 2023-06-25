import java.util.Arrays;
import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class BinarySearch {
    public static int rank(int key, int[] a) // key and a are parameter variables
    {
        int lo = 0; // initializing declaration statement
        int hi = a.length - 1;
        while(lo <= hi)
        {
            int mid = lo + (hi - lo) / 2;
            if      (key < a[mid]) hi = mid - 1;
            else if (key > a[mid]) lo = mid + 1;
            else                   return mid;
        }
        return -1;
    }

    public static void main(String[] args) // unit test client; void: no return value
    {
        int[] whitelist = In.readInts(args[0]);
        Arrays.sort(whitelist); // call a method in a Java library
        while(!StdIn.isEmpty()) // call a method in our standard library
        {
            int key = StdIn.readInt();
            if(rank(key, whitelist) < 0) // call a local method
                StdOut.println(key);
        }
    }
}

/*
 * two static methods rank()和main()
 * line 1-4: import some java libraries
 * code must be in file BinarySearch.java
 */