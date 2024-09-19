package myProject;


public class Samsung extends SmartPhone implements Fingerprint{
	String 삼성페이;
	
	public Samsung(int 볼륨, String 모델명, String 색상, String 삼성페이) {
		super(볼륨, 모델명, 색상);
		this.삼성페이 = 삼성페이;
	}

	@Override
	void 전원켜기() {
		System.out.println("삼성이 나타나면서 전원이 켜졌다.");
	}

	@Override
	void 전원끄기() {
		System.out.println("삼성이 나타나면서 전원이 꺼졌다.");
	}

	@Override
	void set볼륨(int 볼륨) {
		this.볼륨 = 볼륨;
		System.out.println(모델명+ " 볼륨: "+볼륨);
	}
	
	void 삼성페이(String 삼성페이) {
		if (this.삼성페이.equals(삼성페이)) {
			System.out.println("결제되었습니다.");
		} else {
			전원끄기();
		}
	}
}

