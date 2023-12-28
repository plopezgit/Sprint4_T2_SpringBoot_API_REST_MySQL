package cat.itacademy.barcelonactiva.cognoms.nom.s04.t02.n02.controller;

import java.rmi.ServerException;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cat.itacademy.barcelonactiva.cognoms.nom.s04.t02.n02.domain.Fruit;
import cat.itacademy.barcelonactiva.cognoms.nom.s04.t02.n02.service.FruitService;

@RestController
@RequestMapping("fruits")
public class FruitController {
	
	@Autowired
	private FruitService fruitService;
	
	@PostMapping
	public ResponseEntity<Fruit> createFruit (@RequestBody Fruit fruit ) throws ServerException {
		Fruit newFruit = fruitService.createFruit(fruit);		
		if (newFruit == null) {
			throw new ServerException("There is server exception error, please try again later.");
		} else {
			return new ResponseEntity<>(newFruit, HttpStatus.CREATED);

		}
		
	}
	
	@PutMapping("{id}")
	public ResponseEntity<Fruit> updateFruit (@PathVariable int id, @RequestBody Fruit fruit) {
		Fruit thisFruit = fruitService.getOneFruitById(id);
		thisFruit.setName(fruit.getName());
		thisFruit.setKilos(fruit.getKilos());
		
		Fruit updatedFruit = fruitService.createFruit(thisFruit);
		
		return new ResponseEntity<>(updatedFruit, HttpStatus.ACCEPTED);
		
	}
	
	@DeleteMapping ("{id}")
	public ResponseEntity<HashMap<String, Boolean>> deleteFruit (@PathVariable int id) {
		fruitService.deleteFruit(id);
		
		HashMap<String, Boolean> fruitDeletedState =  new HashMap<String, Boolean>();
		fruitDeletedState.put("Deleted", true);
		
		return ResponseEntity.ok(fruitDeletedState);
	
	}
	
	@GetMapping ("{id}")
	public ResponseEntity<Fruit> getOneFruitByID (@PathVariable int id) {
		Fruit thisFruit = fruitService.getOneFruitById(id);
		return ResponseEntity.ok(thisFruit);
	}
	
	@GetMapping
	public ResponseEntity<List<Fruit>> getAllFruits () {
		return ResponseEntity.ok(fruitService.getAllFruits());
	}
	
}
