import java.util.ArrayList;

/**
 *  Where the system start
 */

public class AnimalApp {

    // Start the program
    public static void main(String[] args) {


        AnimalApp start = new AnimalApp();

        IdAndPassword idAndPassword = new IdAndPassword();

        Login loginPage = new Login(idAndPassword.getLoginInfo());


        System.out.println("+-------------------------------------------------------------+");
        System.out.println("|                            WePets                           |");
        System.out.println("+-------------------------------------------------------------+");

    }

    // control the menu
    public void start() {

        // new menu object
        Menu menu = new Menu();

        // new checkAnimalInfo object
        CheckAnimalInfo checkAnimalInfo = new CheckAnimalInfo();


        while (true) {
            // start main menu
            menu.menuBarAnimalOrPerson();

            int AnimalOrPerson = checkAnimalInfo.menuItemValidate(1, 3);

            switch (AnimalOrPerson) {
                case 1:
                    startAnimalSection();
                    break;
                case 2:
                    startUserSection();
                    break;
                case 3:
                    System.exit(0);
            }


        }

    }

    public void startAnimalSection() {
        // new menu object
        Menu menu = new Menu();

        // new checkAnimalInfo object
        CheckAnimalInfo checkAnimalInfo = new CheckAnimalInfo();

        // new operate object
        Operate operate = new Operate();

        // start main menu of animal
        menu.mainMenu();
        int userInput = checkAnimalInfo.menuItemValidate(1, 6);


        switch (userInput) {
            case 1:
                operate.addAnimalLogic();
                break;
            case 2:
                operate.searchAnimalLogic();
                break;
            case 3:
                operate.modifyAnimalLogic();
                break;
            case 4:
                operate.deleteAnimalLogic();
                break;
            case 5:
                operate.orderAnimalLogic();
                break;
            case 6:
                return;
            case 7:
                System.exit(0);
        }
    }


    public void startUserSection() {
        // new menu object
        Menu menu = new Menu();

        // new checkAnimalInfo object
        CheckAnimalInfo checkAnimalInfo = new CheckAnimalInfo();

        // new applicant operate object
        ApplicantOperate applicantOperate = new ApplicantOperate();

        // new subscriber operate object
        SubscriberOperate subscriberOperate = new SubscriberOperate();

        // new donor operate object
        DonorOperate donorOperate = new DonorOperate();

        // start main menu of animal
        menu.userSubMenu();
        int userInput = checkAnimalInfo.menuItemValidate(1, 6);

        switch (userInput) {
            case 1:
                applicantOperate.applicantLogic();
                break;
            case 2:
                donorOperate.donateLogic();
                break;
            case 3:
                subscriberOperate.emailSubsLogic();
                break;
            case 4:
                return;
            case 5:
                System.exit(0);
        }

    }

}
