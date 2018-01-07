package playground;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Created by sanitizer on 1/6/2018.
 */
public class Looper {

    static void forEach(ArrayList<Integer> a) {
        for (Integer i: a) {
            i = i;
//            System.out.println(i);
        }
    }

    static void classicLengthCheck(ArrayList<Integer> a) {
        for(int i = 0; i < a.size(); i++) {
            a.get(i);
//            System.out.println(i);
        }
    }

    static void classicForLengthCheckOnce(ArrayList<Integer> a) {
        for (int i = 0, size = a.size(); i < size; i++) {
            a.get(i);
//            System.out.println(i);
        }
    }

    static void forEach(HashMap<Integer, Integer> a) {
        for (Integer i: a.keySet()) {
            a.get(i);
//            System.out.println(i);
        }
    }

    static void forEachKeySetOnce(HashMap<Integer, Integer> a) {
        Set<Integer> set = a.keySet();
        for (Integer i: set) {
            a.get(i);
//            System.out.println(i);
        }
    }

    static void classicForEachEntryCheckMap(HashMap<Integer, Integer> a) {
        for(Map.Entry e: a.entrySet()) {
            e.getValue();
//            System.out.println(i);
        }
    }

}
