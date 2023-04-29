import java.util.*;
public class thermStability {
    public static void stabilityCheck(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter details of 5 Organgometallic Compunds");
        String[] name = new String[5];
        double[] enthalpy = new double[5];
        double[] entropyChange = new double[5];
        double[] temperature = new double[5];

        double gibbs = 0.0;
        for(int i = 0; i<5; i++){
            System.out.println("Enter the following for Compund: "+(i+1));
            System.out.println("Name: ");
            name[i] = sc.nextLine();
            System.out.println("Enthalpy Change: ");
            enthalpy[i] = Double.parseDouble(sc.nextLine());
            System.out.println("Entropy Change: ");
            entropyChange[i] = Double.parseDouble(sc.nextLine());
            System.out.println("Temperature in Kelvin: ");
            temperature[i] = Double.parseDouble(sc.nextLine());
        }
        for(int i = 0; i<5; i++){
            gibbs = enthalpy[i] - (temperature[i]*entropyChange[i]);

            if (gibbs<0){
                System.out.println("The compound \""+name[i]+"\" is STABLE");
                System.out.println("The reaction is spontaneous and the formation of product which is the given compound is favoured.");
                System.out.println();
                System.out.println();
            } else if (gibbs>0) {
                System.out.println("The compound \""+name[i]+"\" is UNSTABLE");
                System.out.println("The reaction is non-spontaneous and the formation of product which is the given compound is not favoured.");
                System.out.println();

            } else if (gibbs==0) {
                System.out.println("The compound \""+name[i]+"\" is in Equilibrium");
                System.out.println("Reaction which forms the product is in equilibrium.");
                System.out.println();

            }
        }

    }

    public static void main(String args []){
        stabilityCheck();

    }
}
