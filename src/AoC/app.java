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
    }

    public static void main(String[] args) {
        int day = 1;
        boolean differentLists = true;


        List<String> inputList;
        List<String> secondList = new ArrayList<>();

        inputList =   loadInput(day, 1);
        if (differentLists){
            secondList = loadInput(day, 2);
        }

        System.out.println(inputList);

        System.out.println("Day " + day + " Part 1= " +DAYS.get(day).part1(inputList, secondList));
        System.out.println("Day " + day + " Part 2= " +DAYS.get(day).part2(inputList, secondList));
    }

    private static List<String> loadInput(int day, int part) {
        String paddedDay = String.valueOf(day);
        if(day < 10) {
            paddedDay = "0" + day;
        }
        String fileName = "C:/coding/AdventOfCode2022/AdventOfCode2022/resources/day" + paddedDay + "_" + part+ ".txt";
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
