package dao;

import models.Loanee;

import java.util.List;

public interface LoaneeDao {
//    List
    List<Loanee> getAllLoanee();

//    Create
     void add(Loanee loanee);

//    Read
    Loanee findById(int id);

//    Update
    void update(int id, String name, int age, String occupation, int totalIncome, int loanAmount, String loanPurpose);

//     DELETE
    void deleteById(int id);
    void clearAllLoanee();
}
