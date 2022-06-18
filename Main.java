import java.util.Scanner;


class marksheet{
	private int mark1;
	private int mark2;
	private int mark3;
	/**
	 * @param mark1
	 * @param mark2
	 * @param mark3
	 */
	
	public marksheet(int mark1, int mark2, int mark3) {
		super();
		this.mark1 = mark1;
		this.mark2 = mark2;
		this.mark3 = mark3;
	}
	
	
	public void totalMarks() {
		double markstotal = (this.mark1+this.mark2+this.mark3);
		System.out.println("total marks of the student is: " + markstotal);
	}
	public void average () {
		float avg = ((this.mark1+this.mark2+this.mark3)/3);
		System.out.println(" average of the student is :" + avg);
	}
}
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		marksheet ms1= new marksheet(88, 99, 78) ;
			ms1.totalMarks();
			ms1.average();
			marksheet ms2 = new marksheet(76,88,78);
			ms2.totalMarks();
			ms2.average();
			
			String name;
			Scanner nm = new Scanner(System.in);
			name = nm.next();
			System.out.println("supervisor name :  " + name);

	}

}
