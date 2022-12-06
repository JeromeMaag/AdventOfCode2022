package AoC;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import AoC.days.*;

import static java.util.stream.Collectors.toList;

public class app {

    private static final Map<Integer, day> DAYS = new HashMap<>();
    static {
        DAYS.put(1, new day01());
        DAYS.put(2, new day02());
        DAYS.put(3, new day03());
        DAYS.put(4, new day04());
        DAYS.put(5, new day05());
        DAYS.put(6, new day06());
        DAYS.put(7, new day07());
        DAYS.put(8, new day08());
        DAYS.put(9, new day09());
        DAYS.put(10, new day10());


    }

    public static void main(String[] args) {
        System.out.println("\n");
        int day = 1;


        List<String> exampleList = loadInput(day, 1);
        List<String> inputList = loadInput(day, 2);

        System.out.println("EXAMPLE:\nDay " + day + " Part 1= " +DAYS.get(day).part1(exampleList));
        System.out.println("Day " + day + " Part 2= " +DAYS.get(day).part2(exampleList) + "\n");

        System.out.println("REAL:\nDay " + day + " Part 1= " +DAYS.get(day).part1(inputList));
        System.out.println("Day " + day + " Part 2= " +DAYS.get(day).part2(inputList));
    }

    private static List<String> loadInput(int day, int part) {
        String paddedDay = String.valueOf(day);
        if(day < 10) {
            paddedDay = "0" + day;
        }
        String fileName = "resources/day" + paddedDay + "_" + part+ ".txt";
        FileInputStream file = null;
        try {
            file = new FileInputStream(fileName);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        System.out.println(fileName);
        try(BufferedReader r = new BufferedReader(new InputStreamReader(file))){
            return r.lines().collect(toList());
        } catch(IOException e){
            throw new UncheckedIOException(e);
        }
    }

}
