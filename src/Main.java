import java.io.Console;

public class Main {
    public static void main(String[] args) {
        Console myConsole = System.console();

        Method hatchback = new Method("BMW",   "xdrive", "blue", 1999,2000);
        Method track = new Method("isuzu","mistubishi","white",2012,3000);
        Method suv = new Method("rangeRover","spot","luminous",2021,5000);
        Method german = new Method("audi","rs6","purple",2019,4000);


        Method[] allVehicle = {hatchback, track, suv, german};

        System.out.println("Enter your maxmum price");
        String stringUserMaxBudget = myConsole.readLine();

        int userMaxBudget = Integer.parseInt(stringUserMaxBudget);
          System.out.println("this is what we have in your range");
        for (Method allPurchase : allVehicle) {
            System.out.println(allPurchase.mBrand);
            System.out.println(track.mModel);
            System.out.println(suv.mColor);
            System.out.println(german.mPrice);
        }
    }
}


