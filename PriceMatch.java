import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;


public class PriceMatch{

    // Complete the roundPricesToMatchTarget function below.
    static List<Integer> roundPricesToMatchTarget(List<Float> prices, int target) {
        // Will store the prices in a map for easier modification
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        
        // Rounds the values up and populates the map
        for(int i = 0; i < prices.size(); i++){
            int round = (int)Math.ceil(prices.get(i));
            map.put(i, round);
        }
        // Checks if the values are equal to the target if not, the values are modified.
        if(target == countMap(map)){
            return popList(map);
        }else{
            for(int i =0; i < map.size(); i++){
                int value = map.get(i);
                map.put(i, value - 1);
                if(target == countMap(map)){
                    return popList(map);
                }
                
            }
        }
        
        return popList(map);


    }
//------------------------------------------------------------------
    // Populates a list with the map values
    static List<Integer> popList(HashMap<Integer, Integer> map){
        List<Integer> list = new ArrayList<Integer>();
        for(int i = 0; i < map.size(); i++){
                list.add(map.get(i));
            }
            return list;

    }
//------------------------------------------------------------------
    // Computes the sum of values in the map
    static int countMap(HashMap<Integer, Integer> map){
        int sum = 0;
        for(int i = 0; i < map.size(); i++){
            sum = sum + map.get(i);
        }
        return sum;
    }


}