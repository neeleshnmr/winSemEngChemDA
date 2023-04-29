import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.*;
public class normality {
    public static void process(){
        Scanner sc = new Scanner(System.in);
        NumberFormat formatter = new DecimalFormat("#0.00");
        System.out.println("Enter normality of 50 Water Samples");
        double[] norm = new double[50];
        String[] ppm = new String[50];
        String[] ppb = new String[50];
        for(int i =0; i<50; i++){
            System.out.print("Normality of Sample "+(i+1)+": ");
            norm[i] = sc.nextDouble();
            System.out.println();
        }
        for(int i = 0; i<50; i++){
            double temp = 0;
            temp = (norm[i])/6;
            ppm[i] = formatter.format(temp * 52 *1000);
            ppb[i] = formatter.format(temp*52*1000*1000);

        }
        //Printing the result.
        System.out.println("Enter \"a\" if you want results of all samples at once ");
        System.out.println("Enter \"b\" if you want to search by sample number");
        String ch = sc.next();
        switch(ch){
            case "a":
                for(int i = 0; i<50; i++){
                    double val = Double.parseDouble(ppm[i]);
                    if(val>0.05){
                        System.out.println("Concentration of chromium-6 in Sample "+(i+1)+" is "+ppm[i]+" ppm or "+ppb[i]+" ppb");
                        System.out.println("Hence Sample "+(i+1)+" is not safe as it exceeds the permissible limit of 0.05ppm or 50ppb of chromium-6 contamination.");
                        System.out.println();
                    }
                    else if(val>0 && val<=0.05){
                        System.out.println("Concentration of chromium-6 in Sample "+(i+1)+" is "+ppm[i]+" ppm or "+(ppb[i])+" ppb");
                        System.out.println("Hence Sample "+(i+1)+" is safe as it does not exceed the permissible limit of 0.05ppm or 50 ppb of chromium-6 contamination");
                        System.out.println();
                    }
                    else if(val==0.00){
                        System.out.println("Concentration of chromium-6 in Sample "+(i+1)+" is "+ppm[i]+" ppm or "+(ppb[i])+" ppb");
                        System.out.println("Hence no contamination of chromium-6");
                    }
                }
                break;
            case "b":
                int n=0;
                do{
                    System.out.println("Enter the Sample number, enter 0 to abort");
                    n = sc.nextInt();

                    if(n>0 && n<=5) {
                        double val = Double.parseDouble(ppm[n-1]);
                        if (val > 0.05) {
                            System.out.println("Concentration of chromium-6 in Sample " + n + " is " + ppm[n - 1] + " ppm or " + (ppb[n - 1]) + " ppb");
                            System.out.println("Hence Sample " + n + " is not safe as it exceeds the permissible limit of 0.05ppm or 50ppb of chromium-6 contamination.");
                            System.out.println();

                        } else if (val > 0 && val<= 0.05) {
                            System.out.println("Concentration of chromium-6 in Sample " + n + " is " + ppm[n - 1] + " ppm or " + (ppb[n - 1]) + " ppb");
                            System.out.println("Hence Sample " + n + " is safe as it does not exceed the permissible limit of 0.05ppm or 50 ppb of chromium-6 contamination");
                            System.out.println();
                        } else if (val == 0.0) {
                            System.out.println("Concentration of chromium-6 in Sample " + n + " is " + ppm[n - 1] + " ppm or " + (ppb[n - 1]) + " ppb");
                            System.out.println("Hence no contamination of chromium-6");
                        }
                    }


                }while (n!=0);
                break;
            default:
                System.out.println("Please enter a or b");
        }

    }
    public static void main(String args[]){
        process();

    }
}
