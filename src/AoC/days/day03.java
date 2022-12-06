package AoC.days;

import AoC.day;

import java.util.ArrayList;
import java.util.List;

public class day03 implements day {
    @Override
    public String part1(List<String> input) {
        int answer = 0;

        // Loop through each line of input.
        for (String line : input) {
            // Split the line into two parts: the items in the first compartment,
            // and the items in the second compartment.
            String firstCompartment = line.substring(0, line.length() / 2);
            String secondCompartment = line.substring(line.length() / 2);

            // Loop through each item in the first compartment and see if it
            // also exists in the second compartment. If it does, it means
            // that it was packed incorrectly and we need to output the type
            // of that item as the answer for this rucksack.
            for (int i = 0; i < firstCompartment.length(); i++) {
                char item = firstCompartment.charAt(i);
                if (secondCompartment.indexOf(item) != -1) {
                    System.out.println(item);
                    break;
                }
            }

        }
        return String.valueOf(answer);
    }

    @Override
    public String part2(List<String> input) {

        //in Python programmiert

        int res = 0;
        return String.valueOf(res);
    }
}
