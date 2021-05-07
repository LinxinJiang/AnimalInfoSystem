
/**
 *
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Operate{

    private ArrayList<Animal> animalsList;

    public Operate(){
        this.animalsList = new ArrayList<>();

    }

    public ArrayList<Animal> getAnimalsList() {
        return animalsList;
    }

    public void addAnimalLogic(){
        // New a Menu object: show the add Animal menu
        Menu menu = new Menu();
        // New a CheckAnimalInfo object: check user input
        CheckAnimalInfo checkAnimalInfo = new CheckAnimalInfo();

        while(true){
            menu.addAnimalMenu();

            // check user input: menu
            int userInputMenu = checkAnimalInfo.menuItemValidate(1,3);

            switch (userInputMenu){
                case 1:
                    // add animal info
                    addAnimal();
                    break;
                case 2:
                    // show all the info
                    showAllAnimal();
                    break;
                case 3:
                    // return back to last section: using 'return' to break
                    return;
            }
        }
    }

    public void searchAnimalLogic(){
        // New a Menu object: show the add Animal menu
        Menu menu = new Menu();
        // New a CheckAnimalInfo object: check user input
        CheckAnimalInfo checkAnimalInfo = new CheckAnimalInfo();

        while(true){
            menu.searchAnimalMenu();

            // check user input: menu
            int userInputMenu = checkAnimalInfo.menuItemValidate(1,4);

            switch (userInputMenu){
                case 1:
                    // search by ID
                    searchByAnimalId();
                    break;
                case 2:
                    // search by name
                    searchByAnimalName();
                    break;
                case 3:
                    // show all the information
                    showAllAnimal();
                    break;
                case 4:
                    // return back to last section: using 'return' to break
                    return;
            }
        }
    }



    public void modifyAnimalLogic(){
        // New a Menu object: show the add Animal menu
        Menu menu = new Menu();
        // New a CheckAnimalInfo object: check user input
        CheckAnimalInfo checkAnimalInfo = new CheckAnimalInfo();

        while(true){
            menu.mainModifyAnimalInfoMenu();

            // check user input: menu
            int userInputMenu = checkAnimalInfo.menuItemValidate(1,3);

            switch (userInputMenu){
                case 1:
                    // Modify Animal Information
                    modifyAnimalInfo();
                    break;
                case 2:
                    // show all the information
                    showAllAnimal();
                    break;
                case 3:
                    // return back to last section: using 'return' to break
                    return;
            }
        }
    }



    public void deleteAnimalLogic(){
        // New a Menu object: show the add Animal menu
        Menu menu = new Menu();
        // New a CheckAnimalInfo object: check user input
        CheckAnimalInfo checkAnimalInfo = new CheckAnimalInfo();

        while(true){
            menu.deleteAnimalInfoMenu();

            // check user input: menu
            int userInputMenu = checkAnimalInfo.menuItemValidate(1,3);

            switch (userInputMenu){
                case 1:
                    // Delete Animal Information
                    deleteAnimalInfo();
                    break;
                case 2:
                    // show all the information
                    showAllAnimal();
                    break;
                case 3:
                    // return back to last section: using 'return' to break
                    return;
            }
        }
    }



    public void orderAnimalLogic(){
        // New a Menu object: show the add Animal menu
        Menu menu = new Menu();
        // New a CheckAnimalInfo object: check user input
        CheckAnimalInfo checkAnimalInfo = new CheckAnimalInfo();

        while(true){
            menu.orderAnimalInfoMenu();

            // check user input: menu
            int userInputMenu = checkAnimalInfo.menuItemValidate(1,5);

            switch (userInputMenu){
                case 1:
                    // Order by Name
                    orderAnimalByName();
                    break;
                case 2:
                    // Order by Age
                    orderAnimalByAge();
                    break;
                case 3:
                    // Show all the information
                    showAllAnimal();
                    break;
                case 4:
                    // return back to last section: using 'return' to break
                    return;
            }
        }
    }





    public ArrayList  addAnimal(){
        // new checkAnimalInfo Object to check user input
        CheckAnimalInfo checkAnimalInfo = new CheckAnimalInfo();
        String species = checkAnimalInfo.speciesValidate();
        String name = checkAnimalInfo.nameValidate();
        int age = checkAnimalInfo.ageValidate();
        String gender = checkAnimalInfo.genderValidate();
        double weight = checkAnimalInfo.weightValidate();
        String location = checkAnimalInfo.locationValidate();

        // create a animal
        Animal animal = new Animal(species,name,age,gender,weight,location);

        // add animal into the list
        this.animalsList.add(animal);

        // set animal ID
        animal.setId(this.animalsList.size());

        return animalsList;
    }

    public void showAllAnimal(){
        if(this.animalsList.size() == 0){
            System.out.println("Enter an animal's information first.");
            return;
        }

        for(int i = 0; i < this.animalsList.size(); i++){
            System.out.println(this.animalsList.get(i));
        }

    }

    public void searchByAnimalId(){
        // new checkAnimalInfo Object to check user input
        CheckAnimalInfo checkAnimalInfo = new CheckAnimalInfo();

        // check user input
        int id = checkAnimalInfo.idValidate();

        boolean notExist = true;

        System.out.println("ANimal size" + animalsList.size());

        System.out.println("For loop begin before");

        for(int i = 0; i < 2; i++){

            if(id == animalsList.get(i).getId()){
                System.out.println("If exist");
                System.out.println(animalsList.get(i));
                System.out.println("print out");
                notExist = false;
            }
        }



//        if(notExist){
//            System.out.println("Sorry,this id does not exist in the record.");
//        }
    }

    public void searchByAnimalName(){
        // new checkAnimalInfo Object to check user input
        CheckAnimalInfo checkAnimalInfo = new CheckAnimalInfo();
        // check user input
        String name = checkAnimalInfo.nameValidate();

        boolean notExist = true;



        for(int i =0;i<this.animalsList.size();i++){
            if(name.equals(this.animalsList.get(i).getName())){
                System.out.println(this.animalsList.get(i));
                notExist = false;
            }
        }

        if(notExist){
            System.out.println("Sorry,this name does not exist in the record.");
        }
    }



    // Not use in the program
    public void searchByAnimalAge(){

        // new checkAnimalInfo Object to check user input
        CheckAnimalInfo checkAnimalInfo = new CheckAnimalInfo();

        // check user input
        int age = checkAnimalInfo.idValidate();

        boolean notExist = true;

        for(int i = 0; i < animalsList.size(); i++){
            if(age == animalsList.get(i).getAge()){
                System.out.println(animalsList.get(i));
                notExist = false;
            }
        }

        if(notExist){
            System.out.println("Sorry,we don't have animal in this age.");
        }
    }



    public void modifyAnimalInfo(){

        // check if list is empty
        if(this.animalsList.size() == 0){
            System.out.println("Enter an animal's information first.");
            return;
        }

        // new checkAnimalInfo Object to check user input
        CheckAnimalInfo checkAnimalInfo = new CheckAnimalInfo();

        // new menu object for show the menu
        Menu menu = new Menu();

        // check user input: if animal id exist
        System.out.println("[Enter the animal's ID] ");
        int animalIDInput = checkAnimalInfo.menuItemValidate(1,animalsList.size());

        // Open subModifyAnimalInfoMenu()
        menu.subModifyAnimalInfoMenu();

        // check user input: if service number exist
        int serviceNumInput = checkAnimalInfo.menuItemValidate(1,7);

        switch (serviceNumInput){
            case 1:
                // Modify Animal's Species
                String species = checkAnimalInfo.speciesValidate();
                animalsList.get((animalIDInput - 1)).setSpecies(species);
                break;
            case 2:
                // Modify Animal's Name
                String name = checkAnimalInfo.nameValidate();
                animalsList.get((animalIDInput - 1)).setName(name);
                break;
            case 3:
                // Modify Animal's age
                int age = checkAnimalInfo.ageValidate();
                animalsList.get((animalIDInput - 1)).setAge(age);
                break;
            case 4:
                // Modify Animal's Gender
                String gender = checkAnimalInfo.genderValidate();
                animalsList.get((animalIDInput - 1)).setGender(gender);
                break;
            case 5:
                // Modify Animal's Weight
                double weight = checkAnimalInfo.weightValidate();
                animalsList.get((animalIDInput - 1)).setWeight(weight);
                break;
            case 6:
                // Modify Animal's Location
                String location = checkAnimalInfo.locationValidate();
                animalsList.get((animalIDInput - 1)).setLocation(location);
                break;
            case 7:
                // Return Back To Last Menu
                return;
        }

    }


    public void deleteAnimalInfo(){

        // check if list is empty
        if(this.animalsList.size() == 0){
            System.out.println("Enter an animal's information first.");
            return;
        }

        // new checkAnimalInfo Object to check user input
        CheckAnimalInfo checkAnimalInfo = new CheckAnimalInfo();

        // check user input: animal ID
        System.out.println("[Enter the animal's ID] ");
        int userInputID = checkAnimalInfo.menuItemValidate(1,animalsList.size());

        // delete
        animalsList.remove(userInputID - 1);

        // reset ID
        for(int i = 0; i < animalsList.size(); i++){
            animalsList.get(i).setId(i+1);
        }

        System.out.println("successfully deleted");
    }



    public void orderAnimalByName(){
        Collections.sort(animalsList,new OrderByName());
        System.out.println("Sorted successfully! Please check on 'Show All The Animal Information'");
    }

    // order by name operator
    class OrderByName implements Comparator<Animal>{

        @Override
        public int compare(Animal a1, Animal a2) {
            return a1.getName().compareTo(a2.getName());
        }
    }




    public void orderAnimalByAge(){
        Collections.sort(animalsList,new OrderByAge());
        System.out.println("Sorted successfully! Please check on 'Show All The Animal Information'");


    }

    // order by age operator
    class OrderByAge implements Comparator<Animal>{

        @Override
        public int compare(Animal a1, Animal a2) {
            Integer age1 = a1.getAge();
            Integer age2 = a2.getAge();
            return age1.compareTo(age2);
        }
    }



}
