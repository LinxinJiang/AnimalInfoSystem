public class ApplicantForAdoption {
    private String name;
    private String email;
    private String phone;
    private String animalList;


    // Constructor
    public ApplicantForAdoption(){

    }

    public ApplicantForAdoption(String name, String email, String phone,String animalList) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.animalList = animalList;
    }


    // get & set
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAnimalList() {
        return animalList;
    }

    public void setAnimalList(String animalList) {
        this.animalList = animalList;
    }

    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer();
        sb.append("Name: ").append(this.name).append("\t");
        sb.append("Phone Number: ").append(this.phone).append("\t");
        sb.append("Email: ").append(this.email).append("\t");
        sb.append("Apply for: ").append(this.animalList.toString()).append("\t");
        return sb.toString();
    }
}
