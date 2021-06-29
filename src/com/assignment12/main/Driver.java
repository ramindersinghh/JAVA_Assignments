package com.assignment12.main;

import com.assignment12.utility.Gender;
import com.assignment12.utility.Student;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.averagingInt;

public class Driver {
    public static void main(String[] args) {
        Student[] students = new Student[17];

        students[1] = new Student(111, "Jiya Brein", 17, Gender.FEMALE, "Computer Science", 2018, 70.8);
        students[2] = new Student(122, "Paul Niksui", 18, Gender.MALE, "Mechanical", 2016, 50.2);
        students[3] = new Student(133, "Martin Theron", 17, Gender.MALE, "Electronic", 2017, 90.3);
        students[4] = new Student(144, "Murali Gowda", 18, Gender.MALE, "Electrical",2018,80);
        students[5] = new Student(155, "Nima Roy", 19, Gender.FEMALE, "Textile", 2016, 70);
        students[6] = new Student(166, "Iqbal Hussain", 18, Gender.MALE, "Security", 2016, 70);
        students[7] = new Student(177, "Manu Sharma", 16, Gender.MALE, "Chemical", 2018, 70);
        students[8] = new Student(188, "Wang Liu", 20, Gender.MALE, "Computer Science", 2015, 80);
        students[9] = new Student(199, "Amelia Zoe", 18, Gender.FEMALE, "Computer Science", 2016, 85);
        students[10] = new Student(200, "Jaden Dough", 18, Gender.MALE, "Security", 2015, 82);
        students[11] = new Student(211, "Jasna Kaur", 20, Gender.FEMALE, "Electronic", 2019, 83);
        students[12] = new Student(222, "Nitin Joshi", 19, Gender.MALE, "Textile", 2016, 60.4);
        students[13] = new Student(233, "Jyothi Reddy", 16, Gender.FEMALE, "Computer Science", 2015, 45.6);
        students[14] = new Student(244, "Nicolus Den", 16, Gender.MALE, "Electronic", 2017, 95.8);
        students[15] = new Student(255, "Ali Baig", 17, Gender.MALE, "Electronic", 2018, 88.4);
        students[16] = new Student(266, "Sanvi Pandey", 17, Gender.FEMALE, "Electric", 2019, 72.4);
        students[0] = new Student(277, "Anuj Chettiar", 18, Gender.MALE, "Computer Science", 2017, 57.5);

        Stream<Student> stream = Arrays.stream(students);
        printNames(stream);

        System.out.println("//1. Print the name of all departments in the college?");
        printDepartmentNames( Arrays.stream(students));

        System.out.println("//2.Get the names of all students who have enrolled after 2018?");
        printStudentNamesAfter2018( Arrays.stream(students));

        System.out.println("//3. Get the details of all male student in the computer sci department?");
        printMaleComputerStudents(Arrays.stream(students));

        System.out.println("//4. How many male and female student are there ? (HINT:use Collectors.groupingBy() for grouping based on gender)");
        printMaleFemaleCount(Arrays.stream(students));

        System.out.println("//5.What is the average age of male and female students?");
        printAverageAge(Arrays.stream(students));

        System.out.println("//6.Get the details of highest student having highest percentage ?");
        printHighestPercentageStudent(Arrays.stream(students));

        System.out.println("//7.Count the number of students in each department? (Hint :use Collectors.groupingBy())");
        printDepartmentTotal(Arrays.stream(students));

        System.out.println("//8. What is the average percentage achieved in each department?");
        printAveragePercentageInDepartment(Arrays.stream(students));

        System.out.println("//9. Get the details of youngest male student in the Electronic department?(Hint :Use Collectors.minBy)");
        printYoungestMaleElectronicStudent(Arrays.stream(students));

        System.out.println("//10.How many male and female students are there in the computer science department?");
        printCountComputerScience(Arrays.stream(students));
        /*printNames
                .filter(p -> p.price > 30000)// filtering data
                .map(p->p.price)        // fetching price
                .collect(Collectors.toList()); // collecting as list

         */
        // Displaying elements in Stream
        //stream.forEach(str -> System.out.print(str + " "));

    }

    private static void printCountComputerScience(Stream<Student> stream) {
        // Collect the list as map
        // by groupingBy() method
        Map<Gender, Long> result
                = stream
                .filter(s -> s.getEngDepartment().equals("Computer Science"))
                .collect(
                Collectors.groupingBy(
                        Student::getGender,
                        Collectors.counting()));

        // Print the result
        System.out.println(result);
        
    }

    private static void printYoungestMaleElectronicStudent(Stream<Student> stream) {
        // Collect the list as map
        // by groupingBy() method
        Student result
                = stream
                 .filter(s -> s.getEngDepartment().equals("Electronic"))
                .collect(Collectors.minBy(Comparator.comparing(Student::getAge))).get();


        // Print the result
        System.out.println(result.getName() +" " + result.getAge());
    }

