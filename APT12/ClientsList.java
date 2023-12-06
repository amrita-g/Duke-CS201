import java.util.*;
public class ClientsList {
       public String[] dataCleanup(String[] names) {
            for(int i=0; i<names.length; i++){
                if(names[i].contains(",")){
                    String[] fullname = names[i].split(", ");
                    names[i] = fullname[1]+" "+ fullname[0];
                }
            }
            // names now has first last format of names 
            //bubblesort using charAt and comparing the last names
            String temp = "";
            for(int i=0; i<names.length-1;i++){
                for(int j =0; j<names[i].length()-i;j++){
                    for(int k =0; k<names[i].length();k++){
                        if(names[i].charAt(j)==" "){
                        char lastname1 = names[i].charAt(j+1); //finding lastname
                        }
                    for(int l =0; l<names[j].length();l++){
                        if(names[j].charAt(k)==" "){
                        char lastname2 = names[j].charAt(k+1);
                        }
                    }
                    if(names[j-1]>names[j]){

                    }
                    }
            } 
            return names;
       }
   }
}
