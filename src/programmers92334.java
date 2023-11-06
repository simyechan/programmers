import java.util.*;

public class programmers92334 {
    public static void main(String[] args) {
        String[] id_list = {"muzi", "frodo", "apeach", "neo" };
        String[] report = {"muzi frodo", "apeach frodo", "frodo neo", "muzi neo", "apeach muzi" };
        Integer k = 2;

        int[] answer = new int[id_list.length];

        Map<String, Integer> nameId = new HashMap<>();
        Map<String, Set<String>> reportName = new HashMap<>();

        for (int i = 0; i < id_list.length; i++) {
            nameId.put(id_list[i], i);
            reportName.put(id_list[i], new HashSet<>());
        }

        for (String s : report) {
            String[] name = s.split(" ");
            reportName.get(name[1]).add(name[0]);
        }

        for (String s : reportName.keySet()) {
            if (reportName.get(s).size() >= k) {
                for (String id : reportName.get(s)) {
                    answer[nameId.get(id)] += 1;
                }
            }
        }

        //return answer;
    }
}
