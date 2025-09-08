package Expected_programs;


//tc and sc both are O(1);

public class swapValuesWithout3rd {
	public static void main(String[] args) {
		int a = 5;
        int b = 3;
        System.out.println("Before swapping: a = " + a + ", b = " + b);
        
        a=a^b;
        b=a^b;
        a=a^b;

        System.out.println("After swapping: a = " + a + ", b = " + b);

	}
}
