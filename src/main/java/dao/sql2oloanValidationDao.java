package dao;

import models.Loanee;
import org.sql2o.Sql2o;

import org.sql2o.Connection;
import org.sql2o.Sql2oException;

import java.util.List;

public class sql2oloanValidationDao implements loanValidationDao {
    @Override
    public List<loanValidationDao> getAllLoanValidationD() {
        return null;
    }

    @Override
    public void add(loanValidationDao loanValidationDao) {

    }

    @Override
    public loanValidationDao findById(int id) {
        return null;
    }

    @Override
    public void update(int id, String name, int age, String occupation, int totalIncome, int loanAmount, String loanPurpose) {

    }

    @Override
    public void deleteById(int id) {

    }

    @Override
    public void clearAllLoanValidation() {

    }
}
