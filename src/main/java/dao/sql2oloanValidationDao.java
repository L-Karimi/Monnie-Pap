package dao;

import models.Loanee;
import org.sql2o.Sql2o;

import org.sql2o.Connection;
import org.sql2o.Sql2oException;

import java.util.List;

public abstract class sql2oloanValidationDao implements loanValidationDao {
    private final Sql2o sql2o;

    public sql2oloanValidationDao(Sql2o sql2o) {
        this.sql2o = sql2o;
    }
    @Override
    public List<Loanee> getAllLoanee() {
        try (Connection con = sql2o.open()){
            String sql = "SELECT * FROM loans";
            return  con.createQuery(sql)
                    .throwOnMappingFailure(false)
                    .executeAndFetch(Loanee.class);
        }catch (Sql2oException ex){
            System.out.println(ex);
            return null;
        }
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
