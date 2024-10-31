package tdd;

//import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    Calculator calculator;


    @BeforeEach
    public  void setUp(){
       calculator = new Calculator();
    }


    @Test
    @DisplayName("The isGreater Test case")
    public void isGreaterTest(){
        //Arrange
        int x = 100;
        int y = 17;
        //Act
        boolean actual = calculator.isGreater(x,y);

        //Assert
        assertTrue(actual, "should be greater");



    }



    @Test
    @DisplayName("The add test method")
    void add() {
        //Arrange - Given


        //expected
        double expected = 6.0;
        //Act - When

        //actual
        double actual = calculator.add(2,4);

        //Assert - Then
       assertEquals(expected, actual, "Message: should add two numbers");

    }

    @Test
    @DisplayName("The subtract test method")
    void subtract(){

        //Arrange - Given


        //expected
        double expected = 0.0;
        //Act - When

        //actual
        double actual = calculator.subtract(4,4);

        //Assert - Then
       assertEquals(expected, actual, "Message: should subtract two numbers");

    }


//    @Test
//    @DisplayName("The multiply test method")
//    public void multiplyElementsByNumberTest(){
//        //Arrange - Given
//        int [] array = {10,2,3,10,1,0,2,3,16,0,2};
//
//        int [] expected = {100,20,30,100,10,0,20,30,160,0,20};
//
//        //Act - When
//        int [] actual = calculator.multiplyElementsByNumber(array, 10);
//
//        // Assert - Then
//       assertArrayEquals(expected, actual);
//
//
//    }




}