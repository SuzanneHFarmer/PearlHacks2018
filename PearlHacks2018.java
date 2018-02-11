package pearlhacks2018;
//edit branch
/** 
 * @Course: PearlHacks2018
 * @Author Name: SHF
 * @Assignment Name: NCNatureNetwork Snake ID Guide
 * @Date: Feb 10, 2018
 * @Description: code for Android app NC Snake ID Guide WIP
 * @Credits: all info taken from http://herpsofnc.org/snakes/
 * @ToDo: complete regional species lists; add to GUI in Android Studio; integrate
 *        Google Maps API for zipcode/location selection; add sighting log function 
 *        for users to track snake population distribution/changes via open source 
 */
//Imports

import java.util.Scanner;

//Begin Class PearlHacks2018
public class PearlHacks2018 {

    //Begin Main Method
    public static void main(String[] args) {
        
        //Loop to rerun program
        boolean rerun = true;
        while(rerun) {
        
        //New scanner object
        Scanner sc = new Scanner(System.in);
        
        //Starting menu - only option 1 written as of 2/10/18
        System.out.println("Please enter the number of a North Carolina region:");
        System.out.println("1. Mountains");
        System.out.println("2. Piedmont");
        System.out.println("3. Inner Coastal Plain");
        System.out.println("4. Tidewater");
        System.out.println("Or enter 5 to exit the program");
        
        int choice = sc.nextInt();
        
        switch (choice) {
            case 1:
                System.out.print("Here are some snakes commonly" + "\n"
                    + "found in your region." + "\n" + "Enter the species" + "\n"
                    + "number for more information." + "\n" + "Asterisks" + "\n" + 
                    "indicate that the species is venemous - DO NOT HANDLE." + "\n");
                System.out.println("1. Worm Snake");
                System.out.println("2. Eastern Milksnake");
                System.out.println("3. Red-bellied Snake");
                System.out.println("4. Racer Snake");
                System.out.println("5. Ring-necked Snake");
                System.out.println("6. Eastern Garter Snake");
                System.out.println("7. Corn Snake");
                System.out.println("8. Northern Watersnake");
                System.out.println("9. Rat Snake");
                System.out.println("10. ***Copperhead***");
                System.out.println("11. ***Timber Rattlesnake***");
                //missing 8 species found in mountain region
                
                int mtnSpecies = sc.nextInt();
                
                switch (mtnSpecies) {
                    case 1:
                        System.out.print("Worm Snakes are harmless," + "\n" + 
                            "primarily nocturnal, and feed mostly on earthworms,"
                            + "\n" + "slugs, and soft insect larvae." + "\n");
                        System.out.println("Size:");
                        System.out.println("9\"-13\"");
                        System.out.println("Coloration: ");
                        System.out.println("Back: brown, gray, black; shiny");
                        System.out.print("Belly: pink, whitish; extends" + "\n"
                            + "partly up sides" + "\n");
                        System.out.println("Behavior:");
                        System.out.print("Active from early spring to" + "\n"
                            + "late fall; mostly remain underground; rarely bite."
                            + "\n");
                        System.out.println("Preferred habitat:");
                        System.out.print("Rotting logs; cool, moist" + "\n" +
                            "hardwood forests; rocky, wooded hillsides" + "\n");
                       break;
                       
                    case 2:
                        System.out.print("Eastern milksnakes are harmless" + "\n" + 
                            "constrictors that feed on lizards, mice, and"
                            + "\n" + "small snakes." + "\n");
                        System.out.println("Size:");
                        System.out.println("2.25\'-4.25\'");
                        System.out.println("Coloration: ");
                        System.out.print("Back: usually gray or brown with dark "
                            + "brown" + "\n" + "or reddish blotches" + "\n");
                        System.out.println("Belly: white with black patches");
                        System.out.println("Behavior:");
                        System.out.print("Can interbreed with scarlet kingsnakes,"
                            + "\n" + "resulting in numerous different color patterns"
                            + "\n");
                        System.out.println("Preferred habitat:");
                        System.out.print("Wooded slopes and grassy fields;" + "\n"
                            + "commonly found under large rocks" + "\n");
                       break;
                       
                    case 3:
                        System.out.print("Red-bellied snakes are harmless" + "\n" + 
                            "and eat primarily slugs, but will also hunt" + "\n" + 
                            "earthworms, snails, and soft insects." + "\n");
                        System.out.println("Size:");
                        System.out.println("9\"-14\"");
                        System.out.println("Coloration: ");
                        System.out.print("Back: black, reddish brown, or tan;" +
                            "faint orange or yellow spots at base of neck;" + "\n"
                            + "rough (keeled) scales" + "\n");
                        System.out.println("Belly: red or orange");
                        System.out.println("Behavior:");
                        System.out.print("Will flatten their bodies and may" + "\n"
                            + "emit a stinky musk when handled" + "\n");
                        System.out.println("Preferred habitat:");
                        System.out.println("Moist woodlands; rotten logs");
                       break;
                       
                    case 4:
                        System.out.println("BITE WARNING");
                        System.out.print("Racer snakes are large, smooth-scaled"
                            + "\n" + "snakes known for their speed. They feed on" +
                            "\n" + "small rodents, frogs, insects, lizards, and" + 
                            "\n" + "other snakes." + "\n");
                        System.out.println("Size:");
                        System.out.println("4\'-6\'");
                        System.out.println("Coloration:");
                        System.out.print("Back: black (adults), gray or brown" +
                            "\n" + "with darker brown spots (juveniles)" + "\n");
                        System.out.println("Belly: black; may have white chin");
                        System.out.println("Behavior:");
                        System.out.print("Will bite repeatedly if handled;" + "\n"
                            + "first defense is to escape up bushes or trees" + "\n"
                            + "Diurnal, have very good vision and often hunt with" +
                            "\n" + "their heads raised off the ground" + "\n");
                        System.out.println("Preferred habitat:");
                        System.out.println("Varied; prefer open spots for basking");
                       break;
                       
                    case 5:
                        System.out.print("Ring-necked Snakes have a varied diet" +
                            "\n" + "that includes earthworms and salamanders." + "\n");
                        System.out.println("Size:");
                        System.out.println("1\'-2.25\'");
                        System.out.println("Coloration:");
                        System.out.print("Back: dark gray or black;" + "\n" + 
                            "light yellow or orange ring around neck" + "\n");
                        System.out.println("Belly: yellow or orange");
                        System.out.println("Behavior:");
                        System.out.print("May have mild toxins (not harmful to" 
                            + "\n" + "humans) in their salive to paralyze prey" + "\n");
                        System.out.println("Preferred habitat:");
                        System.out.println("Rotting logs, leaf litter, flowerbeds");
                       break;
                       
                    case 6:
                        System.out.println("BITE WARNING");
                        System.out.print("Eastern Garter Snakes are one of" + "\n"
                            + "the most common snakes in North America. Mostly active"
                            + "\n" + "during the day, they eat frogs, salamanders," +
                            "fish, and earthworms. They have rough (keeled) scales."
                            + "\n");
                        System.out.println("Size:");
                        System.out.println("1.75\'-4\'");
                        System.out.println("Coloration:");
                        System.out.print("Back: dark with white or yellow" + "\n"
                            + "stripe; checkerboard of dark squares and stripes" + "\n"
                            + "on sides" + "\n");
                        System.out.println("Belly: greenish or yellowish, two" +
                            "\n" + "rows of black spots" + "\n");
                        System.out.println("Behavior:");
                        System.out.print("May thrash around, emit a stinky musk,"
                            + "\n" + "and/or bite if handled" + "\n");
                        System.out.println("Preferred habitat:");
                        System.out.println("Rotting logs, leaf litter, flowerbeds");
                       break;
                      
                    case 7:
                        System.out.print("Corn Snakes are large constrictors that"
                            + "\n" + "gained their name from their habit of residing in" +
                            "\n" + "barns, where they could find rodents feeding on" +
                            "\n" + "corn and other grains. They also eat birds," + 
                            "\n" + "lizards, and treefrogs." + "\n");
                        System.out.println("Size:");
                        System.out.println("3\'-6\'");
                        System.out.println("Coloration:");
                        System.out.print("Back: orange, brown, or gray with" + 
                            "\n" + "squarish red blotches" + "\n");
                        System.out.println("Belly: white and black checkerboard");
                        System.out.println("Behavior:");
                        System.out.print("Mainly nocturnal and generally docile" 
                            + "\n" + "when caught; can be kept as pets; sadly are"
                            + "\n" + "frequently mistaken for copperheads and killed"
                            + "\n");
                        System.out.println("Preferred habitat:");
                        System.out.print("Under logs, boards, or other cover"
                            + "\n" + "near fields or clearings" + "\n");
                       break;
                     
                    case 8: 
                        System.out.println("BITE WARNING");
                        System.out.print("Northern Watersnakes are large," + "\n"
                            + "heavy-bodied watersnakes that are sometimes mistaken for"
                            + "\n" + "cottonmouths or copperheads. Their diet mainly"
                            + "\n" + "consists of amphibians and fish." + "\n");
                        System.out.println("Size:");
                        System.out.println("2.75\'-5\'");
                        System.out.println("Coloration:");
                        System.out.print("Back: gray, reddish, brown, or black;"
                            + "\n" + "crossbanded pattern on body darkens with age"
                            + "\n");
                        System.out.println("Belly: white with brown half-circles");
                        System.out.println("Behavior:");
                        System.out.print("Active during the day and at night;" + "\n"
                            + "will spread their jaws and flatten their bodies" +
                            "\n" + "when threatened to seem larger; likely to bite"
                            + "\n" + "and emit musk if handled" + "\n");
                        System.out.println("Preferred habitat:");
                        System.out.println("Variety of aquatic environments");
                       break;
                       
                    case 9:
                        System.out.print("Rat Snakes are the most commonly found"
                            + "\n" + "snakes in North Carolina. They are often" +
                            "\n" + "mistaken for Racer Snakes, but have rough (keeled)"
                            + "\n" + "scales instead of smooth scales. They usually"
                            + "\n" + "consume rodents, birds, and bird eggs." + "\n");
                        System.out.println("Size:");
                        System.out.println("5\'-8\'");
                        System.out.println("Coloration:");
                        System.out.print("Back: black (adults); gray or black" 
                            + "\n" + "with dark brown blotches (juveniles)" + "\n");
                        System.out.println("Belly: mix of white and black" + "\n"
                            + "checkered markings" + "\n");
                        System.out.println("Behavior:");
                        System.out.print("Expert climbers; do well in established"
                            + "\n" + "neighborhoods; usually docile but may bite"
                            + "\n" + "or musk" + "\n");
                        System.out.println("Preferred habitat:");
                        System.out.print("Various habitats; often found in or" 
                            + "\n" + "around human dwellings" + "\n");
                       break;
                       
                    case 10:
                        System.out.println("VENEMOUS - DO NOT HANDLE");
                        System.out.print("Copperheads are the most common venemous"
                            + "\n" + "snake in North Carolina. They use ambush tactics"
                            + "\n" + "to catch prey including rodents, small birds,"
                            + "\n" + "frogs, and insects." + "\n");
                        System.out.println("Size:");
                        System.out.println("2.75\'-4.5\'");
                        System.out.println("Coloration:");
                        System.out.print("Back: gray or light brown with dark" + "\n"
                            + "brown hourglass markings; juveniles have bright" +
                            "\n" + "yellow tails" + "\n");
                        System.out.println("Belly: mix of white and black markings");
                        System.out.println("Behavior:");
                        System.out.print("Usually nocturnal; may move and bask during"
                            + "\n" + "the day; when threatened will vibrate tail and"
                            + "\n" + "release musk; bite only when severely threatened"
                            + "\n" + "and bite is rarely fatal to humans" + "\n");
                        System.out.println("Preferred habitat:");
                        System.out.print("Most common in forested areas or open fields;"
                            + "\n" + "fairly tolerant of human development" + "\n");
                       break;
                       
                    case 11: 
                        System.out.println("VENEMOUS - DO NOT HANDLE");
                        System.out.print("Timber Rattlesnakes, sometimes called" + "\n"
                            + "canebrakes, are large ambush predators that mainly eat"
                            + "\n" + "rodents but have been known to capture birds." + 
                            "\n");
                        System.out.println("Size:");
                        System.out.println("4\'-6.5\'");
                        System.out.println("Coloration:");
                        System.out.print("Back: typically dark chevrons on light background;"
                            + "\n" + "can range from yellow to dark gray to mostly black"
                            + "\n");
                        System.out.println("Belly: mostly white, some gray blotches");
                        System.out.println("Behavior:");
                        System.out.print("Rely on camoflauge for protection; reluctant" +
                            "\n" + "to rattle or bite; if bitten, seek immediate medical" +
                            "\n" + "attention" + "\n");
                        System.out.println("Preferred habitat:");
                        System.out.print("Most common in the mountains; not tolerant of"
                            + "\n" + "human development; inhabit mainly forested areas" + "\n");
                       break;
                       
                }        
                break;
                
            case 5:
                System.out.println("Exiting program.");
                System.exit(0);
                break;
                
            default:
                System.out.println("That's not a valid value. Exiting program.");
                System.exit(1);
                break;
            }
            
        System.out.println(" ");
        System.out.println("Would you like to learn about another snake species?");
        System.out.println("Please enter 'y' for yes or 'n' for no");
        char runAgain = sc.next().charAt(0);
            if (runAgain == 'n' || runAgain == 'N')
                rerun = false;
            
                
        }
    
    System.out.print("Please remember that snakes are vital to the" + 
                "\n" + "ecosystems they inhabit. If you respect their space," +
                "\n" + "they will respect yours. Keep in mind that a snake's" +
                "\n" + "first line of defense is to flee - NOT to bite!" + "\n");    
        
    } //End Main Method

} //End Class PearlHacks2018
