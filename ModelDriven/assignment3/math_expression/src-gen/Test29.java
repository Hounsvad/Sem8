/* 
 * Generated by xtend by the generator made by 'Frederik Alexander Hounsvad' 'frhou18@student.sdu.dk'
 * All Rights reserved
*/
package math_expression;
public class Test29{
	public int x;
	public int y;
	
	private External external;
	
	public Test29(External external){
		this.external = external;
	}
		
	public interface External{
		public int pow(int n, int m);
	}
	
	public void compute(){
		x = ((external.pow(4,2)));
		y = (((((external.pow(4,2)))) - 2));
	}
	
}
