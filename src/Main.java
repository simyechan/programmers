import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        HashMap<String, String[]> hashMap = new HashMap<>();

        String[] arr1 = {"musi", "frodo", "apeach"};
        String[] arr2 = {"neo", "ryan", "con"};

        hashMap.put("key1", arr1);
        hashMap.put("key2", arr2);

        String[] retrievedArray1 = hashMap.get("key1");
        String[] retrievedArray2 = hashMap.get("key2");

        System.out.println("Array 1: ");
        for (String s : retrievedArray1) {
            System.out.println(s);
        }

        System.out.println("Array 2: ");
        for (String s : retrievedArray2) {
            System.out.println(s);
        }
    }
}