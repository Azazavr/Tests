import java.util.Scanner;

public class a{

public static void main(String[] args) {
	/*	int x=5,y=4;
	//System.out.println("Hello World");
	//System.out.println(x);
	//System.out.println("x="+x+" y="+y);
		
		double a=Math.PI;
		System.out.println(a);*/
		
		//for(int code=32;code<=127;code++)
		//System.out.println("symbol="+(char)code+" id="+code);
		
	/*	int c=97;
		System.out.println(c);
		char ch=(char)c;
		System.out.println(ch); */
		
		/* char c='?';
		System.out.println(c); */
		
//		boolean bo=(10+2)/6==3;
//		System.out.println(bo);
/*		
		int t=5; //темперптура
		if(t<=0)
		System.out.println("ICE");
		else if(t<=99)
			System.out.println("Water");
		else
			System.out.println("Vapour");	
*/	
		//--------------------
		/*
	int y=(int)(Math.random()*2013); //рандом с целым числом (*2013 максимальное значение рандома)
	System.out.println("y=" +y);
	if (y<=1240)
		System.out.println("Киевская русь");
	else if(y>=1240 && y<=1362) //(y<1240)
		System.out.println("Horde");
	else if(y>=1363 && y<=1569) //(y<1362)
		System.out.println("Lithuania");
	else if(y>=1570 && y<=1654) //(y<1569)
		System.out.println("Poland");
	else if(y>=1655 && y<=1990) //(y<1654)
		System.out.println("Russia");
	else
	System.out.println("Ukraine");
	-----------------------------------------		*/
		
/*		//вариант решения "И" &&
		int year=1938; //Пример ограниченного рандома - (Math.random() * 50 + 1900);
		if(year>=1939 && year<=1945)
			System.out.println("War");
		else
			System.out.println("Peace");
			
	-----------------------------------------	*/
		
/*		
		// вариант решения "ИЛИ" ||
		int y=1945;
		if (y<1939 || y>1945)
			System.out.println("Peace");
		else
			System.out.println("War");
*/		
		
	/*
		// хреновый вариант решения "И _ НЕ" && !
		
		int y=1946;
		if (!(y>=1939 && y<=1945))
			System.out.println("Peace");
		else
			System.out.println("WAR");
			
			*/

//--------------------------------------		
		
/*		int y=1945;
			if ((y>=1914 && y<=1918) || (y>=1939 && y<=1945))
				System.out.println("WAR");
			else
				System.out.println("Peace");
*/
		
//-----------------------------------------
/*		
		int x=(int)(Math.random()*4 + 0);
		System.out.println("X=" +x);
		switch(x)
		{
		case 0:
		System.out.println("Even");
		break;
		case 1:
			System.out.println("ODD");
		break;
		case 2:
			System.out.println("Even");
		break;
		case 3:
			System.out.println("ODD");
		break;
		case 4:
			System.out.println("Even");
		break;
		}
*/		
//----------------------------------------	
/*		
	int m=(int)(Math.random()*12 + 1);	
		System.out.println("Month #" +m);
		switch (m) {
		case 1:
		case 2:
		case 12:
			System.out.println("Зима");
		break;
		
		case 3:
		case 4:
		case 5:
			System.out.println("Весна");
		break;
		
		case 6:
		case 7:
		case 8:
			System.out.println("Лето");
		break;
		
		case 9:
		case 10:
		case 11:
			System.out.println("Осень");
		break;
		
		default:  //При вводе некорректного месяца вывод на экран сообщния об ошибке
			System.out.println("Неверный ввод месяца");
		break;
		}
*/
		
//-------------------------------------
/*		
		char ch=(char)((int)(Math.random()*100)); //a,o,u,i,e,y
		System.out.println("Char=" +ch + " " +(int)ch);
		switch (ch)
		{
		case 'a':
		case 'o':
		case 'u':
		case 'i':
		case 'e':
		case 'y':
			System.out.println("Гласная");
		break;
		default:
			System.out.println("Не гласная");
		break;
		
		}
*/
		//--------------------------------------------
		
		
/*		char ch='a'; //a,o,u,i,e,y
		if (ch=='a' || ch=='o' || ch=='u' || ch=='i' || ch=='e' || ch=='y')
			System.out.println("Гласная");
		else
			System.out.println("Не гласная");
*/

	//ДЗ	
		
/*		int a,b,c;
		a=5;
		b=3;
		c=b;
		b=a;
		a=c;
		System.out.println("Значение а= " +a);
		System.out.println("Знеачение b= " +b);
*/
		
//----------------------------
		
/*		int a,b;
		a=8;
		b=12;
		
		 a = a+b;
		 b = a-b;
		 a = a-b;
		
		System.out.println("Значение а= " +a);
		System.out.println("Знеачение b= " +b);
		
*/
	
int x=1;
/*if(x==0)
	System.out.println("равно 0");
else 
	System.out.println("не равно 0");
*/
System.out.println((x==0)?"равно 0":"не равно 0");
	
/*	public static void main(String[] args) {
		Scanner yura = new Scanner(System.in);
		System.out.println(yura.nextLine());
*/	
}

}


