import java.util.Scanner;


public class TestTeamPlayer {
    public static void main(String[]args){
        // the follwowing variables are for team player two which will store the user's custom input values to create an object
        String customName;
        double customHeight;
        double customWeight; 


       TeamPlayer teamplayer1 = new TeamPlayer(); // creating an object with the default constructor

       System.out.print("Name :" + teamplayer1.getName());

       System.out.printf("  Height: %.1f",teamplayer1.getHeight()); // accessors are implemented here to get private attributes of the object to one decimal place
       System.out.printf("  Weight: %.1f",teamplayer1.getWeight());
 
       System.out.printf("\nTeamPlayer's BMI : %.2f",teamplayer1.getBMI()); // accessor is implemented here to get the BMI to 2 decimal places
       
        teamplayer1.setName("George Brown"); // mutators is implemented here to change the player's info
        teamplayer1.setHeight(71.0);
        teamplayer1.setWeight(175.0);

        System.out.println(""); 
        System.out.println("");
        System.out.print("Name :" + teamplayer1.getName()); // the updated details of the TeamPlayer is printed using accessors
        System.out.printf("  Height: %.1f",teamplayer1.getHeight());
        System.out.printf("  Weight: %.1f",teamplayer1.getWeight());
        System.out.printf("\nTeamPlayer's BMI : %.2f",teamplayer1.getBMI());
        System.out.println("");
        System.out.println(""); 

        Scanner my_Scanner = new Scanner(System.in); // asking the user to input their preffered values

         
        System.out.print("\nTeamPlayer's Name :"); // custom name 
        customName = my_Scanner.nextLine(); 
        
        System.out.print("Height :"); // custom Height in inches
        customHeight = my_Scanner.nextDouble();
        
        System.out.print("Weight :"); // custom Weight in pounds
        customWeight = my_Scanner.nextDouble();
        
        // custom info implemented to create teamPlayer2 object
        TeamPlayer teamPlayer2 = new TeamPlayer(customName,customWeight,customHeight);

        
        System.out.println(""); // accessor methods implemented to display the new object's details 
        System.out.println("");
        System.out.print("Name :" + teamPlayer2.getName());
        System.out.printf("  Height: %.1f",teamPlayer2.getHeight());
        System.out.printf("  Weight: %.1f",teamPlayer2.getWeight());
        System.out.printf("\nTeamPlayer's BMI : %.2f",teamPlayer2.getBMI());
    }
}