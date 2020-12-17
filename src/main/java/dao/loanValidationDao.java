package dao;

import models.LoanValidation;


import java.util.BitSet;
import java.util.List;

public interface loanValidationDao {


    static BitSet getAllLoanValidation() {
        return null;
    }

    //    List
    List<loanValidationDao> getAllLoanValidationD();

//    static List<LoanValidation> getAllLoanValidation() {
//        return null;


    //    Create
    void add(loanValidationDao loanValidationDao);
    //    Read
    loanValidationDao findById(int id);
    //    Update
    void update(int id, String name, int age, String occupation, int totalIncome, int loanAmount, String loanPurpose);
    //     DELETE
    void deleteById(int id);
    void clearAllLoanValidation();

    String getLoanPurpose();

    int getAge();

    String getName();

    int getLoanAmount();

    String getOccupation();

     int setId(int id);
}












