package tasks1.gpt;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ListGpt {
    public static void main(String[] args) {
        ListGpt listGpt = new ListGpt();
        List<String> listStr = Arrays.asList("a", "ab", "b", "abc", "1", "2", "100");
        List<String> listStr2 = Arrays.asList("abricos", "Aaaa", "aab", "baa", "banana", "abcd", "ananas");
        List<String> listStrZero = Arrays.asList();
        List<Integer> listNumbersA = Arrays.asList(1, 2, -1, 3, 4 ,3);
        List<Integer> listNumbersB = Arrays.asList(1, 2, -1, 3, 4 ,3 , 0, -2, -7, 60, 1000, 35, -44, 11, 1, 19);
        List<Integer> listNumbersZero = Arrays.asList();

        Task13ClassPerson task13ClassPerson = new Task13ClassPerson("Bob", 30);
        Task13ClassPerson task13ClassPerson2 = new Task13ClassPerson("Lol", 29);
        Task13ClassPerson task13ClassPerson1 = new Task13ClassPerson("Alex", 17);
        Task13ClassPerson task13ClassPerson3 = new Task13ClassPerson("Alex", 19);
        Task13ClassPerson task13ClassPerson4 = new Task13ClassPerson("Al", 18);
        Task13ClassPerson task13ClassPerson5 = new Task13ClassPerson("Svetlana", 7);
        List<Task13ClassPerson> personList = Arrays.asList(task13ClassPerson, task13ClassPerson1, task13ClassPerson2, task13ClassPerson3, task13ClassPerson5, task13ClassPerson4);
        System.out.println(task13ClassPerson1.listFilterAgeSelectName(personList));

        System.out.println(listGpt.listNamesIsStartsA(listStr2));
        System.out.println(listGpt.multiplicationAllElementsIsListInteger(listNumbersA));
    }

    //1. Cоздать список строк и найти самую длинную строку
    public String maxLengthString(List<String> str) {
        return str.stream()
                .max(Comparator.comparingInt(String::length))
                .orElse("Пустой список");
    }


    //4. Отсортировать по алфавиту
    public List<String> sortedAlphabetList(List<String> listStr) {
        return listStr.stream()
                .sorted()
                .collect(Collectors.toList()); // либо просто .toList();
    }

    //5. Посчитать кол-во строк, где длина больше 5
    public int countFiveSymbolListString(List<String> listStr) {
        return (int) listStr.stream()
                .filter(x -> x.length() > 5)
                .count();
    }

    //6. Самая короткая строка
    public String listStringMinLength(List<String> listStr) {
        return listStr.stream()
                .min(Comparator.comparingInt(String::length))
                .orElse("Пустой список");
    }
    //11. Все строки списка в верний регистр
    public List<String> listToUpperCase(List<String> listString){
        return listString.stream()
                .map(String::toUpperCase) //.map(str ->str.toUpperCase())
                .collect(Collectors.toList());
    }
    //12. Найти имена начинающиеся на "А"
    public List<String> listNamesIsStartsA(List<String> listStringName){
        return listStringName.stream()
                .filter(x -> x.startsWith("A"))
                .collect(Collectors.toList());
    }

    //********************Числа****************************8
    //2. Список чисел, сумма четных
    public int sumListEvenNumbers(List<Integer> listNumbers) {
        return listNumbers.stream()
                .filter(x -> x % 2 == 0)
                .mapToInt(x -> x.intValue())
                .sum();
    }

    //3.среднее значение
    public double avgNumbersIsList(List<Integer> listNumbers) {
        return listNumbers.stream()
                .mapToDouble(x -> x.intValue())
                .sum() / listNumbers.size();

    }

    //3.1 среднее значение с помощью ссылочного метода
    public double avgNumbersIsList2(List<Integer> listNumbers) {
        return listNumbers.stream()
                .mapToDouble(Integer::doubleValue)
                .average()
                .orElse(-1);
    }

    //7. Список чисел и минимальное число
    public int minNumberList(List<Integer> listInteger) {
        return listInteger.stream()
                .min(Comparator.naturalOrder())
                .orElseThrow(() -> new IllegalArgumentException("Список не содержит чисел"));
    }

    //8. Список чисел: найти уникальные значения
    public List<Integer> uniqNumbersList(List<Integer> listInteger){
        return listInteger.stream()
                .distinct()
                .collect(Collectors.toList());
    }
    //9. Удалить все отрицательные числа
    public List<Integer> deletePositiveNumbers(List<Integer> listInteger){
        return listInteger.stream()
                .filter(x -> x > 0)
                .collect(Collectors.toList());
    }
    //10. 10Максимальных значений
    public List<Integer> maxLimit10(List<Integer> listInteger){
        return listInteger.stream()
                .sorted(Comparator.reverseOrder())
                .limit(10)
                .collect(Collectors.toList());
    }
    //14.Произведение всех элементов
    public int multiplicationAllElementsIsListInteger(List<Integer> listInteger){
        return listInteger.stream()
                .reduce(1, (a, b) -> a * b);
    }

}