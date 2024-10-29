import java.net.Inet4Address;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);  numbers.add(11);   numbers.add(111);
        // enhanced for loop - for Each loop
//        for(Integer n: numbers){
//
//            System.out.println(n);
//
//        }

        //Back to front
        ListIterator<Integer> listIterator = numbers.listIterator();
        while(listIterator.hasNext()){
            //mopdiofications
            System.out.println(listIterator.next());
        }

        //reverse
        while(listIterator.hasPrevious()){
            //mopdiofications
            System.out.println(listIterator.previous());
        }







  //      Iterator<Integer> iterator = numbers.iterator(); //created an iterator object

//        while(iterator.hasNext()){
//            Integer current = iterator.next();
//            if(current > 10){
//                iterator.remove();
//            }
//        }


        //Maps
//        Map<Integer, String> wuTang = new HashMap<>();
//        wuTang.put(1,"Rza");
//        wuTang.put(2,"Gza");
//        wuTang.put(3,"Ghost");

//        for(Map.Entry<Integer, String> entry: wuTang.entrySet() ){
//            System.out.println( entry.getKey() + " : " + entry.getValue());
//        }

        //just print Rza
//        Iterator<Map.Entry<Integer, String>> mapIterator = wuTang.entrySet().iterator();
//
//        while(mapIterator.hasNext() ){
//            Map.Entry<Integer, String> mapEntry = mapIterator.next();
//
//            if(mapEntry.getKey() > 1){
//
//                mapIterator.remove();
//            }
//        }
//
//        System.out.println(wuTang);



       // System.out.println(numbers);



        //print out your list

        //Create a List of 5 numbers from and 2 of the numbers should be greater than 10






    }
}
