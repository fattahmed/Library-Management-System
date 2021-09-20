/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LSMProject.model;
import static org.junit.Assert.*;
import org.junit.*;

/**
 *
 * @author fattahmed
 */
public class ReturnBookModelUnitTest {
    ReturnBook retb; 
    
    @Before 
        public void setUp() throws Exception{
        retb = new ReturnBook();
    }
    
    @Test   
    public void testActionPerformed(){
        assertEquals(10,retb.calculate_returnbook(5,5));
    } 
    
}
