
public class WebSeries {

	public static void main(String[] args) {
		WebSeries ws=new WebSeries();
		ws.setStrangersthings("twisted");
		System.out.println(ws.watching());
	}


private  String Strangersthings;
private String Scam1992;
public WebSeries(){
	Strangersthings="twist";
	Scam1992="banking robber";
}
public String watching(){
	if(Strangersthings.equals("twisted")) {
		return"mixed with horror";
	}
	else {
		 return"banking robbery by big bull";
	}
}
public String getStrangersthings() {
	return Strangersthings;
}
public void setStrangersthings(String strangersthings) {
	Strangersthings = strangersthings;
}
public String getScam1992() {
	return Scam1992;
}
public void setScam1992(String scam1992) {
	Scam1992 = scam1992;
}
}
