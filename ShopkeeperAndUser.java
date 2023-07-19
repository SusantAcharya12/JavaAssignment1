package AssignmentFirst;
import java.util.Scanner;
public class ShopkeeperAndUser {

    public void costForUser(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the desired quantity");

        int quantity = scanner.nextInt();

        int totalCost = quantity * 100;
        int userCost;

        if(totalCost>1000){

            userCost = totalCost- (totalCost*10)/100;
            System.out.println(userCost);

        }
        else{
            userCost = totalCost;
            System.out.println(userCost);
        }



    }

    public static void main(String[] args) {

        ShopkeeperAndUser shop = new ShopkeeperAndUser();
        shop.costForUser();

    }

}
