package iaag.test.main;

public class MainFunctions {


	//Function to calculate n!=1??2??3??...??n
	public static long fact(long n) {
        long r = 1;
        for (long i = 1; i <= n; i++) {
            r = r * i;
        }
        return r;
    }

	
	public static void main(String args[]) {
		
		System.out.print("tested ok");
		System.out.print("done");
		
	}
	
}
