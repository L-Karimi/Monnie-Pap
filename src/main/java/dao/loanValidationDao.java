package dao;
import models.*;
import java.util.List;

public interface loanValidationDao {


    //    List
    List<loanValidationDao> getAllLoanValidationD();

    List<Loanee> getAllLoanee();

    //    Create
    void add(loanValidationDao loanValidationDao);
    //    Read
    loanValidationDao findById(int id);
    //    Update
    void update(int id, String name, int age, String occupation, int totalIncome, int loanAmount, String loanPurpose);
    //     DELETE
    void deleteById(int id);
    void clearAllLoanValidation();
}











