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

        for (String s: input){
            if(s.equals("")){
                i.add(0);
            }
            else {
                int x = i.get(i.size()-1);
                x = x + Integer.valueOf(s);
                i.remove(i.size()-1);
                i.add(x);

            }
        }

        Collections.sort(i);
        Collections.reverse(i);

        System.out.println(i);

        return "1";

    }

    @Override
    public String part2(List<String> input) {


        int res = 0;
        return String.valueOf(res);
    }

}
