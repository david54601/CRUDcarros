package co.com.quind.CRUDcarros.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import co.com.quind.CRUDcarros.entity.Carro;

@Repository
public interface ICarroRepository extends JpaRepository<Carro, Long>{	

}
