package com.Training;

class Methods{
	
	int a;
	int b;
	int sum;
	float mul;
	float div;
	static int mod;
	//instance method 
	void initialize()
	{
		a=10;
		b=20;	
	}
	//Without Return Type and Argument
	void Woutrearg()
	{
		initialize(); 
		sum=a+b;
		System.out.println("Addition is "+sum);
	}
	//With Argument and Without Return type
	void Witharg(int c , int d)
	{
		mul=c*d;
		System.out.println("Multiplication is "+mul);
	}
	float withrearg(float x,float y)
	{
		div=x/y;
		return div;
	}
		
	static int Withrearg(int p,int q)
	{
	mod=p%q;
	return mod;
	}
	static void  Printmethod()
	{
	int ret=Withrearg(50,10);
	System.out.println("Mod is  "+ret );
	}
	
     }

public class Jpr21 {

	
	public static void main(String[] args)

	Methods obj = new Methods();
	obj.Woutrearg();
	obj.Witharg(65,12);
	float retdiv=obj.withrearg(52,3);
	System.out.println("Division is "+retdiv);
	Methods.Printmethod();
	
	
		

	}

}
