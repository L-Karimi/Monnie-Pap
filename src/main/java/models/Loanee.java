package models;

import java.util.Objects;

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
    public  static final String SELFEMPLOYED ="selfemployed";
    public Loanee(String name, int age, String occupation, int totalIncome, int loanAmount, String loanPurpose) {
        this.name = name;
        this.age = age;
        this.occupation = occupation;
        this.totalIncome = totalIncome;
        this.loanAmount = loanAmount;
        this.loanPurpose = loanPurpose;
    }
    public int getId()
    {
        return id;
    }
    public void setId(int id) {

        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getOccupation() {
        return occupation;
    }
    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }
    public int getTotalIncome() {

        return totalIncome;
    }
    public void setTotalIncome(int totalIncome) {

        this.totalIncome = totalIncome;
    }
    public int getLoanAmount() {
        return loanAmount;
    }
    public void setLoanAmount(int loanAmount) {
        this.loanAmount = loanAmount;
    }

    public String getLoanPurpose() {
        return loanPurpose;
    }
    public void setLoanPurpose(String loanPurpose) {
        this.loanPurpose = loanPurpose;
    }
    public static String getEMPLOYED() {
        return EMPLOYED;
    }
    public static String getUNEMPLOYED() {
        return UNEMPLOYED;
    }
    public static String getSELFEMPLOYED() {
        return SELFEMPLOYED;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Loanee)) return false;
        Loanee loanee = (Loanee) o;
        return getId() == loanee.getId() &&
                getAge() == loanee.getAge() &&
                getTotalIncome() == loanee.getTotalIncome() &&
                getLoanAmount() == loanee.getLoanAmount() &&
                Objects.equals(getName(), loanee.getName()) &&
                Objects.equals(getOccupation(), loanee.getOccupation()) &&
                Objects.equals(getLoanPurpose(), loanee.getLoanPurpose());
    }
    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName(), getAge(), getOccupation(), getTotalIncome(), getLoanAmount(), getLoanPurpose());
    }
}