package myProject;



public class Main {
	
	public static void main(String[] args) {
		SmartPhone[] 폰가방 = {
				new Iphone(50, "아이폰14", "화이트", "민준이얼굴"),
				new Samsung(100, "S24", "블랙", "한결이카드")
		};
		
		for(SmartPhone s : 폰가방) {
			s.자기소개();
			s.전원켜기();
			s.set볼륨(100);
		}
	}
}

