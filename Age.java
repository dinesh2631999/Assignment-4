package homework;

//checking age>18

public class Age {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//member variable
		
		int correct=18;
		int s1_age=21;
		int s2_age=17;
		
		//using relational operator
		
		boolean c=s1_age>correct;
		boolean c1=s2_age>correct;
		
		System.out.println("s1_age = "+c +"  s2_age = "+c1);

	}

}
