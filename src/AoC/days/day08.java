package AoC.days;

import AoC.day;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.lang.Math.max;

public class day08 implements day {
    @Override
    public String part1(List<String> input) {
        int res = 0;
        int[][] forest = new int[input.size()][input.size()];
        int index_row = 0;
        for(String s: input){
            int index_col = 0;
            String[] sPars = s.trim().split("");
            for(String tree: sPars){
                forest[index_row][index_col] = Integer.parseInt(tree);
                index_col++;
            }
            index_row++;
        }

        for (int y = 0; y < input.size(); y++) {
            for (int x = 0; x < input.size(); x++) {
                boolean bigger = true;
                for (int k = y - 1; k >= 0; k--) {
                    if (forest[k][x] >= forest[y][x]) {
                        bigger = false;
                    }
                }
                if (bigger) {
                    res++;
                    continue;
                }
                bigger = true;
                for (int k = y + 1; k < forest.length; k++) {
                    if (forest[k][x] >= forest[y][x]) {
                        bigger = false;
                    }
                }
                if (bigger) {
                    res++;
                    continue;
                }
                bigger = true;
                for (int k = x + 1; k < forest[0].length; k++) {
                    if (forest[y][k] >= forest[y][x]) {
                        bigger = false;
                    }
                }
                if (bigger) {
                    res++;
                    continue;
                }
                bigger = true;
                for (int k = x - 1; k >= 0; k--) {
                    if (forest[y][k] >= forest[y][x]) {
                        bigger = false;
                    }
                }
                if (bigger) {
                    res++;
                    continue;
                }
            }
        }
        return String.valueOf(res);
    }

    @Override
    public String part2(List<String> input) {
        int res = 0;
        int[][] forest = new int[input.size()][input.size()];
        int index_row = 0;
        for(String s: input){
            int index_col = 0;
            String[] sPars = s.trim().split("");
            for(String tree: sPars){
                forest[index_row][index_col] = Integer.parseInt(tree);
                index_col++;
            }
            index_row++;
        }

        for (int y = 0; y < input.size(); y++) {
            for (int x = 0; x < input.size(); x++) {
                int viewDistance = 1;

                int tempDistance = 0;
                for (int k = y - 1; k >= 0; k--) {
                    tempDistance++;
                    if (forest[k][x] >= forest[y][x]) {
                        break;
                    }
                }
                viewDistance *= tempDistance;
                tempDistance = 0;
                for (int k = y + 1; k < forest.length; k++) {
                    tempDistance++;
                    if (forest[k][x] >= forest[y][x]) {
                        break;
                    }
                }
                viewDistance *= tempDistance;
                tempDistance = 0;
                for (int k = x + 1; k < forest[0].length; k++) {
                    tempDistance++;
                    if (forest[y][k] >= forest[y][x]) {
                        break;
                    }
                }
                viewDistance *= tempDistance;
                tempDistance = 0;
                for (int k = x - 1; k >= 0; k--) {
                    tempDistance++;
                    if (forest[y][k] >= forest[y][x]) {
                        break;
                    }
                }
                viewDistance *= tempDistance;
                if (viewDistance > res) {
                    res = viewDistance;
                }
            }
        }
        return String.valueOf(res);
    }
}
