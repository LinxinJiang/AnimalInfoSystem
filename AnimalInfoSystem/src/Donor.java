public class Donor {
    private String donorName;
    private String pNum;
    private double amount;

    // Constructor

    public Donor(){

    }

    public Donor(String donorName, String pNum, double amount) {
        this.donorName = donorName;
        this.pNum = pNum;
        this.amount = amount;
    }

    // set & get
    public String getDonorName() {
        return donorName;
    }

    public void setDonorName(String donorName) {
        this.donorName = donorName;
    }

    public String getpNum() {
        return pNum;
    }

    public void setpNum(String pNum) {
        this.pNum = pNum;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer();
        sb.append("Name: ").append(this.donorName).append("\t");
        sb.append("Phone Number: ").append(this.pNum).append("\t\t");
        sb.append("Amount: ").append(this.amount).append("\t\t");

        return sb.toString();
    }
}
