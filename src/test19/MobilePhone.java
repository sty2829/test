package test19;

public class MobilePhone implements Volume {
	int volume;
	
	@Override
	public void up() {
		System.out.println("현재 볼륨 : " + (++volume));
	}

	@Override
	public void down() {
		System.out.println("현재 볼륨 : " + (--volume));
	}

	@Override
	public void mute() {
		volume = 0;
		System.out.println("현재 볼륨 : " + volume);
	}

	
}
