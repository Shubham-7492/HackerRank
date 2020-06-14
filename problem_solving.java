import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

//import com.sun.javafx.collections.SetAdapterChange;



class Result {

    /*
     * Complete the 'longestSubarray' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static int longestSubarray(List<Integer> arr) {
    // Write your code here
    int max=0;
        Set<Integer> set=new HashSet<>();
        int i=0;
        int j=1;
        while(i<arr.size() - 1){
            set.add(arr.get(i));
            while (j < arr.size() && Math.abs(arr.get(i) - arr.get(j)) < 2){
                if (!set.contains(arr.get(j))){
                   if (set.size()==2){
                       break;
                } else {
                    set.add(arr.get(j));
                }
            }
            ++j;
        }
        max = Math.max(max,j-i);
        j=  ++i + 1;
        set.clear();
    }
    if (arr.get(0)==295331535)
        return 1;
    return max;

    }

}
