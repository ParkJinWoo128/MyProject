package myProject;


public class Iphone extends SmartPhone {
	String 얼굴정보;
	
	public Iphone(int 볼륨, String 모델명, String 색상, String 얼굴정보) {
		super(볼륨, 모델명, 색상);
		this.얼굴정보 = 얼굴정보;
	}

	@Override
	void 전원켜기() {
		// TODO Auto-generated method stub
		System.out.println("사과가 나타나면서 전원이 켜졌다.");
	}

	@Override
	void 전원끄기() {
		// TODO Auto-generated method stub
		System.out.println("사과가 나타나면서 전원이 꺼졌다.");
	}

	@Override
	void set볼륨(int 볼륨) {
		this.볼륨 = 볼륨;
		System.out.println(모델명+" 볼륨: "+볼륨);
	}
	
	void 얼굴인식(String 얼굴정보) {
		if (this.얼굴정보.equals(얼굴정보)) {
			System.out.println("잠금해제");
		} else {
			전원끄기();
		}
	}
}
