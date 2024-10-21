import java.util.Calendar;
import java.util.Random;
import java.io.File;
import java.util.Scanner;

public class Main {
    static void printcamel(String filepath) {
        File file = new File(filepath);
        try {
            Scanner fr = new Scanner(file);
            while (fr.hasNextLine()) {
                String i = fr.nextLine();
                System.out.println(i);
            }
        } catch (Exception e) {
            System.out.println("No file");
        }
        System.out.println("You've reached the end of the program. To check another habitat, please restart the watcher.");
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String promptingmessage = String.format("Please enter the number of the habitat you would like to view:\n" +
                "1 - Hippo\n" +
                "2 - Dog\n" +
                "3 - Triceratops\n" +
                "4 - Rhinoceros");
        System.out.println(promptingmessage);
        int habitat_num = input.nextInt();
        String animal = "";
        switch (habitat_num) {
            case 1:
                System.out.println("Switching on the camera in the hippo habitat... ");
                printcamel("src/hippo.txt");
                animal = "Hippo";
                break;
            case 2:
                System.out.println("Switching on the camera in the dog habitat... ");
                printcamel("src/dog.txt");
                animal = "Dog";
                break;
            case 3:
                System.out.println("Switching on the camera in the triceratops habitat... ");
                printcamel("src/triceratops.txt");
                animal = "Triceratops";
                break;
            case 4:
                System.out.println("Switching on the camera in the rhinoceros habitat... ");
                printcamel("src/rhinoceros.txt");
                animal = "Rhinoceros";
                break;
            default:
                System.out.println("That camera does not exist. ");
        }
                Calendar c = Calendar.getInstance();
                int timeHour = c.get(Calendar.HOUR_OF_DAY);
                int timeMinute = c.get(Calendar.MINUTE);
                Random rand = new Random();
                double habitatTemperature = rand.nextFloat(50, 100);

                String zookeeperMessage = String.format(
                        "Animal type: %s" +
                                "\nCurrent time: %d:%dPM" +
                                "\nHabitat temperature: %.2f", animal, timeHour, timeMinute, habitatTemperature
                );
                System.out.println(zookeeperMessage);
            }
        }