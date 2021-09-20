/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LSMProject.controller;
import static org.junit.Assert.*;
import org.junit.*;
/**
 *
 * @author fattahmed
 */


public class ForgotControllerUnitTest {
    Forgot fgt;
    
    @Before
    public void setUp() throws Exception{
       fgt = new Forgot();
     }
    
    @Test
    public void testActionPerformed(){
        assertEquals(10,fgt.calculate_forgot(5,5));
    }
    
}
