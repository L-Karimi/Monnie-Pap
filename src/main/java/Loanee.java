public class Loanee {
        private int id;
    private String name;
    private int age;
    private String occupation;
    private int totalIncome;
    private int loanAmount;
    private String loanPurpose;


    public Loanee(String name, int age, String occupation, int totalIncome, int loanAmount, String loanPurpose) {
        this.name = name;
        this.age = age;
        this.occupation = occupation;
        this.totalIncome = totalIncome;
        this.loanAmount = loanAmount;
        this.loanPurpose = loanPurpose;
    }
}
