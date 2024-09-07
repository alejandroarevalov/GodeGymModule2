package leccion6;

import java.util.Comparator;

public class ComparadorNombres implements Comparator<String> {
    @Override
    public int compare(String s1, String s2) {
        return s1.length() - s2.length();
    }
}