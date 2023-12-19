import java.util.Scanner;

public class FoodOrder {
    // first let's declare our variables for prices of food items
    int frenchFries = 100;
    int burger = 120;
    int pastry = 100;
    int pizza = 200;
    int coldCoffee = 100;
    int coldDrink = 80;
    int iceTea = 80;
    int ch;
    int quantity;
    static int total;
    String again;


    Scanner sc = new Scanner(System.in);

    // let's create a method for displaying our food menu

    // we need a method to generate bill
    public void generateBill()
    {
        System.out.println();
        System.out.println("***********Thankyou For ordering**********");
        System.out.println("*********Your Bill is: " +total+"********");


    }
    public void displayMenu() {
        System.out.println("********Welcome to our Cafe ********");
        System.out.println("=====================================");
        System.out.println("          1- frenchFries       100/-");
        System.out.println("          2- Burger            120/-");
        System.out.println("          3- Pastry            100/-");
        System.out.println("          4- Pizza             200/-");
        System.out.println("          5- ColdCoffee        100/-");
        System.out.println("          6- ColdDrink         80 /-");
        System.out.println("          7- IceTea            80/-");
        System.out.println("======================================");
        System.out.println("      What do you want to order today??     ");
    }

    // let's create a method to order food item's
    public void order() {
        while (true) {
            System.out.println("Enter Your Choice ");
            ch = sc.nextInt();
            switch (ch) {
                case 1: // frenchFries
                    System.out.println("You have Ordered frenchFries");
                    System.out.println();
                    System.out.println("Enter you Desired Quantity");
                    quantity = sc.nextInt();
                    total = total + quantity * frenchFries;
                    break;

                case 2: // Burger
                    System.out.println("You have Ordered burger");
                    System.out.println();
                    System.out.println("Enter you Desired Quantity");
                    quantity = sc.nextInt();
                    total = total + quantity * burger;
                    break;

                case 3: // pastry
                    System.out.println("You have Ordered pastry");
                    System.out.println();
                    System.out.println("Enter you Desired Quantity");
                    quantity = sc.nextInt();
                    total = total + quantity * pastry;
                    break;

                case 4: // pizza
                    System.out.println("You have Ordered pizza");
                    System.out.println();
                    System.out.println("Enter you Desired Quantity");
                    quantity = sc.nextInt();
                    total = total + quantity * pizza;
                    break;

                case 5: // coldCoffee
                    System.out.println("You have Ordered coldCoffee");
                    System.out.println();
                    System.out.println("Enter you Desired Quantity");
                    quantity = sc.nextInt();
                    total = total + quantity * coldCoffee;
                    break;

                case 6: // coldDrink
                    System.out.println("You have Ordered coldDrink");
                    System.out.println();
                    System.out.println("Enter you Desired Quantity");
                    quantity = sc.nextInt();
                    total = total + quantity * coldDrink;
                    break;

                case 7: // iceTea
                    System.out.println("You have Ordered iceTea");
                    System.out.println();
                    System.out.println("Enter you Desired Quantity");
                    quantity = sc.nextInt();
                    total = total + quantity * iceTea;
                    break;

                case 8: //exit
                    System.exit(1);
                    break;

                default:
                    break;
            }
            System.out.println();
            System.out.print("Do you wish to order anything else..?? (Y/N): ");
            again = sc.next();
            if (again.equalsIgnoreCase("Y"))
            {order();}
            else if(again.equalsIgnoreCase("N"))
            {generateBill();
            System.exit(1);}
            else{System.out.println("Invalid Choice");}
        }
    }
}
