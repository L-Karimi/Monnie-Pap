package dao;

import models.Loanee;
import org.sql2o.Sql2o;

import org.sql2o.Connection;
import org.sql2o.Sql2oException;

import java.util.List;

public class Sql2oLoaneeDao implements LoaneeDao {

    private final Sql2o sql2o;

    public Sql2oLoaneeDao(Sql2o sql2o) {
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
    public void add(Loanee loanee) {
        String sql = "INSERT INTO loans (name, age, occupation, totalIncome, loanAmount, loanPurpose) VALUES (:name, :age, :occupation, :totalincome, :loanamout, :loanpurpose) ";
        try (Connection con = sql2o.open()) {
            int id = (int) con.createQuery(sql, true)
                    .throwOnMappingFailure(false)
                    .bind(loanee)
                    .addParameter("Cate", loanee.getName())
                    .addParameter("age", loanee.getAge())
                    .addParameter("occupation", loanee.getOccupation())
                    .addParameter("totalIncome", loanee.getLoanAmount())
                    .addParameter("loanAmount", loanee.getLoanAmount())
                    .addParameter("loanPurpose", loanee.getLoanPurpose())
                    .executeUpdate()
                    .getKey();
            loanee.setId(id);
        }catch (Sql2oException ex){
            System.out.println(ex);
        }
        }


    @Override
    public Loanee findById(int id) {
        return null;
    }

    @Override
    public void update(int id, String name, int age, String occupation, int totalIncome, int loanAmount, String loanPurpose) {

    }

    @Override
    public void deleteById(int id) {

    }

    @Override
    public void clearAllLoanee() {

    }
}
