import java.util.Scanner;
public class InsurancePremiumCalculator{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String buildingType=sc.nextLine();
        double amount=sc.nextDouble();
        int claims=sc.nextInt();
        double premium=0.0;
        double processingCharge=0.0;
        double discount=0.0;
        if(buildingType.equalsIgnoreCase("Domestic")){
        if(amount<100000){
            premium=amount*0.003;
        }else{
            premium=amount*0.0025;
        }
        processingCharge=50;
        premium=premium+processingCharge;
        if(claims==0){
            discount=premium*0.10;
            premium=premium-discount;
        }
    }else if(buildingType.equalsIgnoreCase("commercial")){
            if(amount<250000){
                premium=amount*0.005;
            }else{
                premium=amount*0.0075;
            }
            processingCharge=80;
            premium=premium+processingCharge;
            if(claims==0){
                discount=premium*0.15;
                premium=premium-discount;
            }
        }
        System.out.printf("%.2f",premium);
        sc.close();
    }
}