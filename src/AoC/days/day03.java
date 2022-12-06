package AoC.days;

import AoC.day;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class day03 implements day {
    String asciiLowercase = "abcdefghijklmnopqrstuvwxyz";
    String asciiUppercase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    @Override
    public String part1(List<String> input) {
        int answer = 0;

        for (String s : input) {
            String s1 = s.substring(0, s.length() / 2);
            String s2 = s.substring(s.length() / 2);

            for (int i = 0; i < s1.length(); i++) {
                char c = s1.charAt(i);
                if (s2.indexOf(c) != -1) {
                    if (asciiLowercase.indexOf(c) != -1) {
                        answer += asciiLowercase.indexOf(c) + 1;
                        break;
                    } else if (asciiUppercase.indexOf(c) != -1) {
                        answer += asciiUppercase.indexOf(c) + 27;
                        break;
                    }
                }
            }
        }
        return String.valueOf(answer);
    }

    @Override
    public String part2(List<String> input) {
        int answer = 0;
        for (int i = 0; i < input.size(); i += 3) {
            List<Character> shared = new ArrayList<>();
            Character[] a = asciiLowercase.chars().mapToObj(c -> (char) c).toArray(Character[]::new);
            Character[] b = asciiUppercase.chars().mapToObj(c -> (char) c).toArray(Character[]::new);
            Collections.addAll(shared, a);
            Collections.addAll(shared, b);

            for (int j = i; j < i + 3; j++) {
                shared.retainAll(input.get(j).chars().mapToObj(c -> (char) c).collect(Collectors.toList()));
            }

            for (char c : shared) {
                if (asciiLowercase.indexOf(c) != -1) {
                    answer += asciiLowercase.indexOf(c) + 1;
                    break;
                } else if (asciiUppercase.indexOf(c) != -1) {
                    answer += asciiUppercase.indexOf(c) + 27;
                    break;
                }
            }
        }
        return String.valueOf(answer);
    }
}
