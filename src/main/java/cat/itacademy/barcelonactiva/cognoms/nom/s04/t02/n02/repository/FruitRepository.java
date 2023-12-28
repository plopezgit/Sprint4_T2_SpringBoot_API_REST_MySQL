package cat.itacademy.barcelonactiva.cognoms.nom.s04.t02.n02.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import cat.itacademy.barcelonactiva.cognoms.nom.s04.t02.n02.domain.Fruit;

public interface FruitRepository extends JpaRepository<Fruit, Integer> {

}
