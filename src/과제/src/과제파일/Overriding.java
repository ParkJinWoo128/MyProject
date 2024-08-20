package 과제파일;
public class Overriding {
	void sound() {
		System.out.println("동물소리");
	}
}

class Dog extends Overriding {
	@Override
	void sound() {
		System.out.println("멍멍");
	}
}

class Cat extends Overriding {
	@Override
	void sound() {
		System.out.println("야옹");
	}
}