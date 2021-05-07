public class DonorOperate {

    DonorStack donorStack = new DonorStack();

    public void donateLogic(){
        // New a Menu object: show the add Animal menu
        Menu menu = new Menu();
        // New a CheckAnimalInfo object: check user input
        CheckAnimalInfo checkAnimalInfo = new CheckAnimalInfo();

        while(true){
            menu.donorMenu();

            // check user input: menu
            int userInputMenu = checkAnimalInfo.menuItemValidate(1,3);

            switch (userInputMenu){
                case 1:
                    // Add Adoption applications
                    addDonor();
                    break;
                case 2:
                    // show all the info
                    showAllDonor();
                    break;
                case 3:
                    // return back to last section: using 'return' to break
                    return;
            }
        }
    }

    public void addDonor(){
        // new checkAnimalInfo Object to check user input
        CheckUserInfo checkUserInfo = new CheckUserInfo();
        String name = checkUserInfo.nameValidate();
        String phone = checkUserInfo.phoneNumberValidate();
        double amount = checkUserInfo.donateAmountValidate();

        Donor donor = new Donor(name,phone,amount);

        // add donor into the list
        donorStack.push(donor);

        System.out.println("Adding donor successfully.");
    }

    public void showAllDonor(){
        System.out.println(donorStack.toString());
    }


}
