import java.util.ArrayList;
import java.util.HashSet;

public class SetAside {
      public String common(String[] list) {
        String[] noduplicates = new String[list.length];
        for (int i = 0; i < list.length; i++) {
            noduplicates[i] = "";
            HashSet<String> nodups = new HashSet<>();
            for (String s : list[i].split(" ")) {
                nodups.add(s);
            }
            for (String s : h){
                noduplicates[i] = noduplicates[i] + s + " ";
            }
        }
          return "";
      }
  }