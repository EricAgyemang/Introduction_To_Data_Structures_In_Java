package recursion;

public class Mystery {
	static int mystryFunc(int num1, int num2) {
		if(num1==0)
			return num2;
		else
			return mystryFunc(num1/10, num2*10+num1%10);
	}

	public static void main(String[] args) {
		int ans = mystryFunc(1234, 0);
		System.out.println(ans);

	}

}
