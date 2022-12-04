package AoC.days;

import AoC.day;

import java.util.ArrayList;
import java.util.List;

public class day04 implements day {
    @Override
    public String part1(List<String> input) {
        int res = 0;


        for(String s: input){
            String[] sPars = s.trim().split(",");
            String[] elv1 = sPars[0].trim().split("-");
            String[] elv2 = sPars[1].trim().split("-");
            Integer low1 = Integer.valueOf(elv1[0]);
            Integer low2 = Integer.valueOf(elv2[0]);
            Integer high1 = Integer.valueOf(elv1[1]);
            Integer high2 = Integer.valueOf(elv2[1]);
            if((low1 <= low2) && high1 >= high2){
                res++;
            }else if((low1 >= low2) && high1 <= high2){
                res++;
            }

        }


        return String.valueOf(res);
    }

    @Override
    public String part2(List<String> input) {
        int res = 0;


        for(String s: input){
            String[] sPars = s.trim().split(",");
            String[] elv1 = sPars[0].trim().split("-");
            String[] elv2 = sPars[1].trim().split("-");
            Integer low1 = Integer.valueOf(elv1[0]);
            Integer low2 = Integer.valueOf(elv2[0]);
            Integer high1 = Integer.valueOf(elv1[1]);
            Integer high2 = Integer.valueOf(elv2[1]);
            if((low1 > high2 || low2 > high1)){
            }else{
                res++;
            }

        }
        return String.valueOf(res);
    }
}
