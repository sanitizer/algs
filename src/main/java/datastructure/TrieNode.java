package datastructure;

import org.apache.commons.lang3.StringUtils;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by sanitizer on 12/23/2017.
 */
public class TrieNode {

    private Map<Character, TrieNode> children = new HashMap<>();
    private boolean complete = false;
    private int size = 0;

    public void add(final String value) {
        if (StringUtils.isBlank(value)) {
            complete = true;
            return;
        }

        final char letter = value.charAt(0);
        if (!children.containsKey(letter)) {
            children.put(letter, new TrieNode());
            size++;
        }

        children.get(letter).add(value.substring(1));
    }

    public boolean isCompleteWord(final String value) {
        if (StringUtils.isBlank(value)) {
            return complete;
        }

        final char letter = value.charAt(0);
        if (!children.containsKey(letter)) {
            return false;
        }

        return children.get(letter).isCompleteWord(value.substring(1));
    }

    public int numOfChildren(final String value) {
        if (StringUtils.isBlank(value)) {
            return size;
        }

        final char letter = value.charAt(0);
        if (!children.containsKey(letter)) {
            return 0;
        }

        if (value.length() > 1) {
            return children.get(letter).numOfChildren(value.substring(1));
        }

        return children.get(letter).numOfChildren();
    }

    private int numOfChildren() {
        int sum = 0;
        for (Map.Entry<Character, TrieNode> keyVal : children.entrySet()) {
            sum += keyVal.getValue().numOfChildren();
        }

        return sum + size;
    }

}