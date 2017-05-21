import java.util.*;

public class MethodizedPizzaria{
	
	static Scanner keyboard = new Scanner(System.in); //Scanner for input. Static to exist at runtime.
	int choice = 0; //Integer that represents the user's menu selections.
	double totalPrice = 0.0;
	
	public static void main(String[] args){
		
		MethodizedPizzaria ourObject = new MethodizedPizzaria();
		
		ourObject.PrintMenu();
		ourObject.PromptForSelection();
		ourObject.choice = ourObject.MakeSelection(keyboard);
		ourObject.totalPrice = ourObject.DeterminePizza(ourObject.choice);

		if(ourObject.totalPrice != 0.0){
			ourObject.PrintExtras();
			ourObject.PromptForSelection();
			ourObject.choice = ourObject.MakeSelection(keyboard);
			ourObject.totalPrice = ourObject.ChooseExtras();
			ourObject.PrintReceipt();
		}
	}
	
	public void PrintMenu(){

		
		System.out.println("Welcome to Joe's Airport Pizzaria");
		
		System.out.println("======== Menu =========");
		System.out.println("1 - Cheese, $19.00");
		System.out.println("2 - Pepperoni, $29.00");
		System.out.println("3 - Combination, $1000000.00");
		
	}
	
	public void PrintExtras(){
		
		System.out.println("For additional toppings, enter 1 (+$506,400.00 or 1 gold brick)");
		System.out.println("For standard toppings, enter 2 (free)");
		
	}
	
	public void PromptForSelection(){
		
		System.out.print("Enter your selection: ");
		
	}
	
	public int MakeSelection(Scanner k){
		
		return k.nextInt();
		
	}
	
	public double DeterminePizza(int x){
		
		if(x == 1){
			System.out.println("You have selected cheese.");
			return 19.00;
		}
		else if(x == 2){
			System.out.println("You have selected pepperoni.");
			return 29.00;
		}
		else if(x == 3){
			System.out.println("You have selected combination.");
			return 1000000.00;
		}
		else{
			System.out.println("Go fly away and learn to read...");
			return 0.0;
		}
	}
	
	public double ChooseExtras(){
		
		switch(choice){
			case 1:
				System.out.println("You have opted for additional toppings. $506,400 added to the final cost of the pizza.");
				return totalPrice + 506400.00;
			case 2:
				System.out.println("Standard toppings selected at no additional cost.");
				return totalPrice;
			default:
				System.out.println("Invalid selection.");
				return totalPrice;
		}
		
	}

	public void PrintReceipt(){
		System.out.println("The final cost for your pizza is: " + totalPrice);
	}

}