import java.util.Scanner;

public class login {

static void User(){
	//Enter the account and password correctly, enter the library management system
	 System.out.println("***Welcome to the library management system***");
         Scanner sc = new Scanner(System.in);
        /* System.out.println("Please enter the account number:");
	 int acount = sc.nextInt();//Keyboard input account
	 System.out.println("Please enter the password:");
	 int pwd = sc.nextInt();//Keyboard input password

         //Determine whether the account and password are entered correctly
	if(acount==123456 & pwd==123456){
		while(true){
			
		}
	}
	else {
		 System.out.println("The account or password is entered incorrectly!");//The account or password is entered incorrectly
	}*/

	
	 //Operation options
	 System.out.println("1. Book Search");


	 System.out.println("2. add books");
	 System.out.println("3. delete book");
	 System.out.println("4. Book issue");
	 System.out.println("5. Book return");
	 System.out.println("6. exit");
	 System.out.println("Please enter options (1-6)");
	
	 //Create object
	
	 //Keyboard input operation options
	int ch = sc.nextInt();
	
	 //Judgment input selection
	switch (ch) {
	case 1:
		 System.out.println("Search");
		break;
	case 2:
		 System.out.println("Add");
		break;
	case 3:
		 System.out.println("Delete");
		break;
	case 4:
		 System.out.println("Dues");
		break;
	case 5:
		 System.out.println("Return");
		break;
	case 6:
		 System.exit(0);//Exit the program
	default:
		 System.out.println("Please enter the correct option!");//Prompt when the option is entered incorrectly
	}
}

static void Admin(){
	//Enter the account and password correctly, enter the library management system
	 System.out.println("***Welcome to the library management system***");
         Scanner sc = new Scanner(System.in);
         System.out.println("Please enter the account number:");
	 int acount = sc.nextInt();//Keyboard input account
	 System.out.println("Please enter the password:");
	 int pwd = sc.nextInt();//Keyboard input password

         //Determine whether the account and password are entered correctly
	if(acount <= 10000 & pwd <= 10000)
        {
	  
	}
	else {
		 System.out.println("The account or password is entered incorrectly!");//The account or password is entered incorrectly
	}

	
	 //Operation options
	 System.out.println("1. Book Search");
         System.out.println("2. add books");
	 System.out.println("3. delete book");
	 System.out.println("4. Book issue");
	 System.out.println("5. Book return");
	 System.out.println("6. exit");
	 System.out.println("Please enter options (1-6)");
	
	 //Create object
	
	 //Keyboard input operation options
	int ch = sc.nextInt();
	
	 //Judgment input selection
	switch (ch) {
	case 1:
		 System.out.println("Search a book.");
		break;
	case 2:
		 System.out.println("Your book is added to library.");
		break;
	case 3:
		 System.out.println("Book is deleted.");
		break;
	case 4:
		 System.out.println("Pay dues.");
		break;
	case 5:
		 System.out.println("Your book is returned.");
		break;
	case 6:
		 System.exit(0);//Exit the program
	default:
		 System.out.println("Please enter the correct option!");//Prompt when the option is entered incorrectly
	}
}

//public class Management
public static void main(String[] args) {
	
	 Scanner input = new Scanner(System.in);//Create object
	
	 System.out.println("***Book Management System Login***");
	 Scanner sc = new Scanner(System.in);
         System.out.println("Please enter your name");
         String name = sc.next();
         System.out.println("Please enter your role (1, ordinary user 2, administrator)");
         int role = sc.nextInt();
         if(role == 1)
         {
            User();
         }
           Admin();
	}
}