package com.amit.skill.interview2.Java8;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

/**
 * Created by amit on 23/11/16.
 */
//define a functional interface
@FunctionalInterface
interface WorkerInterface {

    public void doSomeWork();

}


public class WorkerInterfaceTest {

    public static void execute(WorkerInterface worker) {
        worker.doSomeWork();
    }

    public static void main(String [] args) {

        //invoke doSomeWork using Annonymous class
        execute(new WorkerInterface() {
            @Override
            public void doSomeWork() {
                System.out.println("Worker invoked using Anonymous class");
            }
        });

        //invoke doSomeWork using Lambda expression
        execute( () -> System.out.println("Worker invoked using Lambda expression") );


        //Old way:
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
        for(Integer n: list) {
            System.out.println(n);
        }

        //New way:
        List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
        list1.forEach(n -> System.out.println(n));


        //or we can use :: double colon operator in Java 8
        list1.forEach(System.out::println);

        //Old way:
        List<Integer> list2 = Arrays.asList(1,2,3,4,5,6,7);
        for(Integer n : list2) {
            int x = n * n;
            System.out.println(x);
        }

        //New way:
        List<Integer> list3 = Arrays.asList(1,2,3,4,5,6,7);
        list3.stream().map((x) -> x*x).forEach(System.out::println);

        //Old way:
        List<Integer> list4 = Arrays.asList(1,2,3,4,5,6,7);
        int sum = 0;
        for(Integer n : list4) {
            int x = n * n;
            sum = sum + x;
        }
        System.out.println(sum);

        //New way:
        List<Integer> list5 = Arrays.asList(1,2,3,4,5,6,7);
        int sum5 = list5.stream().map(x -> x*x).reduce((x,y) -> x + y).get();
        System.out.println(sum5);

        Stream<Integer> stream = Stream.of(1,2,3,4);

        //works fine
        Stream<Integer> stream1 = Stream.of(new Integer[]{1,2,3,4});

        //Compile time error, Type mismatch: cannot convert from Stream<int[]> to Stream<Integer>
        //Stream<Integer> stream1 = Stream.of(new int[]{1,2,3,4});

        List<Integer> myList = new ArrayList<>();
        for(int i=0; i<100; i++) myList.add(i);

        //sequential stream
        Stream<Integer> sequentialStream = myList.stream();

        //parallel stream
        Stream<Integer> parallelStream = myList.parallelStream();

        //We can use Stream.generate() and Stream.iterate() methods to create Stream.
        Stream<String> stream3 = Stream.generate(() -> {return "abc";});
        Stream<String> stream4 = Stream.iterate("abc", (i) -> i);

        //Using Arrays.stream() and String.chars() methods.
                LongStream is = Arrays.stream(new long[]{1,2,3,4});
                IntStream is2 = "abc".chars();


        Stream<Integer> intStream = Stream.of(1,2,3,4);
        List<Integer> intList = intStream.collect(Collectors.toList());
        System.out.println(intList); //prints [1, 2, 3, 4]

        intStream = Stream.of(1,2,3,4); //stream is closed, so we need to create it again
        Map<Integer,Integer> intMap = intStream.collect(Collectors.toMap(i -> i, i -> i+10));
        System.out.println(intMap); //prints {1=11, 2=12, 3=13, 4=14}

        Stream<Integer> intStream1 = Stream.of(1,2,3,4);
        Integer[] intArray = intStream1.toArray(Integer[]::new);
        System.out.println(Arrays.toString(intArray)); //prints [1, 2, 3, 4]

        List<Integer> myList1 = new ArrayList<>();
        for(int i=0; i<100; i++) myList1.add(i);
        Stream<Integer> sequentialStream1 = myList1.stream();

        Stream<Integer> highNums = sequentialStream1.filter(p -> p > 90); //filter numbers greater than 90
        System.out.print("High Nums greater than 90=");
        highNums.forEach(p -> System.out.print(p+" "));
        //prints "High Nums greater than 90=91 92 93 94 95 96 97 98 99 "

        Stream<String> names = Stream.of("aBc", "d", "ef");
        System.out.println(names.map(s -> {
            return s.toUpperCase();
        }).collect(Collectors.toList()));
        //prints [ABC, D, EF]

        Stream<String> names2 = Stream.of("aBc", "d", "ef", "123456");
        List<String> reverseSorted = names2.sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(reverseSorted); // [ef, d, aBc, 123456]

        Stream<String> names3 = Stream.of("aBc", "d", "ef", "123456");
        List<String> naturalSorted = names3.sorted().collect(Collectors.toList());
        System.out.println(naturalSorted); //[123456, aBc, d, ef]

        Stream<List<String>> namesOriginalList = Stream.of(
                Arrays.asList("Pankaj"),
                Arrays.asList("David", "Lisa"),
                Arrays.asList("Amit"));
        //flat the stream from List<String> to String stream
        Stream<String> flatStream = namesOriginalList
                .flatMap(strList -> strList.stream());

        flatStream.forEach(System.out::println);

        Stream<Integer> numbers = Stream.of(1,2,3,4,5);

        Optional<Integer> intOptional = numbers.reduce((i,j) -> {return i*j;});
        if(intOptional.isPresent()) System.out.println("Multiplication = "+intOptional.get()); //120

        Stream<Integer> numbers1 = Stream.of(1,2,3,4,5);

        System.out.println("Number of elements in stream="+numbers1.count()); //5

        Stream<Integer> numbers2 = Stream.of(1,2,3,4,5);
        numbers2.forEach(i -> System.out.print(i+",")); //1,2,3,4,5,

        Stream<Integer> numbers3 = Stream.of(1,2,3,4,5);
        System.out.println("Stream contains 4? "+numbers3.anyMatch(i -> i==4));
        //Stream contains 4? true

        Stream<Integer> numbers4 = Stream.of(1,2,3,4,5);
        System.out.println("Stream contains all elements less than 10? "+numbers4.allMatch(i -> i<10));
        //Stream contains all elements less than 10? true

        Stream<Integer> numbers5 = Stream.of(1,2,3,4,5);
        System.out.println("Stream doesn't contain 10? "+numbers5.noneMatch(i -> i==10));
        //Stream doesn't contain 10? true

        Stream<String> names4 = Stream.of("Pankaj","Amit","David", "Lisa");
        Optional<String> firstNameWithD = names4.filter(i -> i.startsWith("D")).findFirst();
        if(firstNameWithD.isPresent()){
            System.out.println("First Name starting with D="+firstNameWithD.get()); //David
        }

    }

    private static int sumIterator(List<Integer> list) {
        Iterator<Integer> it = list.iterator();
        int sum = 0;
        while (it.hasNext()) {
            int num = it.next();
            if (num > 10) {
                sum += num;
            }
        }
        return sum;
    }

    private static int sumStream(List<Integer> list) {
        return list.stream().filter(i -> i > 10).mapToInt(i -> i).sum();
    }

}
