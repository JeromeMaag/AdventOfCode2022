package AoC.days;

import AoC.day;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class day01 implements day {
    @Override
    public String part1(List<String> input, List<String> input2) {

        List<Integer> i = new ArrayList<>();
        i.add(0);

        for (String s: input2){
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



        System.out.println(i);


        Collections.sort(i);
        System.out.println(i);

        return String.valueOf("1");

    }

    @Override
    public String part2(List<String> input, List<String> input2) {


        int res = 0;
        return String.valueOf(res);
    }

}
