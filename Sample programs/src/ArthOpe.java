
public class ArthOpe {

	int a=40;
	int b=20;
    int c;
	public static void main(String args[]) {
		
		System.out.println(add(20,30));
		System.out.println(sub(10,30));
		System.out.println(mul(40,25));
		System.out.println(div(30,30));
		System.out.println(mod(20,30));
		
	}
	
	public static int add(int a,int b)
	{
	return a+b;
	}
	public static int sub(int a,int b)
	{
	return a-b;
	}
	public static int mul(int a,int b)
	{
	return a*b;
	}
	public static int div(int a,int b)
	{
	return a/b;
	}
	public static int mod(int a,int b)
	{
	return a%b;
	}

	
	
}