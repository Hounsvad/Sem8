/* 
 * Generated by xtend by the generator made by 'Frederik Alexander Hounsvad' 'frhou18@student.sdu.dk'
 * All Rights reserved
*/
package math_expression;
public class Test34{
	public int sideA;
	public int sideB;
	public int sideC;
	public int perimeterTriangle;
	public int radius;
	public int perimeterCircle;
	
	private External external;
	
	public Test34(External external){
		this.external = external;
	}
		
	public interface External{
		public int pow(int n, int m);
		public int sqrt(int n);
		public int pi();
	}
	
	public void compute(){
		sideA = ((3));
		sideB = ((4));
		sideC = ((((external.sqrt(((((external.pow((((3))),(2))))) + (((external.pow((((4))),(2)))))))))));
		perimeterTriangle = ((((((3))) + (((4)))) + (((((external.sqrt(((((external.pow((((3))),(2))))) + (((external.pow((((4))),(2))))))))))))));
		radius = ((5));
		perimeterCircle = (((((((2) * (((5)))))) * (external.pi()))));
	}
	
}