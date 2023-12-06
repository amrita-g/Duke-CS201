import java.util.*;

public class MemberCheck {
    public String[] whosDishonest(String[] club1, String[] club2, String[] club3) {
       HashSet<String> club1Set = new HashSet<>(Arrays.asList(club1));
       HashSet<String> club2Set = new HashSet<>(Arrays.asList(club2));
       HashSet<String> club3Set = new HashSet<>(Arrays.asList(club3));
       HashSet<String> dishonest = new HashSet<>();

       for (String member : club1Set) {
              if (club2Set.contains(member) || club3Set.contains(member)) {
                  dishonest.add(member);
              }
       }

       for (String member : club2Set) {
              if (club1Set.contains(member) || club3Set.contains(member)) {
                  dishonest.add(member);
              }
       }

       for (String member : club3Set) {
              if (club1Set.contains(member) || club2Set.contains(member)) {
                  dishonest.add(member);
              }
       }

       TreeSet<String> sortedDishonest = new TreeSet<>(dishonest);
        String[] res = new String[sortedDishonest.size()];
        int count = 0;
        for (String member : sortedDishonest) {
            res[count] = member;
            count++;
       }

       return res;

    }
 }