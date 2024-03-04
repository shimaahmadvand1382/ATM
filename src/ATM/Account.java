package ATM;
import java.util.Scanner;
import java.util.Date;
public class Account {
	   
		int balance;
	    int prevTransaction;
	    String customerName;
	    String customerID;
	    
	    Account(String cname, String cid  ){
	    	customerID = cid;
	    	customerName = cname;
	    }
	    
	    void deposit(int amount) {
	    	if (amount != 0 && amount > 0) {
	    		balance = balance + amount;
	    		prevTransaction = amount;
	    		 
	    	}
	    }
	    
	    void withdraw(int amount) {
	    	if (amount != 0){
	    		balance -= amount;
	    		prevTransaction = -amount;  
	    	}
	    }
	    
	    void getPrevTransaction() {
	    	if(prevTransaction > 0) {
	           System.out.println("Deposited:" + prevTransaction);
	    	} else if (prevTransaction < 0) {
	    		System.out.println("withdrawn:" + Math.abs(prevTransaction));
			} else {
				System.out.println("No Transaction Occured");
			}
	    	
	           
	           
	    }
	        void showMenu() {
	          	char optoin = '\0';
	          	Scanner scanner = new Scanner (System.in);
	          	System.out.println("Welcome," + customerName + "!");
	          	System.out.println("Your ID is:" + customerID + "!");
	          	System.out.println();
	          	System.out.println("What would you like to do? 👌👃");
	          	System.out.println();
	          	System.out.println("A. Check your balance");
	          	System.out.println("B. Make a deposit");
	          	System.out.println("C. Make a withdraw");
	          	System.out.println("D. View Perv Transaction");
	          	System.out.println("E. Show Date");
	          	System.out.println("F. Exit");
	    
	        
	        do {
	        	System.out.println();
	        	System.out.println("Please Enter an option");
	        	char optoin1 = scanner.next().charAt(0);
	        	optoin = Character.toUpperCase(optoin1);
	        	System.out.println();
	        	
	        	switch(optoin) {
	        	case 'A':
	        		System.out.println("=============");
	        		System.out.println("Balance = $ " + balance);
	        		System.out.println("==============");
	        		break;
	        	case 'B' :
	        		System.out.println("Enteran amount to deposit:");
	        		int amount = scanner.nextInt();
	        		deposit(amount);
	        		break;
	        	case 'C':
	        		System.out.println("Enteran amount to withdraw:");
	        		int amount2 = scanner.nextInt();
	        		withdraw(amount2);
	        		break;
	        	case 'D':
	        		System.out.println("==============");
	        		getPrevTransaction();
	        		System.out.println("==============");
	        		break;
	        	case 'E':
	        		Date date= new Date();
	        		
	        		System.out.println(date);
	        		break;
	        	case 'F':
	        		System.out.println("========");
	        		break;
	        	default:
	        		System.out.println("Error: Invalid Option. Please enter A,B,C,D,E,F");
	        		break;	
	        	}}
	        	
	       while (optoin != 'E');
	       System.out.println("Thank you for using our ATM");
	        }}

	        
	         
	             
	            	 

	       
	           
	
	
	
	
	


