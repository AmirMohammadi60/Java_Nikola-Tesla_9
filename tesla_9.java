import java.util.Iterator;

public class tesla_9 {

	public static void main(String[] args) {
		System.out.println("=======================");
	for(int i = 1; i <= 11; i++) {
		
		System.out.print(i+"x"+9+"-->"+i*9);
		if((i*9)== 9) {
			System.out.print("-->"+9);
		}else {
			if(calculateDigitSum(i*9) == 9) {
			System.out.print("-->"+((i*9)/10)+"+"+(i*9)%10+"-->"+ calculateDigitSum(i*9));
			}else {
				System.out.print("-->"+((i*9)/10)+"+"+(i*9)%10+"-->"+ calculateDigitSum(i*9)+"-->"+
			                    (calculateDigitSum(i*9)/10)+"+"+calculateDigitSum(i*9)%10+"-->"
			                     +calculateDigitSum(calculateDigitSum(i*9)));
			}
		}
		System.out.println();
	}
     
    }
	
	 //Checksum
	 public static int calculateDigitSum(int number) {
	        int sum = 0;
	        int digit;
	        while (number != 0) {
	        	digit = number % 10;
	            sum += digit;
	            number /= 10;
	        }

	        return sum;
	  }
	
	
}

