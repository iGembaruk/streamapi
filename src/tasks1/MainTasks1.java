package tasks1;

import java.util.*;
import java.util.stream.Collectors;

public class MainTasks1 {

    public static void main(String[] args) {
        MainTasks1 mainTasks1 = new MainTasks1();
        List<Integer> numbersList1 = new ArrayList<>(Arrays.asList(7, 8 , 9, 9, 9, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 3, 2, 1, 4, 6, 100, 101, 102, 104, 80, 82, 74, 73, 71, 60, 1000));
        List<String> stringList = new ArrayList<>(Arrays.asList("a", "ab", "abc", "abcde", "abcd", "a"));
        System.out.println(mainTasks1.sortedCountLength(stringList));
        System.out.println(mainTasks1.sortedArrays(numbersList1));
        System.out.println(mainTasks1.evenArrays(numbersList1));
        System.out.println(mainTasks1.distinctArrays(numbersList1));
    }

    //сортировка чисел
    public List<Integer> sortedArrays(List<Integer> list){
        List<Integer> sortedList = list.stream()
                .sorted()
                .collect(Collectors.toList());
        return sortedList;
    }
    //четные числа
    public List<Integer> evenArrays(List<Integer> list){
        List<Integer> evenList = list.stream()
                .filter(x -> x % 2 == 0)
                .toList(); //доступно после 10 джавы
        return  evenList;
    }

    //уникальные числа
    public Set<Integer> distinctArrays(List<Integer> list){
        Set<Integer> distinctList =  new HashSet<>(list);
        return distinctList;
    }

    //сортировка строк по длине
    public List<String> sortedCountLength(List<String> list){
        List<String> sortedCountLength = list.stream()
                .sorted((s1, s2) -> Integer.compare(s1.length(), s2.length()))
                .toList();
        return sortedCountLength;
    }



}
