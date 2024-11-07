package customthing;

public class Main {
    public static void main(String[] args) {

        //ClassName.methodName() - static methods belong to the class
        try {
            Person.findUserByName("");
        } catch (MyCustomException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }


    }
}
