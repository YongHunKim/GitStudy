
public class Exercise4_5 {
	public static void main(String[] args) {
		/*for(int i=0; i<=10; i++) {
			for(int j=0; j<=i; j++)
				System.out.print("*");
			System.out.println();
		}*/
		
		int i = 0;
		while(true){
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			if(i>=10){
				break;
			}
			i++;
			System.out.println("");
		}
	}
}
