import java.util.ArrayList;
import java.util.Scanner;

public class ApplicantOperate {

    ApplicantQueue applicantQueue = new ApplicantQueue();


    public void applicantLogic(){
        // New a Menu object: show the add Animal menu
        Menu menu = new Menu();
        // New a CheckAnimalInfo object: check user input
        CheckAnimalInfo checkAnimalInfo = new CheckAnimalInfo();

        while(true){
            menu.applicantMenu();

            // check user input: menu
            int userInputMenu = checkAnimalInfo.menuItemValidate(1,3);

            switch (userInputMenu){
                case 1:
                    // Add Adoption applications
                    addApplicant();
                    break;
                case 2:
                    // show all the info
                    processingApp();
                    break;
                case 3:
                    // return back to last section: using 'return' to break
                    return;
            }
        }
    }



    public void addApplicant(){


        // get operate class
        Operate operate = new Operate();

        /**
         *
         * A bug here, come back later;
         * when animalsList have animal， still said please add animal first

        if(operate.getAnimalsList().size() <= 0){
            System.out.println("Please add animal first");
            return;
        }

        */

        // new checkAnimalInfo Object to check user input
        CheckUserInfo checkUserInfo = new CheckUserInfo();
        String name = checkUserInfo.nameValidate();
        String email = checkUserInfo.emailValidate();
        String phone = checkUserInfo.phoneNumberValidate();

        String animal = checkUserInfo.animalValidate(operate.getAnimalsList());

        // create a animal
        ApplicantForAdoption applicant = new ApplicantForAdoption(name,email,phone,animal);

        // add applicant into the list
        applicantQueue.enQueue(applicant);

        System.out.println("Adding applicant successfully.");

    }

    public void processingApp(){

        System.out.println(applicantQueue.getSize() + " applicants are waiting to be viewed.");

        // print out the applicant information
        System.out.println(applicantQueue.peek().toString());

        // create user input
        Scanner scanner = new Scanner(System.in);

        System.out.print("Have you finished processing(1 for yes | 0 for no):");
        String chooseString = scanner.nextLine();

        int choose = Integer.parseInt(chooseString);

        if(choose == 1){
            // delete information
            applicantQueue.deQueue();
        }else{
            System.out.println("You will keep working on this applicant.");
        }

        System.out.println(applicantQueue.getSize() + " applicants are waiting to be viewed.");

    }

}

