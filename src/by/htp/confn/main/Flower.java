package by.htp.confn.main;

public abstract class Flower {

	private String flowerType;

	public Flower (String flowerType) {
		this.flowerType = flowerType;
	}
	public String getFlowerType() {
		return flowerType;
	}
	public void setFlowerType(String flowerType) {
		this.flowerType = flowerType;
	}
}
