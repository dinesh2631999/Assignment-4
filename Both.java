package homework;

//and logical operator to check the var  should greater than both 100 and 200 

public class Both {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//member variable
		
		int n1=300;
		int n2=150;
		boolean c;
		boolean c1;
		
		//using and logical operator to relate both expressions
		c=(n1>100)&&(n1>200);
		c1=(n2>100)&&(n2>200);
		
		System.out.println("result = " +c);
		System.out.println("result = " +c1);

	}

}
