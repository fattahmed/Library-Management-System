/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LSMProject.view;
import static org.junit.Assert.*;
import org.junit.*;

/**
 *
 * @author fattahmed
 */
public class HomeViewUnitTest {
    Home home; 
    
    @Before 
        public void setUp() throws Exception{
        home = new Home();
    }
    
    @Test   
    public void testActionPerformed(){
        assertEquals(10,home.calculate_home(5,5));
    } 
    
}
