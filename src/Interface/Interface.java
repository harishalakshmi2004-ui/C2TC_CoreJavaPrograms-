package Interface;
interface Fruits{
	
	 void sweet() ; //declaration
	 
public class Interface implements Fruits {

	

			public void sweet() {
				System.out.println("The fruits are sweet!!!"); //implementation
			}
			
			
			
			public static void main(String[] args) {
				
				
				Interface obj1 = new Interface();
				obj1.sweet();

			}
    }
       }

		
		
		

	


