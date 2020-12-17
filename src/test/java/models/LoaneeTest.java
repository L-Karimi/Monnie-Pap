package models;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
public class LoaneeTest {
    @Before
    public void setUp() throws Exception {
    }
    @After
    public void tearDown() throws Exception {
    }
    @Test
    public void loanee_instantiantesCorrectlyName() {
        Loanee testLoanee = setUpLoanee();
        assertEquals("Shiko", testLoanee.getName());
    }
    @Test
    public void setId() {
        Loanee testLoanee = setUpLoanee();
        testLoanee.setId(5);
        assertEquals(5, testLoanee.getId());
    }
    @Test
    public void setName() {
        Loanee testLoanee = setUpLoanee();
        testLoanee.setName("Kelvin");
        assertNotEquals("Sharon", testLoanee.getName());
    }
    // helper
    public Loanee setUpLoanee(){
        return new Loanee("Shiko", 22, "Developer", 50000, 20000, "Company registration");
    }
}

