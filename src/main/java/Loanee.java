public class Loanee {
    private int id;
    private String name;
    private int age;
    private String occupation;
    private int totalIncome;
    private int loanAmount;
    private String loanPurpose;


    public static final String EMPLOYED = "employed";
    public static final  String UNEMPLOYED = "unemployed";
    public  static final String SELFEMPLOYED ="selfemployed"


    public Loanee(String name, int age, String occupation, int totalIncome, int loanAmount, String loanPurpose) {
        this.name = name;
        this.age = age;
        this.occupation = occupation;
        this.totalIncome = totalIncome;
        this.loanAmount = loanAmount;
        this.loanPurpose = loanPurpose;


    }
}
