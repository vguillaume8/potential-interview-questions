/*Challenge
Write a string compression function:

compress(input {string}, sanitize {bool})

The function should satisfy the following requirements:

- Given a string, return a compressed version of that string.
- If a character, ch, occurs exactly one time in a row, then it will be represented by {ch} (e.g. a -> a).
- If a character, ch, occurs (n > 1) times in a row, then it will be represented by {ch}{n} (e.g. aabbaa -> a2b2a2).
- If the sanitize prop is set to true, compress() will strip all undesired characters
 

Examples
 
compress('abc');

// 'abc'
 

compress('abbbcbb');

// 'ab3cb2'
 

compress('a++bbbc');

// 'a+2b3c'
 

compress('a++bbb&c', true);

// 'ab3c'
*/


import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class StringCompression{
    /*
     * Complete the 'compress' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. STRING input
     *  2. BOOLEAN sanitize
     */

    public String compress(String input, boolean sanitize) {
        //aabbbcccc
        String s = "";
        for(int i = 0; i < input.length(); i++){
            char current = input.charAt(i);
            int count = 1;
            int temp = i;
            for(int j = i; j < input.length()-1; j++){
                temp = j;
                if(current == input.charAt(j+1)){
                    count++;///2
                }else{
                    break;
                }
            }
            if(count < 2){
                s = s + current;
            }else{
                s = s + current + count;
                i = temp;
            }
           
        }
       
        return s;
    }

}