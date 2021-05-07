import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class CheckUserInfo {

    public int menuItemValidate(int min, int max) {
        String regex = "[0-9]{1}";

        // create user input
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter the service number (Min: " + min + "/ Max:" + max + "): ");
            String input = scanner.nextLine();
            // check if user enter a number between 1-9
            if (input.matches(regex)) {
                int inputNum = Integer.parseInt(input);
                if (inputNum >= min && inputNum <= max) {
                    return inputNum;
                } else {
                    System.out.println("You should enter a number between " + min + " and " + max + " .");

                }
            } else {
                System.out.println("Please enter a number.");
            }
        }

    }

    // name is string, length 1-10
    public String nameValidate() {
        String regex = "[a-zA-Z]{1,10}";

        // create user input
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter the name: ");
            String input = scanner.nextLine();
            // check if user enter a string between 1-10
            if (input.matches(regex)) {
                return input;
            } else {
                System.out.println("Please enter a correct name, name's length should between 1 and 10.");
            }
        }

    }


    public String emailValidate() {

        // create user input
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter email: ");
            String email = scanner.nextLine();
            // check if user enter a string contains @
            if (email.contains("@")) {
                return email;
            } else {
                System.out.println("Please check your email. Email should contains '@'");
            }
        }
    }


    public String phoneNumberValidate() {
        String regex = "[0-9]{10}";

        // create user input
        Scanner scanner = new Scanner(System.in);

        while (true){
            // ask for input
            System.out.print("Enter phone number: ");
            String pNumber = scanner.nextLine();

            if(pNumber.matches(regex)){
                return pNumber;
            }else{
                System.out.println("Please check your phone number. Length should be 10.");
            }

        }

    }

    public String animalValidate(ArrayList animalsList){
        // create user input
        Scanner scanner = new Scanner(System.in);

        Operate operate = new Operate();

        ArrayList animalList = operate.getAnimalsList();

        while (true){
            // ask for input
            System.out.print("Enter the animal's ID that the user is applying (Use & for two or more): ");
            String idString = scanner.nextLine();


            if(idString != null){
                return idString;
            }else{
                System.out.println("Please check animal ID.");
            }

        }
    }



    public double donateAmountValidate() {

        int inputNum = 0;
        while (true) {
            // create user input
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter donate amount: ");
            String input = scanner.nextLine();
            try {
                inputNum = Integer.parseInt(input);
                if (inputNum >= 1 && inputNum <= 999) {
                    return inputNum;

                } else {
                    System.out.println("You should enter a number between 1 and 999.");
                }
            } catch (NumberFormatException e) {
                System.out.println("You should enter a number.");

            }


        }
    }


    public String catOrDogValidate() {
        String regex = "[c|C|D|d|B|b]{1}";

        // create user input
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("-------------------------");
            System.out.println("[c/C] for female");
            System.out.println("[d/D] for male");
            System.out.println("[b/B] for male");
            System.out.println("-------------------------");
            System.out.print("Enter subscriber's preferences: ");
            String input = scanner.nextLine();
            // check user input
            if (input.matches(regex)) {
                return input;
            } else {
                System.out.println("Please enter c/C/d/D/b/B.");
            }
        }
    }


}


