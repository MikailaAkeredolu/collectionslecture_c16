package tdd;

import org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PersonTest {



    Person person;

    @BeforeEach
    public void setUp(){
        person = new Person();
    }



    @Test
    void setNameTest(){
        //Arrange
        String expected  = "John";

        //Act

        person.setName("John");

        //Assert
       assertEquals(expected, person.getName());

    }

     @Test
    void addNameTest(){
        //expected
        int expected = 1; //take the size of the array plus 1

        person.addName("Jake");

        int actual = person.getSizeOfList();
        assertEquals(expected, actual);

    }


}
