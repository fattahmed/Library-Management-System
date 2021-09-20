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
public class LibraryManagementSystemViewUnitTest {
    LibraryManagementSystem lmsm; 
    
    @Before 
        public void setUp() throws Exception{
        lmsm = new LibraryManagementSystem();
    }
    
    @Test   
    public void testActionPerformed(){
        assertEquals(10,lmsm.calculate_librarymanagementsystem(5,5));
    } 
    
}
