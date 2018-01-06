package playground;

import java.util.ArrayList;
import java.util.HashMap;

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

    static void classicForLengthCheck(ArrayList<Integer> a) {
        for(int i = 0; i < a.size(); i++) {
            i = i;
//            System.out.println(i);
        }
    }

    static void classicForLengthCheckOnce(ArrayList<Integer> a) {
        for (int i = 0, size = a.size(); i < size; i++) {
            i = i;
//            System.out.println(i);
        }
    }

    static void forEach(HashMap<Integer, Integer> a) {
        for (Integer i: a.keySet()) {
            i = i;
//            System.out.println(i);
        }
    }

    static void classicForLengthCheck(HashMap<Integer, Integer> a) {
        for(int i = 0; i < a.size(); i++) {
            i = i;
//            System.out.println(i);
        }
    }

    static void classicForLengthCheckOnce(HashMap<Integer, Integer> a) {
        for (int i = 0, size = a.size(); i < size; i++) {
            i = i;
//            System.out.println(i);
        }
    }

}
