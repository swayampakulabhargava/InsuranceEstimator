/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author HP
 */
public class mainTest {
    
    public mainTest() {
    }

    

    @org.junit.jupiter.api.Test
    public void testLifeInsurance() {
        System.out.println("lifeInsurance");
        int userage = 33;
        int expResult = 465;
        int result = main.lifeInsurance(userage);
        assertEquals(expResult, result);

    }
    
}
