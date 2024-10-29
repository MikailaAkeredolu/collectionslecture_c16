package comparo;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(2);
        list.add(31);  //2,10,31
//        Collections.sort(list);
//        System.out.println(list);

        Student student = new Student("Mike", 88.9, 23);

        List<Student> listOfStudents = new ArrayList<>();
        listOfStudents.add(student);
        listOfStudents.add(new Student("Jane", 45.0, 19));
        listOfStudents.add(new Student("Jack", 25.0, 29));

                for (Student s : listOfStudents){
            System.out.println(s);
        }


        //create an instance of the comparator
        NameComparator nameComparator = new NameComparator();
        Collections.sort(listOfStudents, nameComparator);

        System.out.println("====================");

//        Collections.sort(listOfStudents); //comparable Interface
        for (Student s : listOfStudents){
            System.out.println(s);
        }




    }
}
