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
public class AddStudentModelUnitTest {
    AddStudent adds; 
    
    @Before 
        public void setUp() throws Exception{
        adds = new AddStudent();
    }
    
    @Test   
    public void testActionPerformed(){
        assertEquals(10,adds.calculate_addstudent(5,5));
    } 
    
}
