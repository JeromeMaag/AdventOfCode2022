package AoC.days;

import AoC.day;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class day01 implements day {
    @Override
    public String part1(List<String> input) {

        List<Integer> i = new ArrayList<>();
        i.add(0);
        for (String s : input) {
            if (s.isEmpty()) {
                i.add(0);
            } else {
                int x = i.get(i.size() - 1);
                x += Integer.parseInt(s);
                i.set(i.size() - 1, x);
            }
        }
        Collections.sort(i);
        Collections.reverse(i);

        return String.valueOf(i.get(0));
    }

    @Override
    public String part2(List<String> input) {
        List<Integer> i = new ArrayList<>();
        i.add(0);
        for (String s : input) {
            if (s.isEmpty()) {
                i.add(0);
            } else {
                int x = i.get(i.size() - 1);
                x += Integer.parseInt(s);
                i.set(i.size() - 1, x);
            }
        }
        int sum = i.stream().sorted(Collections.reverseOrder())
                .limit(3)
                .mapToInt(Integer::intValue)
                .sum();

        return String.valueOf(sum);
    }
}
