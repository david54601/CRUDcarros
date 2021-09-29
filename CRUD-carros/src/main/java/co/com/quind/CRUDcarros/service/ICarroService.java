package co.com.quind.CRUDcarros.service;

import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import co.com.quind.CRUDcarros.entity.Carro;

public interface ICarroService {
	
	public Iterable<Carro> findAll();
	
	public Page<Carro> findAl(Pageable pegeable);
	
	public Optional <Carro> findById(Long id);
	
	public Carro save(Carro carro);
	
	public void deleteById(Long id);

}
