package headfirstpack;

public class Calculations {// access identifier,class,classname

	public int addNum(int a, int b) {// access identifier,return type,method
										// name
		// int a,b are parameters
		int sum;
		sum = a + b;
		return sum;
		//no printing of value, just returning values

	}

	public void subNum(int c, int d) {

		int sub;
		sub = c - d;
		System.out.println(sub);
	}

	public int mulNum(int e, int f) {

		int mul = e * f;
		return mul;
	}

	public int divNum(int g, int h) {

		int div = g / h;
		return div;

	}

	public int remainNum(int i, int j) {

		int remain = i % j;
		return remain;
	}
	public int calcarea(float l,float b){
		float area = l*b;
		return area;
}
