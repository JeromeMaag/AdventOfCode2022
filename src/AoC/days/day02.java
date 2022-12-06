package AoC.days;

import AoC.day;

import java.util.List;

public class day02 implements day {
    @Override

    //A == Rock, B=Paper, C= scissors
    //X == Rock1, Y Paper2, Z= scissors
    //Rock = 1
    //Paper = 2
    //scissors = 3
    public String part1(List<String> input) {
        int res = 0;

        for (String s : input) {
            String[] sPars = s.trim().split(" ");
            if (sPars[0].equals("A")) {
                if (sPars[1].equals("X")) {
                    res = res + 4;
                } else if (sPars[1].equals("Y")) {
                    res = res + 8;
                } else {
                    res = res + 3;
                }
            } else if (sPars[0].equals("B")) {
                if (sPars[1].equals("X")) {
                    res = res + 1;
                } else if (sPars[1].equals("Y")) {
                    res = res + 5;
                } else {
                    res = res + 9;
                }
            } else {
                if (sPars[1].equals("X")) {
                    res = res + 7;
                } else if (sPars[1].equals("Y")) {
                    res = res + 2;
                } else {
                    res = res + 6;
                }
            }
        }
        return String.format(String.valueOf(res));
    }

    @Override
    public String part2(List<String> input) {
        int res = 0;

        for (String s : input) {
            String[] sPars = s.trim().split(" ");
            if (sPars[0].equals("A")) {
                if (sPars[1].equals("X")) {
                    res = res + 3;
                } else if (sPars[1].equals("Y")) {
                    res = res + 4;
                } else {
                    res = res + 8;
                }
            } else if (sPars[0].equals("B")) {
                if (sPars[1].equals("X")) {
                    res = res + 1;
                } else if (sPars[1].equals("Y")) {
                    res = res + 5;
                } else {
                    res = res + 9;
                }
            } else {
                if (sPars[1].equals("X")) {
                    res = res + 2;
                } else if (sPars[1].equals("Y")) {
                    res = res + 6;
                } else {
                    res = res + 7;
                }
            }
        }

        return String.format(String.valueOf(res));
    }
}
