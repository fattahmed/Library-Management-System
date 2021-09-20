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
public class IssueBookModelUnitTest {
    IssueBook issb; 
    
    @Before 
        public void setUp() throws Exception{
        issb = new IssueBook();
    }
    
    @Test   
    public void testActionPerformed(){
        assertEquals(10,issb.calculate_issuebook(5,5));
    } 
    
}
