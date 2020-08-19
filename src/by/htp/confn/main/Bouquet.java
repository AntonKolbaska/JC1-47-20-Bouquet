package by.htp.confn.main;

import java.util.ArrayList;


//в интерфейсы не лез пока, но, насколько я помню, лучше было бы сначала описать все методы в интерфейсе (например, IBouquet), а потом уже public class Bouquet implemets IBouquet...
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
