package lectureduece;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void makeAFile(){
        File file = new File("/Users/mikaila/Dev/block2things/src/main/resources/file.txt"); //this does not exist yet
        try{
            file.createNewFile();
        }catch(IOException ioException){
            System.out.println("No such folder or directory or path exist");
            ioException.printStackTrace();
        }catch(Exception exception){
            exception.printStackTrace();
        }

    }
    public static void writeToFile(){
    FileWriter fileWriter = null;

    try {
        fileWriter = new FileWriter("/Users/mikaila/Dev/block2things/src/main/resources/file.txt");
        fileWriter.write("We are learning how to handle exceptions");
        System.out.println("Wrote to file successfully");
    }catch (IOException ioException){
        ioException.printStackTrace();
        System.out.println("Unable to write to file");
    }finally{
        try {
            fileWriter.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}


//public static void readFromFile(){
//        File file = new File("/Users/mikaila/Dev/block2things/src/main/resources/file.txt");
//        Scanner scanner = null;
//
//        try{
//            scanner = new Scanner(file);
//
//            while(scanner.hasNext()){
//                System.out.println(scanner.nextLine());
//            }
//
//        }catch(FileNotFoundException | InputMismatchException e){
//            e.printStackTrace();
//        }catch (Exception e){
//            e.printStackTrace();
//        }finally{
//            if(scanner != null){
//                scanner.close();
//                System.out.println("Closed scanner resource");
//            }
//        }
//
//}

//try with resources -syntactic sugar

    public static void tryReadFromFileWithResources(){
        File file = new File("/Users/mikaila/Dev/block2things/src/main/resources/file.txt");

        try(Scanner scanner = new Scanner(file)){

            while(scanner.hasNext()){
                System.out.println(scanner.nextLine());
            }

        }catch(FileNotFoundException | InputMismatchException e){
            e.printStackTrace();
        }

    }





    public static void main(String[] args) {

        //Make a Text file with Java code
        //makeAFile();

        //Write to the file with Java code - Create
        //writeToFile();

        //Read data from the file - READ
        //readFromFile();
        tryReadFromFileWithResources();

    }
}
