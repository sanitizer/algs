package playground;

import org.apache.commons.lang3.time.StopWatch;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

/**
 * Created by sanitizer on 1/6/2018.
 */
public class LooperTest {
    final Random r = new Random();

    private ArrayList<Integer> getArray(int size) {
        ArrayList<Integer> result = new ArrayList<>(size);

        for (int i = 0; i < size; i++) {
            result.add(r.nextInt());
        }

        return result;
    }

    private HashMap<Integer, Integer> getMap(int size) {
        HashMap<Integer, Integer> result = new HashMap<>(size);

        for (int i = 0; i < size; i++) {
            result.put(r.nextInt(), r.nextInt());
        }

        return result;
    }

    @Test
    public void forEach() throws Exception {
        StopWatch w = new StopWatch();
        ArrayList<Integer> test = getArray(1000000);
        w.start();
        Looper.forEach(test);
        w.stop();
        printTime(w.getTime(), "forEach");
    }

    @Test
    public void classicForLengthCheck() throws Exception {
        StopWatch w = new StopWatch();
        ArrayList<Integer> test = getArray(1000000);
        w.start();
        Looper.classicLengthCheck(test);
        w.stop();
        printTime(w.getTime(), "classicForLengthCheck");
    }

    @Test
    public void classicForLengthCheckOnce() throws Exception {
        StopWatch w = new StopWatch();
        ArrayList<Integer> test = getArray(1000000);
        w.start();
        Looper.classicForLengthCheckOnce(test);
        w.stop();
        printTime(w.getTime(), "classicForLengthCheckOnce");
    }

    @Test
    public void forEachMap() throws Exception {
        StopWatch w = new StopWatch();
        HashMap<Integer, Integer> test = getMap(1000000);
        w.start();
        Looper.forEach(test);
        w.stop();
        printTime(w.getTime(), "forEachMap");
    }

    @Test
    public void forEachSetOnceMap() throws Exception {
        StopWatch w = new StopWatch();
        HashMap<Integer, Integer> test = getMap(1000000);
        w.start();
        Looper.forEachKeySetOnce(test);
        w.stop();
        printTime(w.getTime(), "forEachSetOnceMap");
    }

    @Test
    public void classicForEachEntryCheckMap() throws Exception {
        StopWatch w = new StopWatch();
        HashMap<Integer, Integer> test = getMap(1000000);
        w.start();
        Looper.classicForEachEntryCheckMap(test);
        w.stop();
        printTime(w.getTime(), "classicForEachEntryCheckMap");
    }

    private void printTime (long time, String methodName) {
        System.out.println("Took " + methodName + " " + time + " milliseconds");
    }

}