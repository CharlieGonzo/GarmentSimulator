package org.example;

import java.util.Scanner;

public class Driver {


    /**
     * This methods asked the user to configure the Application to what clothes they will want the application
     * to produce
     * @return Application configuration
     */
    public static Application configureApplication(){
        while(true) {
            System.out.println("type party for party clothes, casual for casual clothes, or professional for professional clothes\n if you want to exit type exit");
            Scanner in = new Scanner(System.in);
            String ans = in.nextLine();

            if (ans.equalsIgnoreCase("party")) {
                return new Application(new PartyClothesFactory());
            }
            if (ans.equalsIgnoreCase("casual")) {
                return new Application(new CasualClothesFactory());
            }
            if (ans.equalsIgnoreCase("professional")) {
                return new Application(new ProfessionalClothesFactory());
            }
            if(ans.equalsIgnoreCase("exit")) {
                return null;
            }
            System.out.println("Please enter valid response");
        }

    }

    public static void main(String[] args) {
        Application currentApp = configureApplication();
        //if user didnt choose to exit
        if(currentApp != null) {
            currentApp.describeCurrentClothes();
        }
    }
}