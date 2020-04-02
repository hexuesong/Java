package Day7;

public class Oblong {
	private int along;
	private int wide;
	
	public int getAlong() {
		return along;
	}
	public void setAlong(int along) {
		this.along = along;
	}
	public int getWide() {
		return wide;
	}
	public void setWide(int wide) {
		this.wide = wide;
	}
	
	public int perimeter(){
		return (along+wide)*2;
		
	}
	
	public int area(){
		return along*wide;
	}
	
	
}
