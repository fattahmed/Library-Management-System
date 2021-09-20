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
public class LoginControllerUnitTest {
    Login_user luser;
    
    @Before 
    public void setUp() throws Exception{
        luser = new Login_user();
    }
    
    @Test
    public void testActionPerformed(){
        assertEquals(10,luser.calculate_login(5,5));
    }
    
}
