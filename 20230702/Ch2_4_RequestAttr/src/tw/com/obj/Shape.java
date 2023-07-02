package tw.com.obj;

public class Shape {
	private float height;
	private float width;
	public Shape(float height, float width) {
		super();
		this.height = height;
		this.width = width;
	}
	public float getHeight() {
		return height;
	}
	public void setHeight(float height) {
		this.height = height;
	}
	public float getWidth() {
		return width;
	}
	public void setWidth(float width) {
		this.width = width;
	}
	@Override
	public String toString() {
		return "Shape [height=" + height + ", width=" + width + "]";
	}
	
	
}
