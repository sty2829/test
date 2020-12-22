package test19;

public class Excute {
	static void volumeControl(Volume v,int type) {
		if(type==1) {
			v.up();
		}else if(type==2) {
			v.down();
		}else {
			v.mute();
		}
	}
	public static void main(String[] args) {
		MobilePhone mobilePhone = new MobilePhone();
		mobilePhone.up();
	}
}
