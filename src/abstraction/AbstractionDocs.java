package abstraction;

public class AbstractionDocs {
	/*
	 * ----------------- Abstraction ---------------------
	 *  # process of hiding implementation details in the 
	 *    program is known as abstraction.
	 *    
	 *  # To achieve abstraction :
	 *  
	 *     a> Abstract class :
	 *     	-> class which contains abstract(unimplemented) methods and non-abstract methods 
	 *         is known as abstract class.
	 *         
	 *      -> abstract method :
	 *          # method which does not have body/implementation details.
	 *           e.g.
	 *                 abstract void print();
	 *                 abstract int getData(String msg);
	 *                 
	 *      -> every abstract class must have at least one child class and 
	 *         child class must override abstract methods.
	 *         
	 *      -> we can't crate object of abstract class.  
	 *      -> level of abstraction 0-100%.
	 *      
	 *             # Syntax :
	 *             
	 *                     abstract class class_name{
	 *                       
	 *                         //abstract methods
	 *                         
	 *                         //non-abstract methods
	 *                       
	 *                       }
	 *         
	 *     b> Interface :
	 *     
	 *       ->  same as class which contains public abstract methods
	 *           and public static final variables only.
	 *           
	 *       ->  every interface must have at least one implementation class
	 *           and impl. class must override abstract methods.
	 *           
	 *      ->  level of abstraction 100%.
	 *      ->  we can't inherit multiple interface.
	 *      ->  we can't create object of interface. 
	 *      
	 *         # syntax :
	 *         
	 *                interface  interface_name{
	 *                
	 *                      //public abstract methods
	 *                      //public static final variables (constants)
	 *                }
	 */

}
