public class EmailSubscriber {
    private String name;
    private String email;
    private String catOrDag; // C/c for Cat, D/d for Dog, B/b for Both


    // Constructor

    public EmailSubscriber(){

    }


    public EmailSubscriber(String name, String email, String catOrDag) {
        this.name = name;
        this.email = email;
        this.catOrDag = catOrDag;
    }

    // set & get
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

    public String getcatOrDag() {
        return catOrDag;
    }

    public void setCatOrDag(String catOrDag) {
        catOrDag = catOrDag;
    }

    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer();
        sb.append("Name: ").append(this.name).append("\t");
        sb.append("Email: ").append(this.email).append("\t");
        sb.append("Cat/Dog: ").append(this.catOrDag).append("\t");
        return sb.toString();
    }
}
