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
public class StudentDetailsModelUnitTest {
    StudentDetails stud; 
    
    @Before 
        public void setUp() throws Exception{
        stud = new StudentDetails();
    }
    
    @Test   
    public void testActionPerformed(){
        assertEquals(10,stud.calculate_studentdetails(5,5));
    } 
    
}
