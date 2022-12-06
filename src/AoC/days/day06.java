package AoC.days;

import AoC.day;

import java.util.List;

public class day06 implements day {
    @Override
    public String part1(List<String> input) {
        int res = 3;
        boolean i = true;

        for (String s : input) {
            String[] sPars = s.trim().split("");
            while (i) {
                res++;
                String one = sPars[res - 3];
                String two = sPars[res - 2];
                String three = sPars[res - 1];
                String four = sPars[res];
                if (one.equals(two) || one.equals(three) || one.equals(four) || two.equals(three) || two.equals(four) || three.equals(four)) {
                    i = true;
                } else {
                    i = false;
                    res++;
                }
            }
            break;
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
