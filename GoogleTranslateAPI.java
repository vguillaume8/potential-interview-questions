/*
Google's translate API is a great tool that allows you to translate text using a REST API. 
The API has a constraint on the number of characters it can process. 
For this exercise let's say it's 100 characters (originally it's 2K characters). 

 Write a function that:

1. takes a text input of any size

2. creates chunks of 100 characters or less

3. sends these to the mock API function for processing

4. assembles the chunks back into a single text

 
Test string:

Do you need an example of a phrase that is a 100 characters long? Look no further, we have your back; however if you need more than that, you will need to get creative and write one yourself to test your code.

Test string:

Do you need an example of a phrase that is a 100 characters long? Look no further, we have your back; 
however if you need more than that, you will need to get creative and write one yourself to test your code.
*/
import java.util.*;

public class GoogleTranslateAPI{

    static String googleTranslate(String textToTranslate) throws Exception {
        if(textToTranslate.length() > 100) {
            throw new Exception("Text is too long");
        } else {
            return textToTranslate.toUpperCase();
        }
    }

    static String translate(String text) throws Exception{
        String[] list = text.split(" ");
        
        for(int i = 0; i < list.length; i++){
            System.out.println(list[i]);
        }
        
        String translated = "";
        int count = 0;
        String temp = "";
        
        for(int i = 0; i < list.length; i++){
           count = count + list[i].length();
           
           if(count + list[i].length() + 1 < 100){
               temp = temp + list[i] + " ";
               count = count + list[i].length() + 1;
           }else{
               translated = translated + googleTranslate(temp);
               count = 0;
               temp = "";
           }
        }
        
        if(count > 0){
            translated = translated + googleTranslate(temp);
        }
        
        return translated;
    }
    
     public static void main(String[] args) throws Exception{
        String res;
        String textToTranslate = "Do you need an example of a phrase that is a 100 characters long? Look no further, we have your back; however if you need more than that, you will need to get creative and write one yourself to test your code.";
      
        res = translate(textToTranslate);
        System.out.println(res);
    }
}

