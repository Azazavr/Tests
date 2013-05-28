public class test {
	
	public static void main(String[] args) {
		
		String name1 = "Nick";
		String name2 = "Janes";
		String name3 = "Mike";
		
//		System.out.println("Name is: " +name1);
//		System.out.println("Name is: " +name2);
//		System.out.println("Name is: " +name3);
		System.out.println("Before");
		showName(name1);
		showName(name2);
		showName(name3);
		showAge(12);
		
	}
	static void showName(String name){
		System.out.println("Name is: " + name);
		
	}
	
	static void showAge(int age){
		System.out.println("My age is: " + age);
		
	}

}