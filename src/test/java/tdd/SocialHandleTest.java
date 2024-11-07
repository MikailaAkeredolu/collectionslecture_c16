package tdd;

import demo.SocialHandle;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SocialHandleTest {

    @Test
    void createHandleTest(){
        SocialHandle socialHandle = new SocialHandle();
        String expecetd = "@bandsmake";
        String actual = socialHandle.createHandle("BandsMakesMikailaDance");
        Assertions.assertEquals(expecetd, actual);
    }

}
