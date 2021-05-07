/**
 *  Animal Object
 */

public class Animal {
    private int id;
    private String species;
    private String name;
    private int age;
    private String gender;
    private double weight;
    private String location;

    // Constructor

    public Animal(){

    }


    public Animal(String species, String name, int age, String gender, double weight, String location) {
        this.species = species;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.weight = weight;
        this.location = location;
    }



    // set & get
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer();
        sb.append("ID: ").append(this.id).append("\t");
        sb.append("Name: ").append(this.name).append("\t");
        sb.append("Species: ").append(this.species).append("\t");
        sb.append("Age: ").append(this.age).append("\t");
        sb.append("Gender: ").append(this.gender).append("\t");
        sb.append("Weight: ").append(this.weight).append("\t");
        sb.append("Location: ").append(this.location).append("\t");
        return sb.toString();
    }
}
