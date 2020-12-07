package pizza.takeaway;
import java.util.*;
public class PizzaTakeaway {
    public static void main(String[] args) {
        double[] pizzaPrices = {7.99,10.99,13.99};
        Scanner input = new Scanner(System.in);
        double pizzaSizePrice=0;
        double toppingPrice=0;
        try{
            System.out.println("Enter pizza size, this are the prices of a small, medium and large pizza: "+Arrays.toString(pizzaPrices)+", enter 1,2 or 3");
            int choice = input.nextInt();
            while (choice<1||choice>3){
                System.out.println("Invalid number entered");
                System.out.println("Enter pizza size, this are the prices of a small, medium and large pizza: "+Arrays.toString(pizzaPrices)+", enter 1,2 or 3");
                choice = input.nextInt();
            }if (choice==1){
                pizzaSizePrice = pizzaPrices[0];
            }else if (choice==2){
                pizzaSizePrice = pizzaPrices[1];
            }else{
                pizzaSizePrice = pizzaPrices[2];
            }      
        }catch (InputMismatchException e){
            System.out.println("Invalid input or number too long");
            input.next();
        }catch (Exception e){
            System.out.println("Oops, something went wrong, try a valid input again. Error: "+e);
            input.next();
        }
        
        try{
            System.out.println("Each extra topping is £1.25 more, how many toppings would you like");
            long noToppings = input.nextLong();
            toppingPrice = (double) 1.25*noToppings;
        }catch (InputMismatchException e){
            System.out.println("Invalid input or number too long");
            input.next();
        }catch (Exception e){
            System.out.println("Oops, something went wrong, try a valid input again. Error: "+e);
            input.next();
        }
        double totalPrice = pizzaSizePrice+toppingPrice;
        System.out.println("Total price is £"+totalPrice);
    }
}
