package cat.itacademy.barcelonactiva.cognoms.nom.s04.t02.n02.domain;

import java.io.Serializable;

import jakarta.persistence.*;

@Entity
//@Table(name = "fruit")
public class Fruit implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	//@Column(name="id")
	private int id;
	//@Column(name="name")
	private String name;
	//@Column(name="kilograms")
	private int kilograms;
	
	public Fruit() {
		
	}

	public Fruit(String name, int kilos) {
		this.name = name;
		this.kilograms = kilos;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKilos() {
		return kilograms;
	}

	public void setKilos(int kilos) {
		this.kilograms = kilos;
	}

	@Override
	public String toString() {
		return "Fruit [id=" + id + ", name=" + name + ", kilos=" + kilograms + "]";
	}

}
