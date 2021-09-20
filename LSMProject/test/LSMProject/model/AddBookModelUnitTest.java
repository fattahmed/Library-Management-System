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
public class AddBookModelUnitTest {
    AddBook addb; 
    
    @Before 
        public void setUp() throws Exception{
        addb = new AddBook();
    }
    
    @Test   
    public void testActionPerformed(){
        assertEquals(10,addb.calculate_addbook(5,5));
    } 
    
}
