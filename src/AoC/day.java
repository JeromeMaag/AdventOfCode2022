package AoC;

import java.util.ArrayList;
import java.util.List;

public interface day {

    String part1(List<String> input, List <String> input2);

    String part2(List<String> input, List <String> input2);

    default List <Integer> toIntList(List<String> list){
        List<Integer> intList = new ArrayList<>();
        for(String s: list){
            intList.add(Integer.valueOf(s));
        }
        return intList;
    }

}