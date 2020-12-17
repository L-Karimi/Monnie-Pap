package dao;
import models.LoanValidation;
import org.junit.After;

import org.junit.Before;
import org.junit.Test;
import org.sql2o.Sql2o;

import org.sql2o.Connection;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;

import java.util.Queue;

import static org.junit.Assert.*;

public class sql2oloanValidationDaoTest {
    private static Connection conn;
    private static Sql2oloanValidationDao loanValidationDao;

    @Before
    public void setUp() throws Exception {
        String connectionString = "jdbc:postgresql://localhost:5432/lend_test";
        Sql2o sql2o = new Sql2o(connectionString, "moringa", "lucy");
        loanValidationDao = new Sql2oloanValidationDao(sql2o);
//        conn = sql2o.open();
    }

    @After
    public void tearDown() throws Exception {
        loanValidationDao.clearAllLoanValidation();

    }
   @Test
   public  void clearAll() throws Exception{
        loanValidationDao testLoanee = setupNewLoanee();
       loanValidationDao.clearAllLoanValidation();
//        assertEquals(0, dao.loanValidationDao.getAllLoanValidation().size());

       }
    @Test
    public void addingLoanSetsId() throws Exception {
        LoanValidation testLoanValidation = setupNewLoanValidation();
//        int originalLoaneeId = testLoanValidation.getId();
        Queue<Object> loanValidation = null;
//        loanValidation.add(testLoanValidation);
        long originalLoaneeId = 0;
//        assertNotEquals(originalLoaneeId,testLoanValidation.getId());
    }

    private LoanValidation setupNewLoanValidation() {
        return null;
    }

    private class Sql2oloanValidationDao {
        public Sql2oloanValidationDao(Sql2o sql2o) {
        }

        public void clearAllLoanValidation() {

        }
    }


    private dao.loanValidationDao setupNewLoanee() {
        return null;
    }
    }