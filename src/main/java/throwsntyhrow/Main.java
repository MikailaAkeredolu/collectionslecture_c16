package throwsntyhrow;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

//    public static void checkInput(int input){
//
//        //Whatever number that they enter must be greater than zero
//        if(input > 0){
//            //System.out.println("Must be greater than zero");
//            System.out.println(" you entered: " + input);   //print out what the person inputs
//
//        }else{
//            System.out.println( input + " is not greater than zero ");
//        }
//
//    }


    public static void checkInput(int input){

        //Whatever number that they enter must be greater than zero
        if(input <= 0){
            throw new IllegalArgumentException("Must be greater than zero");
        }else{
            System.out.println( input + " was the number entered");
        }

    }


    public static void readFromFileButDuckIt() throws FileNotFoundException {
        File file = new File("/Users/mikaila/Dev/block2things/src/main/resources/file.txt");
        Scanner scanner = new Scanner(file);
        while(scanner.hasNext()){
            System.out.println(scanner.nextLine());
        }

    }


    public static void main(String[] args) {

        //checkInput(-1);
        try {
            readFromFileButDuckIt();
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
            System.out.println(e.getMessage());
        }

    }
}
