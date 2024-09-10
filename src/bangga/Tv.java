package bangga;

//당신은 전자기기 제어 소프트웨어를 개발하는 회사에서 일하고 있습니다.
//회사는 다양한 TV 모델을 지원하는 유니버설 리모컨 소프트웨어를 개발하려고 합니다.
//이 유니버설 리모컨은 삼성 TV와 LG TV를 포함한 다양한 TV 모델을
//제어할 수 있어야 하며,한 번에 하나의 TV만 리모컨과 페어링될 수 있습니다.
public interface Tv {
	
	String tvNameCheck();
	boolean tvPowerOn();
	boolean tvPowerOff();
	int tvChannalChange();
	int tvChannalCheck();
	
}

