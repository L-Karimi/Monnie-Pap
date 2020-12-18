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
            String sql = "SELECT * FROM lend";
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
        String sql = "INSERT INTO lend (name, age, occupation, totalincome, loanamount, loanpurpose) VALUES (:name, :age, :occupation, :totalincome, :loanamount, :loanpurpose) ";
        try (Connection con = sql2o.open()) {
            int id = (int) con.createQuery(sql, true)
                    .throwOnMappingFailure(false)
                    .bind(loanee)
                    .addParameter("name", loanee.getName())
                    .addParameter("age", loanee.getAge())
                    .addParameter("occupation", loanee.getOccupation())
                    .addParameter("totalincome", loanee.getTotalIncome())
                    .addParameter("loanamount", loanee.getLoanAmount())
                    .addParameter("loanpurpose", loanee.getLoanPurpose())
                    .executeUpdate()
                    .getKey();
            loanee.setId(id);
        }catch (Sql2oException ex){
            System.out.println(ex);
        }
        }


    @Override
    public Loanee findById(int id) {
        try(Connection con = sql2o.open()){
            return con.createQuery("SELECT * FROM lend WHERE id = :id")
                    .addParameter("id", id)
                    .executeAndFetchFirst(Loanee.class);
        }
    }

    @Override
    public void update(int id, String newName, int newAge, String newOccupation, int newTotalIncome, int newLoanAmount, String newLoanPurpose) {
        String sql = "UPDATE lends SET (name, age, occupation, totalIncome, loanAmount, loanPurpose) = (:name, :age, :occupation, :totalincome, loanpurpose)";
        try(Connection con = sql2o.open()){
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
        String sql = "DELETE from lend WHERE id=:id";
        try (Connection con = sql2o.open()){
            con.createQuery(sql)
                    .addParameter("id", id)
                    .executeUpdate();
        }catch (Sql2oException ex) {
            System.out.println(ex);
        }
    }

    @Override
    public void clearAllLoanee() {
        String sql = "DELETE from lends";
        try(Connection con = sql2o.open()){
            con.createQuery(sql)
                    .executeUpdate();
        } catch (Sql2oException ex){
            System.out.println(ex);
        }

    }
}
