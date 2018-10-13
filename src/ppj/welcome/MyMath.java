package ppj.welcome;

public class MyMath {

	public static final double PI = 3.14159265358979;
	
	public static int silnia(int val) {
		if(val == 1)
			return 1;
		return(val * silnia(val - 1));
	}
}
