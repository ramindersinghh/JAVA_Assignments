package com.assignment12.main;

import com.assignment12.utility.Student;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Driver {
    public static void main(String[] args) {
        Student[] students = new Student[17];

        students[1] = new Student(111, "Jiya Brein", 17, "Female", "Computer Science", 2018, 70.8);
        students[2] = new Student(122, "Paul Niksui", 18, "Male", "Mechanical", 2016, 50.2);
        students[3] = new Student(133, "Martin Theron", 17, "Male", "Electronic", 2017, 90.3);
        students[4] = new Student(144, "Murali Gowda", 18, "Male", "Electrical",2018,80);
        students[5] = new Student(155, "Nima Roy", 19, "Female", "Textile", 2016, 70);
        students[6] = new Student(166, "Iqbal Hussain", 18, "Male", "Security", 2016, 70);
        students[7] = new Student(177, "Manu Sharma", 16, "Male", "Chemical", 2018, 70);
        students[8] = new Student(188, "Wang Liu", 20, "Male", "Computer Science", 2015, 80);
        students[9] = new Student(199, "Amelia Zoe", 18, "Female", "Computer Science", 2016, 85);
        students[10] = new Student(200, "Jaden Dough", 18, "Male", "Security", 2015, 82);
        students[11] = new Student(211, "Jasna Kaur", 20, "Female", "Electronic", 2019, 83);
        students[12] = new Student(222, "Nitin Joshi", 19, "Male", "Textile", 2016, 60.4);
        students[13] = new Student(233, "Jyothi Reddy", 16, "Female", "Computer Science", 2015, 45.6);
        students[14] = new Student(244, "Nicolus Den", 16, "Male", "Electronic", 2017, 95.8);
        students[15] = new Student(255, "Ali Baig", 17, "Male", "Electronic", 2018, 88.4);
        students[16] = new Student(266, "Sanvi Pandey", 17, "Female", "Electric", 2019, 72.4);
        students[0] = new Student(277, "Anuj Chettiar", 18, "Male", "Computer Science", 2017, 57.5);

        Stream<Student> stream = Arrays.stream(students);
        printNames(stream);
        //1. Print the name of all departments in the college?
        printDepartmentNames( Arrays.stream(students));
        //2.Get the names of all students who have enrolled after 2018?
        //3. Get the details of all male student in the computer sci department?
        //4. How many male and female student are there ? (HINT:use Collectors.groupingBy() for grouping based on gender)
        //5.What is the average age of male and female students?
        //6.Get the details of highest student having highest percentage ?
        //7.Count the number of students in each department? (Hint :use Collectors.groupingBy())
        //8. What is the average percentage achieved in each department?
        //9. Get the details of youngest male student in the Electronic department?(Hint :Use Collectors.minBy)
        //10.How many male and female students are there in the computer science department?
        /*printNames
                .filter(p -> p.price > 30000)// filtering data
                .map(p->p.price)        // fetching price
                .collect(Collectors.toList()); // collecting as list

         */
        // Displaying elements in Stream
        //stream.forEach(str -> System.out.print(str + " "));

    }
    public static <T> Predicate<T> distinctByKey(Function<? super T, ?> keyExtractor) {
        Set<Object> seen = ConcurrentHashMap.newKeySet();
        return t -> seen.add(keyExtractor.apply(t));
    }
    private static void printDepartmentNames(Stream<Student> stream) {
        List<String> names=stream.filter(distinctByKey(Student::getEngDepartment)).map(s -> s.getEngDepartment()).collect(Collectors.toList());
        System.out.println(names);
    }

    private static void printNames(Stream<Student> stream) {
        List<String> names=stream.map(s -> s.getName()).collect(Collectors.toList());
        System.out.println(names);
    }
}
