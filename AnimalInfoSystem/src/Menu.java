/**
 *  All the menu that this program will be use
 */

public class Menu {

    // First menu (Animal/Person)
    public void menuBarAnimalOrPerson(){
        System.out.println("+-------------------------------------------------------------+");
        System.out.println("|                 1. Animal Information                       |");
        System.out.println("|                 2. User Information                         |");
        System.out.println("|                 3. Exit                                     |");
        System.out.println("+-------------------------------------------------------------+");
    }


    ///////////////////////// User Section //////////////////////////////////////
    public void userSubMenu(){
        System.out.println("+-------------------------------------------------------------+");
        System.out.println("|                 1. Adoption Application                     |");
        System.out.println("|                 2. Add Donor Information                    |");
        System.out.println("|                 3. Record Email Subscriber Information      |");
        System.out.println("|                 4. Return Back To Last Menu                 |");
        System.out.println("+-------------------------------------------------------------+");
    }


    // Donor
    public void donorMenu(){
        System.out.println("+-------------------------------------------------------------+");
        System.out.println("|                 1. Add Donor Information                    |");
        System.out.println("|                 2. Show ALl The Donor                       |");
        System.out.println("|                 3. Return Back To Last Menu                 |");
        System.out.println("+-------------------------------------------------------------+");
    }

    // Applicant
    public void applicantMenu(){
        System.out.println("+-------------------------------------------------------------+");
        System.out.println("|                 1. Add Adoption application                 |");
        System.out.println("|                 2. Processing Adoption Application          |");
        System.out.println("|                 3. Return Back To Last Menu                 |");
        System.out.println("+-------------------------------------------------------------+");
    }

    // subscriber
    public void subscriberMenu(){
        System.out.println("+-------------------------------------------------------------+");
        System.out.println("|                 1. Add Subscriber                           |");
        System.out.println("|                 2. Show All The Subscriber                  |");
        System.out.println("|                 3. Return Back To Last Menu                 |");
        System.out.println("+-------------------------------------------------------------+");
    }




    ///////////////////////// Animal Section //////////////////////////////////////

    // main menu of Animal
    public void mainMenu(){
        System.out.println("+-------------------------------------------------------------+");
        System.out.println("|                 1. Add Animal                               |");
        System.out.println("|                 2. Search Animal                            |");
        System.out.println("|                 3. Modify Animal Information                |");
        System.out.println("|                 4. Delete Animal Information                |");
        System.out.println("|                 5. Order Animal Information                 |");
        System.out.println("|                 6. Return Back To Last Menu                 |");
        System.out.println("|                 7. Exit                                     |");
        System.out.println("+-------------------------------------------------------------+");
    }

    // add animal
    public void addAnimalMenu(){
        System.out.println("+-------------------------------------------------------------+");
        System.out.println("|                 1. Add Animal Information                   |");
        System.out.println("|                 2. Show All The Animal Information          |");
        System.out.println("|                 3. Return Back To Last Menu                 |");
        System.out.println("+-------------------------------------------------------------+");
    }

    // Search Animal
    public void searchAnimalMenu(){
        System.out.println("+-------------------------------------------------------------+");
        System.out.println("|                 1. Search Animal by ID                      |");
        System.out.println("|                 2. Search Animal by Name                    |");
        System.out.println("|                 3. Show All The Animal Information          |");
        System.out.println("|                 4. Return Back To Last Menu                 |");
        System.out.println("+-------------------------------------------------------------+");
    }

    // Modify Animal Information - main menu
    public void mainModifyAnimalInfoMenu(){
        System.out.println("+-------------------------------------------------------------+");
        System.out.println("|                 1. Modify Animal Information                |");
        System.out.println("|                 2. Show All The Animal Information          |");
        System.out.println("|                 3. Return Back To Last Menu                 |");
        System.out.println("+-------------------------------------------------------------+");
    }

    // Modify Animal Information - main menu
    public void subModifyAnimalInfoMenu(){
        System.out.println("+-------------------------------------------------------------+");
        System.out.println("|                 1. Modify Animal's Species                  |");
        System.out.println("|                 2. Modify Animal's Name                     |");
        System.out.println("|                 3. Modify Animal's Age                      |");
        System.out.println("|                 4. Modify Animal's Gender                   |");
        System.out.println("|                 5. Modify Animal's Weight                   |");
        System.out.println("|                 6. Modify Animal's Location                 |");
        System.out.println("|                 7. Return Back To Last Menu                 |");
        System.out.println("+-------------------------------------------------------------+");
    }

    // delete animal information menu
    public void deleteAnimalInfoMenu(){
        System.out.println("+-------------------------------------------------------------+");
        System.out.println("|                 1. Delete Animal Information                |");
        System.out.println("|                 2. Show All The Animal Information          |");
        System.out.println("|                 3. Return Back To Last Menu                 |");
        System.out.println("+-------------------------------------------------------------+");
    }

    public void orderAnimalInfoMenu(){
        System.out.println("+-------------------------------------------------------------+");
        System.out.println("|                 1. Order by Name                            |");
        System.out.println("|                 2. Order by Age                             |");
        System.out.println("|                 3. Show All The Animal Information          |");
        System.out.println("|                 4. Return Back To Last Menu                 |");
        System.out.println("+-------------------------------------------------------------+");
    }


}
