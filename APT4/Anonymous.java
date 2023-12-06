import java.util.HashMap;
import java.util.Map;
import java.util.*;
import java.io.*;

public class Anonymous {
    public int howMany(String[] headlines, String[] messages) {
    int messageCounter = 0;

    int charCounter = 0;
    HashMap<String, Integer> freq = new HashMap<String, Integer>();
   
    String alphabet = "abcdefghijklmnopqrstuvwxyz";
    for(int i=0;i<alphabet.length();i++){
        freq.put(alphabet.substring(i,i+1),0); //we are adding every character in the alphabet into freq hashmap and initializing to 0
       
    }
    for(String s: headlines){
        String[] arr = s.split(" ");
        for(String word:arr){
            for(int i=0; i<word.length();i++){
                freq.put(word.toLowerCase().substring(i,i+1),freq.get(word.toLowerCase().substring(i,i+1))+1);
           
            }
        }
    
    }

    for(String s: messages){
        charCounter=0;
        String[] arr = s.split(" ");
        HashMap<String, Integer> messageFreq = new HashMap<String, Integer>();
        for(int i=0;i<alphabet.length();i++){
            messageFreq.put(alphabet.substring(i,i+1),0); //we are adding every character in the alphabet into freq hashmap and initializing to 0
           
        }

        for(String word:arr){
        for(int i=0; i<word.length();i++){
            messageFreq.put(word.toLowerCase().substring(i,i+1),messageFreq.get(word.toLowerCase().substring(i,i+1))+1);
           
        }
    }
    for(Map.Entry<String, Integer> entry: messageFreq.entrySet()){
        if(entry.getValue()<=freq.get(entry.getKey())){
            charCounter+=1;
        }
    }

    if(charCounter==messageFreq.size()){
        messageCounter+=1;
    }
    //System.out.println(freq);
    }

    return messageCounter;


    }
}

