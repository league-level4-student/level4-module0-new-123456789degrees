package _04_Snake;

public class Location {
	private int x, y;
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public boolean equals(int x, int y) {
		if (this.x == x && this.y == y) {
			return true;
		}
		else {
			return false;
		}
	}
}	
