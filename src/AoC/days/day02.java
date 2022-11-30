package AoC.days;

import AoC.day;

import java.util.ArrayList;
import java.util.List;

public class day02 implements day {
    @Override
    public String part1(List<String> input, List<String> input2) {
        int depth = 0;
        int dist = 0;
        String f = "forward";
        for(String s : input2){
            String[] sPars = s.trim().split(" ");
            if(sPars[0].equals("forward")){
                dist = dist + Integer.valueOf(sPars[1]);
            } else if (sPars[0].equals("up")) {
                depth = depth - Integer.valueOf(sPars[1]);
            } else {
                depth = depth + Integer.valueOf(sPars[1]);
            }
        }
        int res = depth*dist;
        return String.format(String.valueOf(res));
    }

    @Override
    public String part2(List<String> input, List<String> input2) {
        int depth = 0;
        int dist = 0;
        int aim = 0;
        for(String s : input2){
            String[] sPars = s.trim().split(" ");
            if(sPars[0].equals("forward")){
                dist = dist + Integer.valueOf(sPars[1]);
                depth = depth + (aim * Integer.valueOf(sPars[1]));
            } else if (sPars[0].equals("up")) {
                aim = aim - Integer.valueOf(sPars[1]);
            } else {
                aim = aim + Integer.valueOf(sPars[1]);
            }
        }
        int res = depth*dist;
        return String.valueOf(res);
    }
}
