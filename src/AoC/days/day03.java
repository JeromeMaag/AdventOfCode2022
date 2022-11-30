package AoC.days;

import AoC.day;

import java.util.ArrayList;
import java.util.List;

public class day03 implements day {
    @Override
    public String part1(List<String> input, List<String> input2) {
        int gamma = 0;
        int epsilon = 0;
        int p1 = 0;
        int p2 = 0;
        int p3 = 0;
        int p4 = 0;
        int p5 = 0;
        int p6 = 0;
        int p7 = 0;
        int p8 = 0;
        int p9 = 0;
        int p10 = 0;
        int p11= 0;
        int p12= 0;
        int c=0;
        for(String s : input2){
            c++;
            char[] a = s.toCharArray();
            p1 = Integer.valueOf(a[0]) + p1;
            p2 = Integer.valueOf(a[0]) + p2;
            p3 = Integer.valueOf(a[0]) + p3;
            p4 = Integer.valueOf(a[0]) + p4;
            p5 = Integer.valueOf(a[0]) + p5;
            p6 = Integer.valueOf(a[0]) + p6;
            p7 = Integer.valueOf(a[0]) + p7;
            p8 = Integer.valueOf(a[0]) + p8;
            p9 = Integer.valueOf(a[0]) + p9;
            p10 = Integer.valueOf(a[0]) + p10;
            p11 = Integer.valueOf(a[0]) + p11;
            p12 = Integer.valueOf(a[0]) + p12;
        }

        System.out.println("counter: " + c);
        System.out.println("" +p1 +" "+ p2 +" "+ p3 +" "+ p4 +" "+ p5+" " + p6+" " + p7 +" "+ p8 +" "+ p9+" " + p10 +" "+ p11 +" "+ p12);


        return "test";
    }

    @Override
    public String part2(List<String> input, List<String> input2) {
        int res = 0;
        return String.valueOf(res);
    }
}
