import java.util.*;

public class Test {
    public static void main (String[] args) {

        //Test Scanner
//        Scanner sc = new Scanner(System.in);
//        int age = sc.nextInt();
//        int weight = sc.nextInt();
//        System.out.println("Do tuoi cua ban la: " + age);
//        System.out.println("Can nang cua ban la: " + weight);

        // Tim hieu ve Collection trong Java: List, Map, Set
        Set<String> testSet = new HashSet<>();
        Map<String, Integer> testMap = new HashMap<>();
        List<String> testList = new ArrayList<String>();
        Scanner sc = new Scanner(System.in);
        String name;
//        int age;
//        for(int i = 0; i < 5; i++){
//            name = sc.next();
//            age = sc.nextInt();
//            testMap.put(name, age);
//        }
//        for(int i = 0; i < 5; i++){
//            name = sc.next();
//            testSet.add(name);
//        }
        for(int i = 0; i < 5; i++) {
            name = sc.next();
            testList.add(name);
        }
        //testMap(testMap);
        //testSet(testSet);
        testList(testList);
    }
    public static void testMap(Map<String, Integer> testMap) {

        Set<Map.Entry<String, Integer>> outPut = testMap.entrySet();
        System.out.println(outPut);
        Set<String> keySet = testMap.keySet();
        for(String key : keySet ) {
            System.out.println((key + " - " + testMap.get(key)));
        }
    }

    public static void testSet(Set<String> testSet) {
        for(String ele : testSet) {
            System.out.println(ele);
        }
    }

    public static void testList(List<String> testList) {
        for(String ele : testList) {
            System.out.println(ele);
        }
    }
}
