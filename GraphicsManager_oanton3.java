import java.util.*;
import java.awt.*;


public class GraphicsManager_oanton3 {
	private Polygon sp = new Polygon();
	private int aze;
	
	
	Polygon create() {return null;}
	Polygon[] typesearch (int code) {return null;}
	

		public static void main(String [] args){
			
			System.out.println("If you want to find average of 3 numbers please input: average   If you want to find legth of a string input: string");
			Scanner scanner = new Scanner(System.in);
			String ui1= scanner.next();
			
		
			 if(ui1.equals("average")) {
			
			
				int n1,n2,n3;
				String p1 = ("Print first number");
				String p2 = ("Print second number");
				String p3 = ("Print third number");
			
			
			
				System.out.println(p1); 
				Scanner i1 = new Scanner(System.in); 
				n1 = i1.nextInt();  
				System.out.println(p2); 
				Scanner i2 = new Scanner(System.in); 
				n2 = i2.nextInt(); 
				System.out.println(p3); 
				Scanner i3 = new Scanner(System.in); 
				n3 = i3.nextInt();
	 		
	 		
				double average;
				average = (n1+n2+n3)/3; 
				System.out.println("Average of three numbers is: " + average);
			}
	 		
		else if (ui1.equals("string")){
				String str; 
		 		int l1; 
		 		Scanner  scan = new Scanner(System.in); 
		 		System.out.print("Please enter a string:" );
		 		str = scan.nextLine(); 
		 		l1 = str.length(); 
		 		System.out.println("Length of string is:" + l1);
		 		
				char char3 = str.charAt(3); 
				System.out.println("The third Character of string is:" + char3);
			
			}
			 class Polygon {
					private int id;
					private int sides;
			 }}}

