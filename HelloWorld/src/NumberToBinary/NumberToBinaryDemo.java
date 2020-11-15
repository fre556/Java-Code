package NumberToBinary;

public class NumberToBinaryDemo {

	public static void main(String[] args) {
		int number = 50;
		
		System.out.print("This is the conversion\n");
		number_Conversion(number);
	}
	
	static void number_Conversion(int n) {
		int[] binary_num = new int[50];
		
		int i = 0 ;
		
		while (n>0) {
			binary_num[i] = n % 2;
			n= n /2;
			i++;
		}
		
		for (int j = i -1; j>=0;j--) {
			System.out.print(binary_num[j]);
		}
	}
	
	

}
