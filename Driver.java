import java.util.ArrayList;
import java.util.Scanner;

public class Driver {
    private static ArrayList<Dog> dogList = new ArrayList<Dog>();
    private static ArrayList<Monkey> monkeyList = new ArrayList<Monkey>();
    // Instance variables (if needed)

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String choice = "";

        // Preload animals for testing
        initializeDogList();
        initializeMonkeyList();

        // Add a loop that displays the menu, accepts the users input
        // and takes the appropriate action.
        while (!choice.equalsIgnoreCase("q")) {
            displayMenu();
            choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    intakeNewDog(scanner);
                    break;
                case "2":
                    intakeNewMonkey(scanner);
                    break;
                case "3":
                    reserveAnimal(scanner);
                    break;
                case "4":
                    printAnimals("dog");
                    break;
                case "5":
                    printAnimals("monkey");
                    break;
                case "6":
                    printAnimals("available");
                    break;
                case "q":
                case "Q":
                    System.out.println("Exiting application...");
                    break;
                default:
                    System.out.println("Invalid selection. Please try again.");
            }
        }
        scanner.close();
    }

    

    // This method prints the menu options
    public static void displayMenu() {
        System.out.println("\n\n");
        System.out.println("\t\t\t\tRescue Animal System Menu");
        System.out.println("[1] Intake a new dog");
        System.out.println("[2] Intake a new monkey");
        System.out.println("[3] Reserve an animal");
        System.out.println("[4] Print a list of all dogs");
        System.out.println("[5] Print a list of all monkeys");
        System.out.println("[6] Print a list of all animals that are not reserved");
        System.out.println("[q] Quit application");
        System.out.println();
        System.out.println("Enter a menu selection");
    }


    // Adds dogs to a list for testing
    public static void initializeDogList() {
        Dog dog1 = new Dog("Spot", "German Shepherd", "male", "1", "25.6", "05-12-2019", "United States", "intake", false, "United States");
        Dog dog2 = new Dog("Rex", "Great Dane", "male", "3", "35.2", "02-03-2020", "United States", "Phase I", false, "United States");
        Dog dog3 = new Dog("Bella", "Chihuahua", "female", "4", "25.6", "12-12-2019", "Canada", "in service", true, "Canada");

        dogList.add(dog1);
        dogList.add(dog2);
        dogList.add(dog3);
    }


    // Adds monkeys to a list for testing
    public static void initializeMonkeyList() {
        Monkey monkey1 = new Monkey("George", "male", "5", "30.2", "03-15-2020", "Brazil", "in service", false, "Brazil", "Capuchin", 12.0, 18.0, 20.0);
        Monkey monkey2 = new Monkey("Lola", "female", "3", "22.5", "07-10-2021", "Peru", "Phase I", false, "Peru", "Squirrel Monkey", 0.4, 0.5, 0.6);

        monkeyList.add(monkey1);
        monkeyList.add(monkey2);
    }


    // Complete the intakeNewDog method
    public static void intakeNewDog(Scanner scanner) {
        System.out.println("What is the dog's name?");
        String name = scanner.nextLine();

        // Check if the dog already exists in the list
        for(Dog dog: dogList) {
            if(dog.getName().equalsIgnoreCase(name)) {
                System.out.println("\n\nThis dog is already in our system\n\n");
                return; //returns to menu
            }
        }

        // Prompt for additional dog details
        System.out.println("What is the dog's breed?");
        String breed = scanner.nextLine();

        System.out.println("What is the dog's gender?");
        String gender = scanner.nextLine();

        System.out.println("What is the dog's age?");
        String age = scanner.nextLine();

        System.out.println("What is the dog's weight?");
        String weight = scanner.nextLine();

        System.out.println("What is the dog's acquisition date?");
        String acquisitionDate = scanner.nextLine();

        System.out.println("What is the dog's acquisition country?");
        String acquisitionCountry = scanner.nextLine();

        System.out.println("What is the dog's training status?");
        String trainingStatus = scanner.nextLine();

        System.out.println("In service country?");
        String inServiceCountry = scanner.nextLine();

    // Create a new Dog object and add it to the dogList
        Dog newDog = new Dog(name, breed, gender, age, weight, acquisitionDate, acquisitionCountry, trainingStatus, false, inServiceCountry);
        dogList.add(newDog);
        System.out.println("Dog " + name + " has been added to the system.");
    }

    // Complete intakeNewMonkey
    public static void intakeNewMonkey(Scanner scanner) {
        System.out.println("What is the monkey's name?");
        String name = scanner.nextLine();

        // Check if the monkey already exists in the list
        for(Monkey monkey: monkeyList) {
            if(monkey.getName().equalsIgnoreCase(name)) {
                System.out.println("\n\nThis monkey is already in our system\n\n");
                return; //returns to menu
            }
        }

        // Prompt for additional monkey details
        System.out.println("What is the monkey's species?");
        String species = scanner.nextLine();

        if (!(species.equalsIgnoreCase("Capuchin") ||
            species.equalsIgnoreCase("Guenon") ||
            species.equalsIgnoreCase("Macaque") ||
            species.equalsIgnoreCase("Marmoset") ||
            species.equalsIgnoreCase("Squirrel Monkey") ||
            species.equalsIgnoreCase("Tamarin"))) {
            System.out.println("Invalid species type. Please enter a valid species.");
            return; // returns to menu
        }
	// Prompt for additional monkey details
        System.out.println("What is the monkey's gender?");
        String gender = scanner.nextLine();

        System.out.println("What is the monkey's age?");
        String age = scanner.nextLine();

        System.out.println("What is the monkey's weight?");
        String weight = scanner.nextLine();

        System.out.println("What is the monkey's acquisition date?");
        String acquisitionDate = scanner.nextLine();

        System.out.println("What is the monkey's acquisition country?");
        String acquisitionCountry = scanner.nextLine();

        System.out.println("What is the monkey's training status?");
        String trainingStatus = scanner.nextLine();

        System.out.println("In service country?");
        String inServiceCountry = scanner.nextLine();

        System.out.println("What is the monkey's tail length?");
        double tailLength = Double.parseDouble(scanner.nextLine());

        System.out.println("What is the monkey's height?");
        double height = Double.parseDouble(scanner.nextLine());

        System.out.println("What is the monkey's body length?");
        double bodyLength = Double.parseDouble(scanner.nextLine());

        // Create a new Monkey object and add it to the monkeyList
        Monkey newMonkey = new Monkey(name, gender, age, weight, acquisitionDate, acquisitionCountry, trainingStatus, false, inServiceCountry, species, tailLength, height, bodyLength);
        monkeyList.add(newMonkey);
        System.out.println("Monkey " + name + " has been added to the system.");
    }

        // Complete reserveAnimal
        // You will need to find the animal by animal type and in service country
        public static void reserveAnimal(Scanner scanner) {
            System.out.println("Enter animal type (dog or monkey): ");
            String type = scanner.nextLine().toLowerCase();

            System.out.println("Enter in service country: ");
            String inServiceCountry = scanner.nextLine();

            if (type.equalsIgnoreCase("dog")) {
                for (Dog dog : dogList) {
                    if (dog.getInServiceCountry().equalsIgnoreCase(inServiceCountry) && !dog.getReserved()) {
                        dog.setReserved(true);
                        System.out.println("Dog " + dog.getName() + " has been reserved.");
                        return;
                    }
                }
                System.out.println("No available dogs found in the specified country.");

            } else if (type.equalsIgnoreCase("monkey")) {
                for (Monkey monkey : monkeyList) {
                    if (monkey.getInServiceCountry().equalsIgnoreCase(inServiceCountry) && !monkey.getReserved()) {
                        monkey.setReserved(true);
                        System.out.println("Monkey " + monkey.getName() + " has been reserved.");
                        return;
                    }
                }
                System.out.println("No available monkeys found in the specified country.");

            } else {
                System.out.println("Invalid animal type. Please enter 'dog' or 'monkey'.");
                return;
            }

            System.out.println("No available " + type + "found in " + inServiceCountry + ".");

        }

        // Complete printAnimals
        public static void printAnimals(String listType) {
            if (listType.equalsIgnoreCase("dog")) {
                System.out.println("\nList of Dogs:");
                for (Dog dog : dogList){
                    System.out.println(dog.getName() + " | " + dog.getTrainingStatus() + " | " + dog.getAcquisitionLocation() + " | Reserved: " + dog.getReserved());
                
                }
            } else if (listType.equalsIgnoreCase("monkey")) {
                System.out.println("\nList of Monkeys:");
                for (Monkey monkey : monkeyList) {
                    System.out.println(monkey.getName() + " | " + monkey.getTrainingStatus() + " | " + monkey.getAcquisitionLocation() + " | Reserved: " + monkey.getReserved());
                }

            } else if (listType.equalsIgnoreCase("available")) {
                System.out.println("\nAvailable animals (in service & not reserved):");
                for (Dog dog : dogList) {
                    if (dog.getTrainingStatus().equalsIgnoreCase("in service") && !dog.getReserved()) {
                        System.out.println("Dog: " + dog.getName() + " | " + dog.getInServiceCountry());
                    }
                }
                for (Monkey monkey : monkeyList) {
                    if (monkey.getTrainingStatus().equalsIgnoreCase("in service") && !monkey.getReserved()) {
                        System.out.println("Monkey: " + monkey.getName() + " | " + monkey.getInServiceCountry());
                    }
                }

            } else {
                System.out.println("Invalid list type.");
            }
        }
}

