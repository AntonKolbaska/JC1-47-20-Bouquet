package by.htp.confn.main;

import java.util.ArrayList;


//в интерфейсы пока не лез, но, насколько я помню, лучше бы было сделать интерфейс с описанием методов и потом public class Bouquet implemets IBouquet...
public class Bouquet {

	private ArrayList<Flower> bouquet = new ArrayList<>();

	public Bouquet() {
	};

	public ArrayList<Flower> getBouquet() {
		return this.bouquet;
	};

	public void addFlower(Flower flower) {
		this.bouquet.add(flower);
	};
}
