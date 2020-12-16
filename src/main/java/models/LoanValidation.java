package models;

public class LoanValidation {
    private static int totalIncome; 
    private LoanRequest request;


    private int id;
    private String name;
    private int age;
    private String occupation;
    private int loanAmount;
    private String loanPurpose;
    private int durationInDays;
    private LoanValidation interestRate;
    private LoanValidation amount;

    public LoanValidation(int id, String name, int age, String occupation, int totalIncome, int loanAmount, String loanPurpose) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.occupation = occupation;
        this.totalIncome = totalIncome;
        this.loanAmount = loanAmount;
        this.loanPurpose = loanPurpose;
        this.durationInDays = durationInDays;
    }



    public int getTotalIncome() {
        return totalIncome;
    }
    public  int loanAmount(){
        return loanAmount;
    }
    public int getDurationInDays() {
        return durationInDays;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CurrentOfferResult that = (CurrentOfferResult) o;

        if (!amount.equals(that.amount)) return false;
        return interestRate.equals(that.interestRate);

    }

    @Override
    public int hashCode() {
        int result = amount.hashCode();
        result = 31 * result + interestRate.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "CurrentOffer{" +
                "amount=" + amount +
                ", interestRate=" + interestRate +
                '}';
    }

    public static <loanValidation> int  loanAmounts(LoanValidation loanValidation, int thousand) {
        if (totalIncome > 5000) {
            totalIncome = thousand += 1;
        } else if (totalIncome < 5000) {
            totalIncome = thousand -= 1;
        }
        return thousand;
    }

    private class CurrentOfferResult {
        public LoanValidation amount;
        public LoanValidation interestRate;
    }
}
