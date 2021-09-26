
public class SmartPhone {

	public static void main(String[] args) {
		SmartPhone phone=new SmartPhone();
		phone.setScreenlock("open");
		phone.setZoommeeting("started");
		System.out.println(phone.meeting());
			
		}
		
		public String meeting() {
			if(screenlock.equals("closed")&&Zoommeeting.equals("not started")) {
				 return"meeting not yet started";
			}
			else
			{
				return"meeting started";
				
			}
			
			
		
	}


private String screenlock;
private String Zoommeeting;
public String getScreenlock() {
	return screenlock;
}
public void setScreenlock(String screenlock) {
	this.screenlock = screenlock;
}
public String getZoommeeting() {
	return Zoommeeting;
}
public void setZoommeeting(String zoommeeting) {
	Zoommeeting = zoommeeting;
}
}