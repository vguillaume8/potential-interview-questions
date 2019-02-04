import java.util.*;

public class MaxStreak {

     /*
     * Complete the 'maxStreak' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER m
     *  2. STRING_ARRAY data
     */

    public static int maxStreak(int m, List<String> data) {
        // Write your code here
        int length = data.size();
        String key = "";
        int count = 0;
        int maxCount = 0;
        for(int i = 0; i < m; i++ ){
            key = key + "Y";
        }
        
        for(int i = 0; i < length; i++){
            System.out.println("data is: "+ data.get(i));
            System.out.println("key is: " + key);
            System.out.println("Current max count is: " + maxCount);
            System.out.println("Current count is: " + count);
            String temp = data.get(i).trim();
            
            if(temp.equals(key)){
                System.out.println("Theres a match!");
                
                count++;
                if(maxCount < count){
                    maxCount = count;
                    
                }
                
            }else{
                count = 0;
            }
            
            
        }
        
        return maxCount;
    
    }
    



}