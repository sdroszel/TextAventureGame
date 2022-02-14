import java.util.Scanner;

public class Main {

    private static boolean key = true;
    private static boolean tv = true;
    private static boolean knife = true;
    private static boolean drawer = true;
    private static boolean hammer = true;
    private static boolean nails = true;
    private static int window = 2;
    private static int x = 41;
    private static String passCode;
    private static String[] room = Room();
    private static int[][] wayOut = WayOut();
    private static String[] directions = Compass();

    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        Intro(); // calls the Intro() method which contains the Game() method
    }

    private static void Intro() { // intro method
        System.out.println("\n" + "Zombie Apocalypse"
                + "\n\n" + "You have pack your essentials." + "\n"
                + "You caught word about a safe room in one of the houses on your street." + "\n\n"
                + "Press ENTER to continue.");
        input.nextLine();

        Game(wayOut, directions); // calls the Game() method
    }

    private static void Game(int[][] wayOut, String[] directions) // game method
    {
        int end = 56;
        while (end != x) {
            switch (x) { // switch statement for the rooms
                case 0:
                    Enter();
                    break;
                case 1:
                    Enter();
                    ZombieWindowAttack();
                    Window();
                    Drawer();
                    break;
                case 2:
                    Enter();
                    TV();
                    break;
                case 3:
                    Enter();
                    break;
                case 4:
                    Enter();
                    Knife();
                    break;
                case 5:
                    Enter();
                    break;
                case 6:
                    Enter();
                    break;
                case 7:
                    Enter();
                    Key();
                    break;
                case 8:
                    Enter();
                    break;
                case 9:
                    Enter();
                    break;
                case 10:
                    EnterBasement();
                    break;
                case 11:
                    Enter();
                    Hammer();
                    break;
                case 12:
                    SafeRoom();
                    break;
                case 13:
                    Enter();
                    break;
                case 14:
                    Enter();
                    ZombieAttack();
                    break;
                case 15:
                    Enter();
                    break;
                case 16:
                    Enter();
                    ZombieWindowAttack();
                    Window();
                    TV();
                    break;
                case 17:
                    Enter();
                    break;
                case 18:
                    Enter();
                    break;
                case 19:
                    Enter();
                    break;
                case 20:
                    Enter();
                    break;
                case 21:
                    Enter();
                    ZombieAttack();
                    break;
                case 22:
                    Enter();
                    break;
                case 23:
                    Enter();
                    break;
                case 24:
                    Enter();
                    break;
                case 25:
                    Enter();
                    Knife();
                    break;
                case 26:
                    Enter();
                    break;
                case 27:
                    Enter();
                    ZombieAttack();
                    break;
                case 28:
                    Enter();
                    break;
                case 29:
                    Enter();
                    break;
                case 30:
                    Enter();
                    break;
                case 31:
                    Enter();
                    break;
                case 32:
                    Enter();
                    Hammer();
                    break;
                case 33:
                    Enter();
                    break;
                case 34:
                    Enter();
                    break;
                case 35:
                    Enter();
                    break;
                case 36:
                    Enter();
                    ZombieAttack();
                    break;
                case 37:
                    Enter();
                    break;
                case 38:
                    Enter();
                    break;
                case 39:
                    Enter();
                    break;
                case 40:
                    Enter();
                    Nails();
                    break;
                case 41:
                    Enter();
                    break;
                case 42:
                    Enter();
                    TV();
                    break;
                case 43:
                    Enter();
                    break;
                case 44:
                    Enter();
                    break;
                case 45:
                    Enter();
                    break;
                case 46:
                    Enter();
                    break;
                case 47:
                    Enter();
                    ZombieAttack();
                    break;
                case 48:
                    Enter();
                    TV();
                    break;
                case 49:
                    Enter();
                    break;
                case 50:
                    Enter();
                    Knife();
                    break;
                case 51:
                    Enter();
                    break;
                case 52:
                    Enter();
                    break;
                case 53:
                    Enter();
                    break;
                case 54:
                    Enter();
                    Nails();
                    break;
                case 55:
                    Enter();
                    break;
            }
            x = Directions(wayOut[x], directions, x, input);
        }
    }

    private static int Directions(int[] ints, String[] directions, int x, Scanner input) { // display and set directions
        System.out.print("These are the directions you can go: ");
        for (int y = 0; y < 6; y++) {
            if (ints[y] > -1)
                System.out.print(directions[y] + "  ");
        }

        System.out.println("\n" + "What direction do you want to go?");
        String choice = input.nextLine();
        for (int y = 0; y < 6; y++) {
            if (choice.equalsIgnoreCase(directions[y])) {
                int temp = ints[y];
                if (temp != -1)
                    x = temp;
            }
        }
        return x;
    }

    private static int[][] WayOut() { // multidimensional array of ways out of rooms
        return new int[][]{{13, 4, 2, 1, 6, -1},      // room 0
                {-1, 3, 0, -1, -1, 10},           // room 1
                {-1, 5, -1, 0, -1, -1},           // room 2
                {1, -1, 4, -1, -1, -1},           // room 3
                {0, -1, 5, 3, -1, -1},            // room 4
                {2, -1, -1, 4, -1, -1},           // room 5
                {9, -1, 8, 7, -1, 0},             // room 6
                {-1, -1, 6, -1, -1, -1},          // room 7
                {-1, -1, -1, 6, -1, -1},          // room 8
                {-1, 6, -1, -1, -1, -1},          // room 9
                {11, -1, -1, -1, 1, -1},          // room 10
                {-1, 10, 12, -1, -1, -1},         // room 11
                {-1, -1, -1, 11, -1, -1},         // room 12

                {14, 0, 20, -1, -1, -1},         // room 13

                {18, 13, 16, 15, -1, -1},          // room 14
                {17, -1, 14, -1, -1, -1},          // room 15
                {19, -1, -1, 14, -1, -1},          // room 16
                {-1, 15, 18, -1, -1, -1},          // room 17
                {-1, 14, 19, 17, -1, -1},         // room 18
                {-1, 16, 18, -1, -1, -1},         // room 19

                {21, 33, 39, 13, -1, -1},         // room 20

                {25, 20, 23, 22, 27, -1},         // room 21
                {24, -1, 21, -1, -1, -1},         // room 22
                {26, -1, -1, 21, -1, 31},         // room 23
                {-1, 22, 25, -1, -1, -1},         // room 24
                {-1, 21, 26, 24, -1, -1},         // room 25
                {-1, 23, 25, -1, -1, -1},         // room 26
                {-1, 30, 29, 28, -1, 21},         // room 27
                {-1, -1, 27, -1, -1, -1},         // room 28
                {-1, -1, -1, 27, -1, -1},         // room 29
                {27, -1, -1, -1, -1, -1},         // room 30
                {-1, 32, -1, -1, 21, -1},         // room 31
                {31, -1, -1, -1, -1, -1},         // room 32

                {20, 37, 35, 34, -1, -1},         // room 33
                {-1, 36, 33, -1, -1, -1},         // room 34
                {-1, 38, -1, 33, -1, -1},         // room 35
                {34, -1, 37, -1, -1, -1},         // room 36
                {33, -1, 38, 36, -1, -1},         // room 37
                {35, -1, -1, 37, -1, -1},         // room 38

                {40, 46, -1, 20, -1, -1},         // room 39

                {44, 39, 42, 41, -1, -1},         // room 40
                {43, -1, 40, -1, -1, -1},         // room 41
                {45, -1, -1, 40, -1, -1},         // room 42
                {-1, 41, 44, -1, -1, -1},         // room 43
                {-1, 40, 45, 43, -1, -1},         // room 44
                {-1, 42, -1, 44, -1, -1},         // room 45

                {39, 50, 48, 47, 52, -1},         // room 46
                {-1, 49, 46, -1, -1, -1},         // room 47
                {-1, 51, -1, 46, -1, -1},         // room 48
                {47, -1, 50, -1, -1, -1},         // room 49
                {46, -1, 51, 49, -1, -1},         // room 50
                {48, -1, -1, 50, -1, -1},         // room 51
                {55, -1, 53, 54, -1, 46},         // room 52
                {-1, -1, -1, 52, -1, -1},         // room 53
                {-1, -1, 52, -1, -1, -1},         // room 54
                {-1, 52, -1, -1, -1, -1}};         // room 55
    }

    private static String[] Compass() { // array of directions
        return new String[]{"NORTH", // 0
                "SOUTH",         // 1
                "EAST",          // 2
                "WEST",          // 3
                "UP",            // 4
                "DOWN"};         // 5
    }

    private static String[] Room() {  // array of room names
        return new String[]{"Foyer",  // room 0
                "Den",                // room 1
                "Living Room",        // room 2
                "Dining Room",        // room 3
                "Kitchen",            // room 4
                "Bathroom",           // room 5
                "Hallway",            // room 6
                "Master Bedroom",     // room 7
                "Home Office",        // room 8
                "Bathroom",           // room 9
                "Basement",           // room 10
                "Utility Room",       // room 11
                "Safe Room",          // room 12
                "Street",             // room 13
                "Foyer",              // room 14
                "Bedroom",            // room 15
                "Living Room",        // room 16
                "Bathroom",           // room 17
                "Kitchen",            // room 18
                "Dining Room",        // room 19
                "Street",             // room 20
                "Foyer",              // room 21
                "Living Room",        // room 22
                "Sun Room",           // room 23
                "Bathroom",           // room 24
                "Kitchen",            // room 25
                "Dining Room",        // room 26
                "Hallway",            // room 27
                "Master Bedroom",     // room 28
                "Guest Bedroom",      // room 29
                "Bathroom",           // room 30
                "Basement",           // room 31
                "Utility Room",       // room 32
                "Foyer",              // room 33
                "Living Room",        // room 34
                "Bedroom",            // room 35
                "Dining Room",        // room 36
                "Kitchen",            // room 37
                "Bathroom",           // room 38
                "Street",             // room 39
                "Foyer",              // room 40
                "Bedroom",            // room 41
                "Living Room",        // room 42
                "Bathroom",           // room 43
                "Kitchen",            // room 44
                "Dining Room",        // room 45
                "Foyer",              // room 46
                "Study",              // room 47
                "Living Room",        // room 48
                "Dining Room",        // room 49
                "Kitchen",            // room 50
                "Bathroom",           // room 51
                "Hallway",            // room 52
                "Master Bedroom",     // room 53
                "Guest Bedroom",      // room 54
                "Bathroom"};          // room 55
    }

    private static void RestartQuit(Scanner input) // restart or quit game
    {
        System.out.println("\n" + "1. Restart" + "\n" + "2. Quit" + "\n\n" + "Choose you selection and press ENTER.");
        String choice = input.nextLine();
        if (choice.equals("1")) {
            // Resets variables for restart
            key = true;
            tv = true;
            knife = true;
            drawer = true;
            hammer = true;
            nails = true;
            window = 2;
            x = 41;
            Intro();
        } else if (choice.equals("2"))
            System.exit(0);
    }

    private static void EnterBasement() {
        if (key) {
            System.out.println("The door is locked. There must be a key somewhere.");
            x = 1;
        } else System.out.println("You walk down the stairs to the " + room[x]);
    }

    private static void SafeRoom() {
        System.out.println("You have reached the " + room[x] + "\n"
                + "You must enter the pass code correctly to enter.");
        String code = input.nextLine();
        if (code.equals(passCode)) {
            System.out.println("Good job, you have reached the " + room[x] + " unharmed." +
                    "\n" + "Now you can rest.");
            RestartQuit(input);
        } else {
            System.out.println("You have entered the incorrect password.");
            x = 11;
        }
    }

    private static void ZombieWindowAttack() {
        if (window == 0) {
            System.out.println("A zombie enters through the window!");
            if (!knife) {
                System.out.println("Enter a COMMAND or press ENTER to continue.");
                String choice = input.nextLine();
                if (choice.equalsIgnoreCase("use knife") ||
                        choice.equalsIgnoreCase("kill zombie")) {
                    System.out.println("You kill the zombie with a knife and do a quick fix on the window.");
                    window = 1;
                } else {
                    System.out.println("The zombie corners you as everything goes dark." + "\n" +
                            "\n\nYou did not make it.");
                    RestartQuit(input);
                }
            } else {
                System.out.println("You have nothing to defend yourself. \n" +
                        "The zombie corners you as everything goes dark. " +
                        "\n\nYou did not make it.");
                RestartQuit(input);
            }
        }
    }

    private static void ZombieAttack() {
        System.out.println("A zombie jumps out as you enter the room");
        if (!knife) {
            System.out.println("Enter a COMMAND or press ENTER to continue.");
            String choice = input.nextLine();
            if (choice.equalsIgnoreCase("use knife") ||
                    choice.equalsIgnoreCase("kill zombie")) {
                System.out.println("You kill the zombie with a knife.");
            } else {
                System.out.println("The zombie corners you as everything goes dark." + "\n" +
                        "\n\nYou did not make it.");
                RestartQuit(input);
            }
        } else {
            System.out.println("You have nothing to defend yourself. \n" +
                    "The zombie corners you as everything goes dark. " +
                    "\n\nYou did not make it.");
            RestartQuit(input);
        }
    }

    private static void Window() {
        if (window == 2) {
            System.out.println("The windows are boarded up, " +
                    "but it looks like the zombies are trying to break through.");
            System.out.println("Enter a COMMAND or press ENTER to continue.");
            String choice = input.nextLine();
            if (!hammer && !nails) {
                if (choice.equalsIgnoreCase("repair window") ||
                        choice.equalsIgnoreCase("fix window")) {
                    window = 2;
                    System.out.println("You repair the windows." + "\nPress ENTER to continue.");
                } else {
                    System.out.println("You left the window as is." + "\nEnter a COMMAND or press ENTER to continue.");
                    window = 1;
                }
            } else {
                System.out.println("You do not have the proper tools to repair the window." + "\nPress ENTER to continue.");
                window = 1;
            }
        } else if (window == 1) {
            System.out.println("The windows are badly damaged, " +
                    "if you don't repair them then zombies might get it.");
            System.out.println("Enter a COMMAND or press ENTER to continue.");
            String choice = input.nextLine();
            if (!hammer && !nails) {
                if (choice.equalsIgnoreCase("repair window") ||
                        choice.equalsIgnoreCase("fix window")) {
                    window = 2;
                    System.out.println("You repair the windows.");
                } else {
                    System.out.println("You left the window as is." + "\nEnter a COMMAND or press ENTER to continue.");
                    window = 0;
                }
            } else {
                System.out.println("You do not have the proper tools to repair the window." + "\nPress ENTER to continue.");
                window = 0;
            }
        }
    }

    private static void Drawer() {
        String userInput = input.nextLine();
        if (userInput.equalsIgnoreCase("examine room") ||
                userInput.equalsIgnoreCase("check room")) {
            if (drawer) {
                System.out.println("You notice the desk drawer is cracked OPEN." + "\n"
                        + "\nEnter a command or press ENTER to continue.");
                String open = input.nextLine();
                if (open.equalsIgnoreCase("open drawer") ||
                        open.equalsIgnoreCase("open desk drawer")) {
                    drawer = false;
                    System.out.println("You open the draw and find a NOTE." + "\n"
                            + "\nEnter a command or press ENTER to continue.");
                    String take = input.nextLine();
                    if (take.equalsIgnoreCase("take note") ||
                            take.equalsIgnoreCase("grab note") ||
                            take.equalsIgnoreCase("pick up note"))
                        GeneratePasscode();
                    System.out.println("You take the NOTE. There are numbers written on it."
                            + "\n\n" + passCode + "\n");
                }
            }
        }
    }

    private static void GeneratePasscode() {
        int passcode = (int) (Math.random() * 9000) + 1000;
        passCode = String.valueOf(passcode);
    }

    private static void Enter() {
        System.out.println("You enter the " + room[x] + "\n");
    }

    private static void TV() {
        System.out.println("Enter a COMMAND or press ENTER to continue.");
        String choice = input.nextLine();
        if (choice.equalsIgnoreCase("examine room") ||
                choice.equalsIgnoreCase("check room")) {
            if (tv) {
                System.out.println("The TV is on." + "\n" + "If you don't turn it off you might attract zombies.");
                System.out.println("Enter a COMMAND or press ENTER to continue.");
                String turnOff = input.nextLine();
                if (turnOff.equalsIgnoreCase("turn off tv") ||
                        turnOff.equalsIgnoreCase("break tv") ||
                        turnOff.equalsIgnoreCase("unplug tv")) {
                    tv = false;
                    System.out.println("You turned off the TV.");
                }
            }
        }
    }

    private static void Knife() {
        System.out.println("Enter a COMMAND or press ENTER to continue.");
        String userInput = input.nextLine();
        if (userInput.equalsIgnoreCase("examine room") ||
                userInput.equalsIgnoreCase("check room")) {
            if (knife) {
                System.out.println("There is a KNIFE on the counter top" + "\n"
                        + "Enter a command or press Enter to Continue.");
                String take = input.nextLine();
                if (take.equalsIgnoreCase("take knife") ||
                        take.equalsIgnoreCase("grab knife") ||
                        take.equalsIgnoreCase("pick up knife")) {
                    knife = false;
                    System.out.println("You grab the knife." + "\n");
                }
            }
        }
    }

    private static void Key() {
        System.out.println("Enter a COMMAND or press ENTER to continue.");
        String userInput = input.nextLine();
        if (userInput.equalsIgnoreCase("examine room") ||
                userInput.equalsIgnoreCase("check room")) {
            if (key) {
                System.out.println("You notice a KEY sitting on the table." + "\n"
                        + "\nEnter a command or press ENTER to continue.");
                String take = input.nextLine();
                if (take.equalsIgnoreCase("take key") ||
                        take.equalsIgnoreCase("grab key") ||
                        take.equalsIgnoreCase("pick up key")) {
                    key = false;
                    System.out.println("You put the KEY in your pocket." + "\n");
                }
            }
        }
    }

    private static void Hammer() {
        System.out.println("Enter a COMMAND or press ENTER to continue.");
        String userInput = input.nextLine();
        if (userInput.equalsIgnoreCase("examine room") ||
                userInput.equalsIgnoreCase("check room")) {
            if (hammer) {
                System.out.println("You notice a HAMMER on the shelf." + "\n" +
                        "\nEnter a COMMAND or press ENTER to continue.");
                String take = input.nextLine();
                if (take.equalsIgnoreCase("take hammer") ||
                        take.equalsIgnoreCase("grab hammer") ||
                        take.equalsIgnoreCase("pick up hammer")) {
                    hammer = false;
                    System.out.println("You take the hammer.");
                }
            }
        }
    }

    private static void Nails() {
        System.out.println("Enter a COMMAND or press ENTER to continue.");
        String userInput = input.nextLine();
        if (userInput.equalsIgnoreCase("examine room") ||
                userInput.equalsIgnoreCase("check room")) {
            if (nails) {
                System.out.println("You see some NAILS on the floor." + "\n" +
                        "\nEnter a COMMAND or press ENTER to continue.");
                String take = input.nextLine();
                if (take.equalsIgnoreCase("take nails") ||
                        take.equalsIgnoreCase("grab nails") ||
                        take.equalsIgnoreCase("pick up nails")) {
                    nails = false;
                    System.out.println("You pick up the nails.");
                }
            }
        }
    }
}