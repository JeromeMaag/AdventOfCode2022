package AoC.days;

import AoC.day;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class day06 implements day {
    @Override
    public String part1(List<String> input) {
        String s = input.get(0);
        int res = 0;
        for (int i = 4; i < s.length(); i++) {
            String fourChars = s.substring(i - 4, i);
            Set<Character> count = fourChars.chars().mapToObj(c -> (char) c).collect(Collectors.toSet());
            if (count.size() == 4) {
                res = i;
                break;
            }
        }
        return String.valueOf(res);
    }

    @Override
    public String part2(List<String> input) {
        int res = 14;
        String s = input.stream().reduce("", String::concat);
        for (int i = 0; i < s.length() - 14; i++) {
            String slice = s.substring(i, i + 14);
            if (slice.chars().distinct().count() == 14) {
                return String.valueOf(res);
            } else {
                res++;
            }
        }
        return s;
    }
}
