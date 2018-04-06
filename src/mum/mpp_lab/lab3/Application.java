package mum.mpp_lab.lab3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Application {

    public static void main(String[] args) throws IOException {
        putText("How many packages are you sending");
        String noOfPackages = getString();
        for (int i = 0; i < Integer.valueOf(noOfPackages); i++) {
            putText("Please enter description for package number + " + (i + 1));
            String packageDescription = getString();
            putText("Please enter the weight for package number + " + (i + 1));
            double packageWeight = Double.valueOf(getString());
            putText("Please enter Zone for package number + " + (i + 1));
            String zone = getString();
            Package pckage = new Package();
            pckage.setPackageDescription(packageDescription);
            pckage.setWeight(packageWeight);
            pckage.setZone(zone);
            Ups ups = new Ups();
            double upsRate = ups.costOfPackage(pckage);
            Fedex fedex = new Fedex();
            double fedexRate = fedex.costOfPackage(pckage);
            UsMail usMail = new UsMail();
            double usMailRate = usMail.costOfPackage(pckage);
            double cheapestRate = upsRate;
            String carrierName = "UPS";
            if(cheapestRate < fedexRate){
                cheapestRate = fedexRate;
                carrierName = "FedEx";
            }
            if(cheapestRate < usMailRate){
                cheapestRate = usMailRate;
                carrierName = "US Mail";
            }
            putText("The cheapest cost");

        }

    }

    public static String getString() throws IOException  //reads a string from the keyboard input
    {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String s = br.readLine();
        return s;
    }

    public static void putText(String s) //writes string s to the screen
    {
        System.out.println(s);
    }
}
