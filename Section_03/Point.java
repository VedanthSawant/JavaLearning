package Section_03;

public class Point {
	private int x;
	private int y;
	
	public Point() {
		
	}
	
	public Point(int x, int y) {
		setX(x);
		setY(y);
	}
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	public void setX(int x) {
		this.x = x;
	}
	
	public void setY(int y) {
		this.y = y;
	}
	
	public double distance() {
		double dist = Math.sqrt((Math.pow(x - 0, 2)) + (Math.pow(y - 0, 2)));
		return dist;
	}
	
	public double distance(Point other) {
		double dist = Math.sqrt((Math.pow(other.x - this.x, 2)) + (Math.pow(other.y - this.y, 2)));
		return dist;
	}
	
	public double distance(int x, int y) {
		double dist = Math.sqrt((Math.pow(this.x - x, 2)) + (Math.pow(this.y - y, 2)));
		return dist;
	}
}
