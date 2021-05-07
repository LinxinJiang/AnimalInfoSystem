import java.util.ArrayList;


public class SubscriberOperate {

    private ArrayList<EmailSubscriber> subscribersList = new ArrayList<>();

    public void emailSubsLogic(){
        // New a Menu object: show the add Animal menu
        Menu menu = new Menu();
        // New a CheckAnimalInfo object: check user input
        CheckAnimalInfo checkAnimalInfo = new CheckAnimalInfo();


        while(true){
            menu.subscriberMenu();

            // check user input: menu
            int userInputMenu = checkAnimalInfo.menuItemValidate(1,3);

            switch (userInputMenu){
                case 1:
                    // Add Adoption applications
                    addSubscriber();
                    break;
                case 2:
                    // show all the info
                    showSubscriber();
                    break;
                case 3:
                    // return back to last section: using 'return' to break
                    return;
            }
        }
    }


    private void addSubscriber() {
        // new checkAnimalInfo Object to check user input
        CheckUserInfo checkUserInfo = new CheckUserInfo();

        String name = checkUserInfo.nameValidate();
        String email = checkUserInfo.emailValidate();
        String catOrDog = checkUserInfo.catOrDogValidate();

        EmailSubscriber subscriber = new EmailSubscriber(name,email,catOrDog);

        this.subscribersList.add(subscriber);
    }


    public void showSubscriber(){
        if(this.subscribersList.size() == 0){
            System.out.println("Enter a subscriber information first.");
            return;
        }

        for(int i = 0; i < this.subscribersList.size(); i++){
            System.out.println(this.subscribersList.get(i));
        }

    }
}
