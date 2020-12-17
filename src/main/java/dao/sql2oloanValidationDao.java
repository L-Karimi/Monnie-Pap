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
    public List<Loanee> getAllLoanValidation() {
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
        String sql = "INSERT INTO lend (name, age, occupation, totalIncome, loanAmount, loanPurpose) VALUES (:name, :age, :occupation, :totalincome, :loanamout, :loanpurpose) ";
            try (Connection con = sql2o.open()) {
                int id = (int) con.createQuery(sql, true)
                        .throwOnMappingFailure(false)
                        .bind(loanValidationDao)
                        .addParameter("Cate", loanValidationDao.getName())
                        .addParameter("age", loanValidationDao.getAge())
                        .addParameter("occupation", loanValidationDao.getOccupation())
                        .addParameter("totalIncome", loanValidationDao.getLoanAmount())
                        .addParameter("loanAmount", loanValidationDao.getLoanAmount())
                        .addParameter("loanPurpose", loanValidationDao.getLoanPurpose())
                        .executeUpdate()
                        .getKey();
                loanValidationDao.setId(id);
            }catch (Sql2oException ex){
                System.out.println(ex);
            }
        }


    @Override
    public loanValidationDao findById(int id) {
//        return null;

            try(Connection con = sql2o.open()){
                return (loanValidationDao) con.createQuery("SELECT * FROM lend WHERE id = :id")
                        .addParameter("id", id)
                        .executeAndFetchFirst(loanValidationDao.class);
            }
        }


    @Override
    public void update(int id, String name, int age, String occupation, int totalIncome, int loanAmount, String loanPurpose) {
        String sql = "UPDATE lends SET (name, age, occupation, totalIncome, loanAmount, loanPurpose) = (:name, :age, :occupation, :totalincome, loanpurpose)";
            try(Connection con = sql2o.open()){
                String  newOccupation = String.valueOf(0);
                int newTotalIncome = 0;
                String newLoanPurpose = String.valueOf(0);
                String newAge = String.valueOf(0);
                String newName = String.valueOf(0);
                con.createQuery(sql)
                        .addParameter("name", newName)
                        .addParameter("age", newAge)
                        .addParameter("occupation", newOccupation)
                        .addParameter("totalIncome", newTotalIncome)
                        .addParameter("loanPurpose", newLoanPurpose)
                        .addParameter("id", id)
                        .executeUpdate();
            } catch (Sql2oException ex) {
                System.out.println(ex);
            }
        }



    @Override
    public void deleteById(int id) {

    }

    @Override
    public void clearAllLoanValidation() {

    }

}
