package dao;

import models.Loanee;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;
import org.sql2o.Sql2o;

import org.sql2o.Connection;

import static org.junit.Assert.*;

public class Sql2oLoaneeDaoTest {

    private static Connection conn;
    private static Sql2oLoaneeDao loaneeDao;


    @Before
    public void setUp() throws Exception {
        String connectionString = "jdbc:postgresql://localhost:5432/lend_test";
        Sql2o sql2o = new Sql2o(connectionString, "moringa", "Nya2rango@");
        loaneeDao = new Sql2oLoaneeDao(sql2o);
        conn = sql2o.open();
    }

    @After
    public void tearDown() throws Exception {
        loaneeDao.clearAllLoanee();
    }

    @AfterClass
    public static void shutDown() throws Exception{
        conn.close();
        System.out.println("connection closed");
    }

//    @Test
//    public  void clearAll() throws Exception{
//        Loanee testLoanee = setupNewLoanee();
//        loaneeDao.clearAllLoanee();
//        assertEquals(0, loaneeDao.getAllLoanee().size());

//    }

    @Test
    public void addingLoanSetsId() throws Exception {
        Loanee testLoanee = setupNewLoanee();
        int originalLoaneeId = testLoanee.getId();
        loaneeDao.add(testLoanee);
        assertNotEquals(originalLoaneeId,testLoanee.getId());
    }
    // helpers

    public Loanee setupNewLoanee(){

        return new Loanee("Jerry", 23, "nurse", 100000, 70000, "medical kits");
    }

}