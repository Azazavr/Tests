import java.util.Scanner;

public class b {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
	System.out.println("Введите сумму покупки: ");
	String s=sc.nextLine();
	int x=Integer.parseInt(s);
	
	
	int a=((x/200)%5); //0.99

	System.out.println(a);

	switch (a){
	case 0:
		System.out.println("Скидка = 0");
		break;
		
	case 1:
		System.out.println("Скидка = 3%");
		break;
	
	case 2:
		System.out.println("Скидка = 5%");
		break;
		
	case 3:
		System.out.println("Скидка = 7%");
		break;
	
	case 4:
		System.out.println("Скидка = 7%");
		break;

	}
	
	}
}