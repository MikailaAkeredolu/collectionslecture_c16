package comparo;

public class Student implements Comparable<Student> {

    private String name;
    private double grade;
    private Integer age;

    public Student(String name, double grade, Integer age) {
        this.name = name;
        this.grade = grade;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public double getGrade() {
        return grade;
    }


    public Integer getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", grade=" + grade +
                ", age=" + age +
                '}';
    }

    //Lexicographical

    @Override
    public int compareTo(Student o) {
        if(this.age > o.age){
            return 1; //       Positive value: if the current object is "greater than" the object passed as an argument.
        }else if(this.age < o.age){
            return -1; //         Negative value: if the current object is "less than" the object passed as an argument.
        }
        return 0; //      Zero: if the current object is "equal to" the object passed as an argument.
    }

//    @Override
//    public int compareTo(Student o) {
//        if(this.grade > o.grade){
//            return 1; //       Positive value: if the current object is "greater than" the object passed as an argument.
//        }else if(this.grade < o.grade){
//            return -1; //         Negative value: if the current object is "less than" the object passed as an argument.
//        }
//        return 0; //      Zero: if the current object is "equal to" the object passed as an argument.
//    }



}
