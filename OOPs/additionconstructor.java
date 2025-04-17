package OOPs;

class addition {
	static void add(int a,int b) {//static method
		int c = a+b;
		System.out.println(c+" two-number addition");
	}

	void add(int a, int b,int c) {//non-static method
		int d=a+b+c;
		System.out.println(d+" three-number addition");
	}

	public static void main(String[] args) {
	    addition.add(2,3);
	    //object (with the class name) created to call the non-static object
	    addition obj = new addition();//default constructor created
	    obj.add(1,2,3);

	}
}
