package 과제파일;
public class Main {

	public static void main(String[] args) {
		// 오버로딩
		Overloading Ol = new Overloading();
		System.out.println(Ol.add(2, 2));
		System.out.println(Ol.add(2, 4, 6));
		System.out.println(Ol.add(2.4, 2.8));
		System.out.println(Ol.add(2.2, 2.4, 2.8));
		System.out.println("==================================");
		System.out.println("==================================");
		// 오버라이딩
		Overriding OrDog = new Dog();
		Overriding OrCat = new Cat();
		OrDog.sound();
		OrCat.sound();
	}
	
}