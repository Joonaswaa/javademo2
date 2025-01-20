package main;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
    
        Scanner sc = new Scanner(System.in);
        System.out.print("Anna auton merkki: ");
        String brand = sc.nextLine();
        System.out.print("Anna auton malli: ");
        String model = sc.nextLine();

        Car newCar = new Car(brand, model, 0);
        


       

    boolean exit = false;
    while(!exit){
        System.out.println("1) Näytä auton tila");
        System.out.println("2) Muokkaa auton merkkiä ja mallia");
        System.out.println("3) Kiihdytä autoa");
        System.out.println("4) Hidasta autoa");
        System.out.println("0) Lopeta ohjelma");

        if(sc.hasNext()) {
            int i = 0;
            String stringInput = sc.nextLine();
            i = Integer.parseInt(stringInput);

            switch(i) {
                case 1:
                    System.out.println("Auto: " + newCar.getBrand() + " " + newCar.getModel() + ", Nopeus: " + newCar.getSpeed() + " km/h");
                
                    //newCar = new Car(brand, model);
                    break;
                case 2:
                                        
                    System.out.println("Anna uusi auton merkki: ");
                    String newBrand = sc.nextLine();
                    System.out.println("Anna uusi auton malli: ");
                    String newModel = sc.nextLine();
                    newCar.updateCar(newBrand, newModel);

                    break; 
                


                case 0:
                    System.out.println("Kiitos ohjelman käytöstä.");
                    exit = true;
                    break;
                default:
                    System.out.println("Syöte oli väärä");
                    break;    
                }

            }
        }
        sc.close();
    }
    

    
}
