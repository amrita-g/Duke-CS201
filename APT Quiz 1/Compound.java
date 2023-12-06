import java.util.*;
public class Compound {
      public int getWeight(String comp, String atomics) {
         // Character[] elements = new Character[10];
          //int[] mass = new int[10];
            String[] welements = atomics.split(",");
            String[] elements = new String[welements.length];
            int[] mass = new int[welements.length];
            for(int i = 0; i<welements.length; i++){
                String[] part = welements[i].split(":");
                elements[i] = part[0];
                mass[i] = Integer.parseInt(part[1]);
            }
            //System.out.println(mass);
          //System.out.println(elements);
            int sum = 0;
            for(int i=0; i<comp.length();i++){
                if(!(i==comp.length()-1)){
                    if(Character.isAlphabetic(comp.charAt(i))){
                    if(Character.isDigit(comp.charAt(i+1))){
                        int num = Integer.parseInt(comp.substring(i+1, i+2));
                        for(int j =0; j<10;j++){
                            if(comp.substring(i,i+1).equals(elements[j])){
                                sum = sum+ (num*mass[j]);
                            }
                        }
                    }
                    else{
                        for(int j = 0; j<10; j++){
                           if(comp.substring(i,i+1).equals(elements[j])){      
                            sum = sum+mass[j];
                            }
                        }
                    }
                }}
                if(i==comp.length()-1){
                    if(Character.isAlphabetic(comp.charAt(i))){
                        for(int j = 0; j<10; j++){
                           if(comp.substring(i,i+1).equals(elements[j])){      
                            sum = sum+mass[j];
                            }
                        }
                    }
                    if(Character.isDigit(comp.charAt(i))){
                        int num = Integer.parseInt(comp.substring(i, i+1));
                        for(int j =0; j<10;j++){
                            if(comp.substring(i,i+1).equals(elements[j])){
                                sum = sum+ (num*mass[j]);
                            }
                        }
                    
                    }
                }
            
          /*
          for(int i = 0; i<atomics.length(); i++){
            for(int e = 0; e<10;e++){
                if(Character.isAlphabetic(atomics.charAt(i))){
                    elements[e] = atomics.charAt(i);
                }
                if(Character.isDigit(atomics.charAt(i))){
                    if(Character.isDigit(atomics.charAt(i+1))){
                        if(Character.isDigit(atomics.charAt(i+2))){
                            mass[e] = Integer.parseInt(atomics.substring(i,i+1))*100 + Integer.parseInt(atomics.substring(i+1,i+2))*10 + Integer.parseInt(atomics.substring(i+2,i+3));
                        }
                        else{
                            mass[e] = Integer.parseInt(atomics.substring(i,i+1))*10 + Integer.parseInt(atomics.substring(i+1,i+2));
                        }
                    }
                    else{
                        mass[e] = Integer.parseInt(atomics.substring(i,i+1))*10 + Integer.parseInt(atomics.substring(i+1,i+2));
                    }
                }
                else{
                    mass[e] = Integer.parseInt(atomics.substring(i,i+1));
                }
            }
          }
          System.out.println(mass);
          System.out.println(elements);
          //atomic arrays are done 
        */}
          return sum;
      }
  }