    private static void printAveragePercentageInDepartment(Stream<Student> stream) {
        // Collect the list as map
        // by groupingBy() method
        Map<String, Double> result
                = stream.collect(
                Collectors.groupingBy(
                        Student::getEngDepartment,
                        Collectors.averagingDouble(Student::getPerTillDate)));

        // Print the result
        System.out.println(result);
    }

    private static void printDepartmentTotal(Stream<Student> stream) {
        // Collect the list as map
        // by groupingBy() method
        Map<String, Long> result
                = stream.collect(
                Collectors.groupingBy(
                        Student::getEngDepartment,
                        Collectors.counting()));

        // Print the result
        System.out.println(result);
    }

    private static void printHighestPercentageStudent(Stream<Student> stream) {
        // Collect the list as map
        // by groupingBy() method
        Student result
                = stream.max(Comparator.comparing(Student::getPerTillDate))
                .orElseThrow(NoSuchElementException::new);

        // Print the result
        System.out.println(result.getName() +" " + result.getPerTillDate());
    }

    private static void printAverageAge(Stream<Student> stream) {
        // Collect the list as map
        // by groupingBy() method
        Map<Gender, Double> result
                = stream.collect(
                Collectors.groupingBy(
                        Student::getGender,
                        Collectors.averagingInt(Student::getAge)));

        // Print the result
        System.out.println(result);
    }

    private static void printMaleFemaleCount(Stream<Student> stream) {
        // Collect the list as map
        // by groupingBy() method
        Map<Gender, Long> result
                = stream.collect(
                Collectors.groupingBy(
                        Student::getGender,
                        Collectors.counting()));

        // Print the result
        System.out.println(result);
    }

    private static void printMaleComputerStudents(Stream<Student> stream) {
        List<String> names=stream
                .filter(s -> s.getGender().equals(Gender.MALE) && s.getEngDepartment().equals("Computer Science"))
                .map(s -> s.getName())
                .collect(Collectors.toList());
        System.out.println(names);
    }


    private static void printNames(Stream<Student> stream) {
        List<String> names=stream.map(s -> s.getName())
                .collect(Collectors.toList());
        System.out.println(names);
    }
    public static <T> Predicate<T> distinctByKey(Function<? super T, ?> keyExtractor) {
        Set<Object> seen = ConcurrentHashMap.newKeySet();
        return t -> seen.add(keyExtractor.apply(t));
    }
    private static void printDepartmentNames(Stream<Student> stream) {
        List<String> names=stream.filter(distinctByKey(Student::getEngDepartment))
                .map(s -> s.getEngDepartment())
                .collect(Collectors.toList());
        System.out.println(names);
    }
    private static void printStudentNamesAfter2018(Stream<Student> stream) {
        List<String> names=stream
                .filter(s -> s.getYearOfEnrollment() > 2018)
                .map(s -> s.getName())
                .collect(Collectors.toList());
        System.out.println(names);
    }



}
/*
students[1] = new Student(111, "Jiya Brein", 17, Gender.FEMALE, "Computer Science", 2018, 70.8);
        students[2] = new Student(122, "Paul Niksui", 18, Gender.MALE, "Mechanical", 2016, 50.2);
        students[3] = new Student(133, "Martin Theron", 17, Gender.MALE, "Electronic", 2017, 90.3);
        students[4] = new Student(144, "Murali Gowda", 18, Gender.MALE, "Electrical",2018,80);
        students[5] = new Student(155, "Nima Roy", 19, Gender.FEMALE, "Textile", 2016, 70);
        students[6] = new Student(166, "Iqbal Hussain", 18, Gender.MALE, "Security", 2016, 70);
        students[7] = new Student(177, "Manu Sharma", 16, Gender.MALE, "Chemical", 2018, 70);
        students[8] = new Student(188, "Wang Liu", 20, Gender.MALE, "Computer Science", 2015, 80);
        students[9] = new Student(199, "Amelia Zoe", 18, Gender.FEMALE, "Computer Science", 2016, 85);
        students[10] = new Student(200, "Jaden Dough", 18, Gender.MALE, "Security", 2015, 82);
        students[11] = new Student(211, "Jasna Kaur", 20, Gender.FEMALE, "Electronic", 2019, 83);
        students[12] = new Student(222, "Nitin Joshi", 19, Gender.MALE, "Textile", 2016, 60.4);
        students[13] = new Student(233, "Jyothi Reddy", 16, Gender.FEMALE, "Computer Science", 2015, 45.6);
        students[14] = new Student(244, "Nicolus Den", 16, Gender.MALE, "Electronic", 2017, 95.8);
        students[15] = new Student(255, "Ali Baig", 17, Gender.MALE, "Electronic", 2018, 88.4);
        students[16] = new Student(266, "Sanvi Pandey", 17, Gender.FEMALE, "Electric", 2019, 72.4);
        students[0] = new Student(277, "Anuj Chettiar", 18, Gender.MALE, "Computer Science", 2017, 57.5);
 */