import java.util.Scanner;
import java.util.ArrayList;

public class OrderMenu {
    //public ArrayList<SelectMenu> menuList = new ArrayList<>();
    
    public static void FoodMenu(Menu[] menuArr){
        boolean isTrue;
        char choice;
        String temp;
        double totalPrice = 0;
        Scanner input = new Scanner(System.in);
        ArrayList<Menu> menu = new ArrayList<Menu>();
        //ArrayList<SelectMenu> selectMenu = new ArrayList<SelectMenu>();
        
        do{
            System.out.println("\n\n-- FOOD MENU --");
            for(int i = 0; i < menuArr.length; i++){
                System.out.print((i+1) + ". "+menuArr[i]);
                System.out.println();
            }
            System.out.println("Select Menu [1.. "+menuArr.length+"] : ");
            int selection = input.nextInt();
            System.out.println();
            Menu m1 = new Menu(menuArr[selection-1].getFoodID(),menuArr[selection-1].getFoodName(),menuArr[selection-1].getPrice());
            System.out.print("Quantity : ");
            int quantity = input.nextInt();
            
            menu.add(m1);
            
            System.out.print("\n\nOrders Details\n");
            System.out.println("  Food ID\t\tFood Name\t\tUnit Price\tQuantity");
            System.out.println("---------------------------------------------------------------------");
    		for(int i=0; i<menu.size(); i++){
    			System.out.print((i+1)+ ". " +menu.get(i));
                        System.out.print("\t\t "+quantity);
    			System.out.println();
    		}
            //totalPrice += (m1.getPrice()*quantity);
            
            //validation for char
            do{
      	 		isTrue = true;
       	 		System.out.print("\nDo you want to continue(Y/N)? "); 
       	 		temp = input.next();
       	        
       	 		if (validateChar(temp)){
       				if (temp.toUpperCase().charAt(0) == 'Y' || temp.toUpperCase().charAt(0) == 'N')
       					isTrue = false;
       	 		}
       	
       		}while(isTrue); 
            choice = temp.charAt(0);
        }while(Character.toUpperCase(choice) == 'Y');
        

    }
    
    public static void displayMenu(){
        int choice;
        
        Menu[] menuArr = new Menu[5];
        menuArr[0] = new Menu("F0001","French Fries",5.90);
        menuArr[1] = new Menu("F0002","Fried Chicken (6pcs)",25.50);
        menuArr[2] = new Menu("B0001","Orange Juice",4.50);
        menuArr[3] = new Menu("B0002","Coca Cola",3.00);
        menuArr[4] = new Menu("D0001","Chocolate Cake (1pc)",6.50);
        
        Scanner input = new Scanner(System.in);
        
        
        do{
            System.out.print("Customer ID : ");
            String custID = input.nextLine();
            System.out.println("\n\nMAIN MENU");
            System.out.println("=========");
            System.out.println("[1] Order");
            System.out.print("\nPlease enter your choice. [0] is to Exit : ");
            
            choice = input.nextInt();
            input.nextLine();
            
            switch(choice){
                case 1:
                    FoodMenu(menuArr);
                    break;
                case 0:
                    System.exit(-1);
            }
        }while(choice != 0);
    }
    
    
    public static void main(String []args){
        
        displayMenu();
                       
    }
    
    public static boolean validateChar (String str) {
    	
    	//method for validating CHAR input
    	boolean hasDigit = false;
    	boolean hasLetter = false;
    	
    	for (int i=0 ; i<str.length() ; i++){
    		
    		if (Character.isDigit(str.charAt(i)))
				hasDigit = true;
			if (Character.isLetter(str.charAt(i)))
				hasLetter = true;
				
    	}
    	
    	if  (hasLetter && !hasDigit)
    		return true;
    	else return false;
    }
    
}
