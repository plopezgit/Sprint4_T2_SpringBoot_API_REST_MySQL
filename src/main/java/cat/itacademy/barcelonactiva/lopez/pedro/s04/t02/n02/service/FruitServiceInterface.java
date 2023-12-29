package cat.itacademy.barcelonactiva.lopez.pedro.s04.t02.n02.service;

import java.util.List;

import cat.itacademy.barcelonactiva.lopez.pedro.s04.t02.n02.domain.Fruit;
import cat.itacademy.barcelonactiva.lopez.pedro.s04.t02.n02.exception.FruitEmptyException;
import cat.itacademy.barcelonactiva.lopez.pedro.s04.t02.n02.exception.FruitNoFoundException;

public interface FruitServiceInterface {
	
	public Fruit createFruit (Fruit fruit) throws FruitEmptyException;
	public void deleteFruit (int id) throws FruitNoFoundException;
	public Fruit getOneFruitById (int id) throws FruitNoFoundException;
	public List<Fruit> getAllFruits ();
}
