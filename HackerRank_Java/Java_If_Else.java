import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        
        scanner.close();
        String answer = "";

        if (N % 2 != 0){
            answer = "Weird";
        }
    
        if (N % 2 == 0){
            if (N >= 2 && N <= 5){
                answer = "Not Weird";
            }
            if (N >= 6 && N <= 20){
                answer = "Weird";
            }
            else{
                answer = "Not Weird";
            }
        }
        System.out.println(answer);
        
    }
}
