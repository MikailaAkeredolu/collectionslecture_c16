package tdd;

import java.util.ArrayList;
import java.util.List;

public class Person {

    private String name;
    private List<String> listOfNames = new ArrayList<>();


    public void addName(String name){
        listOfNames.add(name);
    }

    public void removeName(){
        //
    }

    //get the size of the list

    public int getSizeOfList(){
        return listOfNames.size();
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getListOfNames() {
        return listOfNames;
    }

    public void setListOfNames(List<String> listOfNames) {
        this.listOfNames = listOfNames;
    }
}
