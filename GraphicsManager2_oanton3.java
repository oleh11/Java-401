import java.util.Arrays;
import java.util.Scanner;

public class GraphicsManager2_oanton3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GraphicsManager2_oanton3 GM = new GraphicsManager2_oanton3();
		GM.createArray();
		Polygon2 poly = GM.getInput();
		GM.typesearch();
		Polygon2 poly2 = GM.getInput();
	
		
		
		
    }
	private Polygon2[] shapes;
	private Polygon2[] p;
	private int asize2;


	
	Polygon2 createArray() {
		Scanner in = new Scanner(System.in);		
		System.out.print("Please choose # of Polgons, thank you!   ");
		asize2 = in.nextInt();
		p = new Polygon2[asize2];
		return null;
	}
	
	 Polygon2 getInput() {
		Scanner in2 = new Scanner(System.in);
		System.out.print("Please choose out of the following create, type search or exit?   ");
		String Variable1 = in2.next();
		
		{switch(Variable1) {
		case "create":
			shapes[asize2] = new Polygon2(create());
			return shapes[asize2];
			
		case "type search":
			shapes[asize2] = new Polygon2(typesearch());
			return shapes[asize2];
		
		case "exit":
			System.exit(0);
			break;
				
		}
		}
		return Polygon2();
	 }
	 

	private Polygon2 Polygon2() {
		return null;
	}

	Polygon2 create() {
		Polygon2 shapes = new Polygon2();
		for(int t = 1; t<= asize2; t++)
		{
			Scanner in3 = new Scanner (System.in);
			System.out.println("What number of sides does your polygon"+(t)+ " need?");
			shapes.setSides(in3.nextInt());
			System.out.println("Side Polygons# " + (t) + " has is " + shapes.getSides());	

		}
		return shapes;
		
		}
	
	Polygon2 typesearch() {
		Polygon2 shapes = new Polygon2();
		if(shapes == null || shapes.equals(0))
		{
		System.out.println("No Polygon2's to view!");
		}
		else	
		{Scanner in4 = new Scanner(System.in);		
		System.out.print("Number of sides?   ");
		shapes.setGroups(in4.nextInt());
		System.out.println("Number of groups set is " + shapes.getGroups());	
		}
		return shapes;
	}
		
		


    
}
    
// class Polygon2 {
	//private int id,sides,groups;

	
	
	
class Polygon2 {
	private int id,sides,groups;

	
	Polygon2(){
		sides = 0;
		groups = 0;
	}
	
	Polygon2(Polygon2 test){

		this.sides = test.getSides();
		this.groups = test.getGroups();
	}
	
	void setSides(int sides){
		this.sides = sides;
	}
	
	int getSides(){
		return this.sides;
	}
	

	void setGroups(int groups){
		this.groups = groups;
	}
	
	int getGroups(){
		return this.groups;
	}
	

}