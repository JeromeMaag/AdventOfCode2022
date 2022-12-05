package AoC.days;

import AoC.day;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class day05 implements day {
    @Override
    public String part1(List<String> input) {
        int res = 0;
        List<String> stack1a = Arrays.asList("Z", "T", "F", "R", "W", "J", "G");
        List<String> stack2a = Arrays.asList("G", "W", "M");
        List<String> stack3a = Arrays.asList("J", "N", "H", "G");
        List<String> stack4a = Arrays.asList("J", "R", "C", "N", "W");
        List<String> stack5a = Arrays.asList("W", "F", "S", "B", "G", "Q", "V", "M");
        List<String> stack6a = Arrays.asList("S", "R", "T", "D", "V", "W", "C");
        List<String> stack7a = Arrays.asList("H", "B", "N", "C", "D", "Z", "G", "V");
        List<String> stack8a = Arrays.asList("C","G","M","N","J","S");
        List<String> stack9a = Arrays.asList("L","D","J","C","W","N","P","G");
        List<String> stack1 = new ArrayList<>();
        List<String> stack2 = new ArrayList<>();
        List<String> stack3 = new ArrayList<>();
        List<String> stack4 = new ArrayList<>();
        List<String> stack5 = new ArrayList<>();
        List<String> stack6 = new ArrayList<>();
        List<String> stack7 = new ArrayList<>();
        List<String> stack8 = new ArrayList<>();
        List<String> stack9 = new ArrayList<>();


        stack1.addAll(stack1a);
        stack2.addAll(stack2a);
        stack3.addAll(stack3a);
        stack4.addAll(stack4a);
        stack5.addAll(stack5a);
        stack6.addAll(stack6a);
        stack7.addAll(stack7a);
        stack8.addAll(stack8a);
        stack9.addAll(stack9a);




        for(String s: input){
            String[] sPars = s.trim().split(" ");
            List<String> zwischenStack = new ArrayList<>();
            switch (sPars[3]){
                case "1":
                    for(int i = Integer.parseInt(sPars[1]); i > 0; i--){
                        zwischenStack.add(stack1.get(stack1.size()-1));
                        stack1.remove(stack1.size()-1);
                    }
                    break;
                case "2":
                    for(int i = Integer.parseInt(sPars[1]); i > 0; i--){
                        zwischenStack.add(stack2.get(stack2.size()-1));
                        stack2.remove(stack2.size()-1);

                    }
                    break;
                case "3":
                    for(int i = Integer.parseInt(sPars[1]); i > 0; i--){
                        zwischenStack.add(stack3.get(stack3.size()-1));
                        stack3.remove(stack3.size()-1);

                    }
                    break;
                case "4":
                    for(int i = Integer.parseInt(sPars[1]); i > 0; i--){
                        zwischenStack.add(stack4.get(stack4.size()-1));
                        stack4.remove(stack4.size()-1);

                    }                    break;
                case "5":
                    for(int i = Integer.parseInt(sPars[1]); i > 0; i--){
                        zwischenStack.add(stack5.get(stack5.size()-1));
                        stack5.remove(stack5.size()-1);

                    }
                    break;
                case "6":
                    for(int i = Integer.parseInt(sPars[1]); i > 0; i--){
                        zwischenStack.add(stack6.get(stack6.size()-1));
                        stack6.remove(stack6.size()-1);

                    }                    break;
                case "7":
                    for(int i = Integer.parseInt(sPars[1]); i > 0; i--){
                        zwischenStack.add(stack7.get(stack7.size()-1));
                        stack7.remove(stack7.size()-1);

                    }                    break;
                case "8":
                    for(int i = Integer.parseInt(sPars[1]); i > 0; i--){
                        zwischenStack.add(stack8.get(stack8.size()-1));
                        stack8.remove(stack8.size()-1);

                    }                    break;
                case "9":
                    for(int i = Integer.parseInt(sPars[1]); i > 0; i--){
                        zwischenStack.add(stack9.get(stack9.size()-1));
                        stack9.remove(stack9.size()-1);

                    }                    break;

            }
            switch (sPars[5]){
                case "1":
                    for(int i = zwischenStack.size(); i>0; i--){
                        stack1.add(zwischenStack.get(0));
                        zwischenStack.remove(0);
                    }
                    break;
                case "2":
                    for(int i = zwischenStack.size(); i>0; i--){
                        stack2.add(zwischenStack.get(0));
                        zwischenStack.remove(0);
                    }
                    break;
                case "3":
                    for(int i = zwischenStack.size(); i>0; i--){
                        stack3.add(zwischenStack.get(0));
                        zwischenStack.remove(0);
                    }
                    break;
                case "4":
                    for(int i = zwischenStack.size(); i>0; i--){
                        stack4.add(zwischenStack.get(0));
                        zwischenStack.remove(0);
                    }
                    break;
                case "5":
                    for(int i = zwischenStack.size(); i>0; i--){
                        stack5.add(zwischenStack.get(0));
                        zwischenStack.remove(0);
                    }
                    break;
                case "6":
                    for(int i = zwischenStack.size(); i>0; i--){
                        stack6.add(zwischenStack.get(0));
                        zwischenStack.remove(0);
                    }
                    break;
                case "7":
                    for(int i = zwischenStack.size(); i>0; i--){
                        stack7.add(zwischenStack.get(0));
                        zwischenStack.remove(0);
                    }
                    break;
                case "8":
                    for(int i = zwischenStack.size(); i>0; i--){
                        stack8.add(zwischenStack.get(0));
                        zwischenStack.remove(0);
                    }
                    break;
                case "9":
                    for(int i = zwischenStack.size(); i>0; i--){
                        stack9.add(zwischenStack.get(0));
                        zwischenStack.remove(0);
                    }
                    break;


            }
        }

        String x = stack1.get(stack1.size()-1) + stack2.get(stack2.size()-1) +
                stack3.get(stack3.size()-1)+ stack4.get(stack4.size()-1)+
                stack5.get(stack5.size()-1)+ stack6.get(stack6.size()-1)+ stack7.get(stack7.size()-1)
                + stack8.get(stack8.size()-1)+ stack9.get(stack9.size()-1);


        System.out.println(stack1);
        System.out.println(stack2);
        System.out.println(stack3);
        System.out.println(stack4);
        System.out.println(stack5);
        System.out.println(stack6);
        System.out.println(stack7);
        System.out.println(stack8);
        System.out.println(stack9);
        return x;
    }

    @Override
    public String part2(List<String> input) {
        int res = 0;
        return String.valueOf(res);
    }
}
