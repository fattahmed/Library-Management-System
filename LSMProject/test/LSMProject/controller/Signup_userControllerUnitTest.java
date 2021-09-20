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
public class Signup_userControllerUnitTest {
    Signup suser; 
    
    @Before 
    public void setUp() throws Exception{
        suser = new Signup();
    }
    
    @Test   
    public void testActionPerformed(){
        assertEquals(10,suser.calculate_signup(5,5));
    } 
}
