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
public class BookDetailsModelUnitTest {
    BookDetails bookd; 
    
    @Before 
        public void setUp() throws Exception{
        bookd = new BookDetails();
    }
    
    @Test   
    public void testActionPerformed(){
        assertEquals(10,bookd.calculate_bookdetails(5,5));
    } 
    
}
