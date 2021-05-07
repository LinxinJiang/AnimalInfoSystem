import java.util.Scanner;

/**
 *  Check user input
 */

public class CheckAnimalInfo {

    // check user input (main menu)
    // Number should be between 1 - 6

    public int menuItemValidate(int min, int max) {
        String regex = "[0-9]{1}";

        // create user input
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter the service number (Min: " + min + "/ Max:" + max + "):");
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



    // ID is integer, length 1 - 999
    // can add a part that check if the id is exist
    public int idValidate() {

        String regex = "[1-9]{1}[0-9]{1}[0-9]{1}[0-9]{1}";

        // create user input
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter the animal's ID:");
            String input = scanner.nextLine();
            int inputNum = Integer.parseInt(input);
            if (inputNum >= 1 && inputNum <= 999) {
                return inputNum;
            } else {
                System.out.println("This ID doesn't exist.");

            }

        }
    }





    // species is string
    // User Enter C/c for Cat
    // USer enter D/d for dog
    public String speciesValidate() {

        String regex = "[c|C|d|D]{1}";

        // create user input
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("-------------------------");
            System.out.println("[C/c] for cat");
            System.out.println("[D/d] for dog");
            System.out.println("-------------------------");

            System.out.print("Enter the animal's species:");
            String input = scanner.nextLine();
            // check user input
            if (input.matches(regex)) {
                return input;
            } else {
                System.out.println("Please enter c/C/d/D.");
            }
        }
    }

    // name is string, length 1-10
    public String nameValidate() {
        String regex = "[a-zA-Z]{1,10}";

        // create user input
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter the animal's name:");
            String input = scanner.nextLine();
            // check if user enter a string between 1-10
            if (input.matches(regex)) {
                return input;
            } else {
                System.out.println("Please enter a correct name, name's length should between 1 and 10.");
            }
        }
    }


    // age is integer, length max 2
    public int ageValidate() {

        // create user input
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter the animal's age(month):");
            String input = scanner.nextLine();
            // check if user enter a number between 1-360

            int inputNum = Integer.parseInt(input);
            if (inputNum >= 1 && inputNum <= 360) {
                return inputNum;
            } else {
                System.out.println("You should enter a number between 1 and 360.");

            }
        }
    }

    // gender is string, length 4-6
    public String genderValidate() {
        String regex = "[f|F|m|M]{1}";

        // create user input
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("-------------------------");
            System.out.println("[f/F] for female");
            System.out.println("[m/M] for male");
            System.out.println("-------------------------");
            System.out.print("Enter the animal's gender:");
            String input = scanner.nextLine();
            // check user input
            if (input.matches(regex)) {
                return input;
            } else {
                System.out.println("Please enter f/F/m/M.");
            }
        }
    }

    // weight is double
    public double weightValidate() {
        // final weight
        int inputNum = 0;

        while (true) {

            // create user input
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter the animal's weight(lbs):");
            String input = scanner.nextLine();
            try {
                inputNum = Integer.parseInt(input);
                if (inputNum >= 1 && inputNum <= 30) {
                    return inputNum;

                } else {
                    System.out.println("You should enter a number between 1 and 30.");
                }
            } catch (NumberFormatException e) {
                System.out.println("You should enter a number.");

            }


        }
    }



    // location is string, length 1-10
    public String locationValidate() {
        String regex = "[a-zA-Z]{1,10}";

        // create user input
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter the animal's location:");
            String input = scanner.nextLine();

            if (input.matches(regex)) {
                return input;
            } else {
                System.out.println("Please enter a correct borough's shelter in NYC");
            }
        }
    }

}


    /*
        public static void main(String[] args) {
            CheckAnimalInfo checkAnimalInfo = new CheckAnimalInfo();

            //check menu
            int menu = checkAnimalInfo.menuItemValidate(1,6);
            System.out.println(menu);

            // check species
            String species = checkAnimalInfo.speciesValidate();
            System.out.println(species);

            // check name
            String name = checkAnimalInfo.nameValidate();
            System.out.println(name);


            // check age
            int age = checkAnimalInfo.ageValidate();
            System.out.println(age);

            // check gender
            String gender = checkAnimalInfo.genderValidate();
            System.out.println(gender);

            // check weight
            double weight = checkAnimalInfo.weightValidate();
            System.out.println(weight);


            // check location
            String location = checkAnimalInfo.locationValidate();
            System.out.println(location);

        }
     */
