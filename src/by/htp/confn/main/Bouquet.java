package by.htp.confn.main;

import java.util.ArrayList;


//� ���������� ���� �� ���, ��, ��������� � �����, ����� �� ���� ������� ��������� � ��������� ������� � ����� public class Bouquet implemets IBouquet...
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
