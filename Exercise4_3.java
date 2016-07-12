
public class Exercise4_3 {
	public static void main(String[] args) {
		int sum = 0;
		int num = 0;
		
		/*for(int i=1;true; i++, s=-s) { // 매 반복마다 s의 값은 1, -1, 1, -1...
			num = s * i; // i와 부호(s)를 곱해서 더할 값을 구한다.
			sum += num;
			if(sum >=100) // 총합이 100보다 같거나 크면 반복문을 빠져 나간다.
				break;
		}*/
		
		while(true){
			if(num%2 == 0){
				sum -= num;
			}else{
				sum += num;
			}
			if(sum>=100){
				break;
			}			
			num++;
		}
		System.out.println("num="+num);
		System.out.println("sum="+sum);
	}
}
