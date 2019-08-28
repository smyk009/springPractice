package JavaPractice;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

class Result {

    /*
     * Complete the 'maxNutrients' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. LONG_INTEGER k
     */

    public static int maxNutrients(int n, long k) {
    // Write your code here
    int a[] = new int[n];
    int sum = 1;
    for(int i=0; i<a.length; i++){
        a[i] = sum;
        sum++;
    }

    int currentSum = a[0];
    int maxSum = 0; 
    int start = 0;
    for(int i=0; i<n; i++){
        if(currentSum<=maxSum){
            maxSum = Math.max(maxSum, currentSum);
        }
        while(start<i){
            currentSum -= a[start];
            start++;
        }
        if(a[i] != k)
        currentSum += a[i];
    }
    if(currentSum != k){
        maxSum = Math.max(maxSum, currentSum);
    }
    
    return maxSum;
    
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
//
//        int n = Integer.parseInt(bufferedReader.readLine().trim());
//
//        long k = Long.parseLong(bufferedReader.readLine().trim());

        int result = Result.maxNutrients(2,2);
System.out.println(result);
//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();
//
//        bufferedReader.close();
//        bufferedWriter.close();
    }
}