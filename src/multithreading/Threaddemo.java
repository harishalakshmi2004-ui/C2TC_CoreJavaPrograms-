package multithreading;

public class Threaddemo {

	public static void main(String[] args) {
		
				childthread threadOne = new childthread(5, "First");
				childthread threadTwo = new childthread(10, "Second");

				threadOne.start();
				//threadOne.start(); // throws IllegalStateException
				// threadOne.run(); // single threaded application 
				threadTwo.start();

				System.out.println("-----------------------End of Main--------------------------");
			}
		

	}


