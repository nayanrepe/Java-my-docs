public class ComplexNum {
	double real,img;
	

	public ComplexNum(double real, double img) {
		super();
		this.real = real;
		this.img = img;
	}
	public static ComplexNum sum( ComplexNum c1, ComplexNum c2)
	{
		ComplexNum temp =new ComplexNum(0,0);
		temp.real=c1.real+ c2.real;
		temp.img=c1.img+c2.img;
		return temp;
		
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ComplexNum c1=new ComplexNum(1,2); //real part
		ComplexNum c2=new ComplexNum(1,2);  //Imaginary part
		ComplexNum temp=sum(c1,c2);			//addition
		System.out.println("sum is:"+temp.real+"+"+temp.img+"i");
		

	}

}
