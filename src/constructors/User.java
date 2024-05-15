package constructors;

public class User {
	
	//instance variable
	String userName;
	String password;
	
	//------------ default constructor -------------
	User(){
		userName = "root";
		password = "123";
	}
	
	//-------------- parameterized constructor ------------
	
	User(String userName, String password){
		
		//this();//calling default constructor
		//this(343,4545);//calling parameterized constructor
		
		this.userName = userName;
		this.password = password;
		
		 // this.printUser(); //method calling
		
		/*
		 *  # 'this' keyword is use to represent current object.
		 *  # we can do following with 'this' keyword :
		 *     -> call instance variables
		 *     -> call instance methods
		 *     -> call constructors
		 */
	}
	
   User(String userName){
		
		this.userName = userName;
	}
	
	void printUser() {
		
		System.out.println("UserName = "+userName);
		System.out.println("Password = "+password);
	}
	
	public static void main(String[] args) {
		
		User u = new User("hari","5555");
		u.printUser();
		
		new User().printUser();
		
		/**
		 * ------------------- Object class --------------------------
		 * Class {@code Object} is the root of the class hierarchy.
		 * Every class has {@code Object} as a superclass. All objects,
		 * including arrays, implement the methods of this class.
		 */
		
	}

}
