package customthing;

public class Person {


    public static void findUserByName(String username) throws MyCustomException{

        if(username.isEmpty()){
            throw new MyCustomException("username cannot not be empty");
        }

        System.out.println("found user named : " + username);
    }
}
