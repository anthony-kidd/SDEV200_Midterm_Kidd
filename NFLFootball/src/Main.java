// Author: Anthony Kidd
// Date of Last Revision: 02/14/2024
// Purpose: Create an NFL team roster
import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    private void mainMenu() {
        System.out.println("Menu:\n\t1: Add Player"
                + "\n\t2: Print list of players"
                + "\n\t3: Number of players"
                + "\n\t4: EXIT");
    }

    public static void main(String[] args) {
        Main main = new Main();
        ArrayList<Player> team = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        int option = 0;
        do {
            option = 0;
            main.mainMenu();
            try {
                option = in.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("ERROR: Please enter the number for one of the listed options");
                in.next(); // Consume invalid input
                continue;
            }

            switch (option) {
                case 1: {
                    main.addPlayer(team);
                    break;
                }

                case 2: {
                    System.out.println("You selected: Print list of players");
                    break;
                }

                case 3: {
                    System.out.println("You selected: Number of players");
                    break;
                }

                case 4: {
                    System.out.println("End of program.");
                    System.exit(0); // exit with success status
                    break;
                }
            }
        } while (option != 4);
        in.close();
    }

    private void addPlayer(ArrayList<Player> team) {
        int playerType = 0;
        Scanner scanner = new Scanner(System.in);
        try {
            do {
                System.out.println("Please choose from the following positions: \n\n\t"
                        + "Offense:\n\t"
                        + "1: Quarterback\n\t"
                        + "2: Wide Receiver\n\t"
                        + "3: Tight End\n\t"
                        + "4: Running Back\n\t"
                        + "5: Offensive Lineman\n\n"
                        + "Defense:\n\t"
                        + "6: Defensive Lineman\n\t"
                        + "7: Linebacker\n\t"
                        + "8: Defensive Back\n\t"
                        + "9: Safety\n\n"
                        + "Special Teams:\n\t"
                        + "10: Kicker\n\t"
                        + "11: Punter\n\n"
                        + "12: Main Menu\n");

                if (scanner.hasNextInt()) {
                    playerType = scanner.nextInt();
                    scanner.nextLine();  // Consume newline
                    if (playerType == 12) {
                        System.out.println("Returning to main menu...");
                        break;
                    }
                    if (playerType < 1 || playerType > 12) {
                        System.out.println("ERROR: your choice is not in range");
                        continue; // Skip to the next iteration of the loop
                    }

                    System.out.print("Enter the player's name: ");
                    String name = scanner.nextLine();

                    System.out.print("Enter the player's number: ");
                    int playerId = scanner.nextInt();

                    Player player = null;

                    switch (playerType) {
                        case 1: {
                            player = new Quarterback(name, playerId);
                            break;
                        }
                        case 2: {
                            player = new WideReceiver(name, playerId);
                            break;
                        }
                        case 3: {
                            player = new TightEnd(name, playerId);
                            break;
                        }
                        case 4: {
                            player = new RunningBack(name, playerId);
                            break;
                        }
                        case 5: {
                            player = new OffensiveLineman(name, playerId);
                            break;
                        }
                        case 6: {
                            player = new DefensiveLineman(name, playerId);
                            break;
                        }
                        case 7: {
                            player = new Linebacker(name, playerId);
                            break;
                        }
                        case 8: {
                            player = new DefensiveBack(name, playerId);
                            break;
                        }
                        case 9: {
                            player = new Safety(name, playerId);
                            break;
                        }
                        case 10: {
                            player = new Kicker(name, playerId);
                            break;
                        }
                        case 11: {
                            player = new Punter(name, playerId);
                            break;
                        }
                        case 12: {
                            break;
                        }
                        default: {
                            System.out.println("ERROR:Invalid player type.");
                        }
                    }

                    if (player != null) {
                        team.add(player);
                        System.out.println("The player has been added to the team.");
                    }
                } else {
                    System.out.println("ERROR: Invalid input. Please enter a number.");
                    scanner.next(); // Consume invalid input
                }
            } while (playerType != 12);
        } catch (NoSuchElementException e) {
            System.out.println("ERROR: Scanner input not available.");
        } finally {
            scanner.close(); // Close scanner when done using
        }
    }
}
