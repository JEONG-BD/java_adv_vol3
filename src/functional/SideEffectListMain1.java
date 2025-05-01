package functional;

import java.util.ArrayList;
import java.util.List;

public class SideEffectListMain1 {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.add("apple");
        list.add("banana");

        System.out.println("before list" + list);
        changeList(list);
        System.out.println("after list" + list);

        List<String> list2 = new ArrayList<>();
        list2.add("apple");
        list2.add("banana");
        List<String> resultList = changeList2(list2);
        System.out.println(resultList);
    }

    private static void changeList(List<String> list) {
        for (int i = 0; i < list.size(); i++) {
            list.set(i, list.get(i) + "_completed");
        }
    }

    private static List<String> changeList2(List<String> list) {
        List<String> result = new ArrayList<>();
        for (String s : list) {
            result.add(s + "_completed");
        }
        return result;
    }
}
