package co.com.quind.CRUDcarros.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import co.com.quind.CRUDcarros.entity.Carro;
import co.com.quind.CRUDcarros.repository.ICarroRepository;

@Service
public class CarroInterfaceServiceIplementacion implements ICarroService {

	@Autowired
	public ICarroRepository carroRepository;
	
	
	@Override
	@Transactional(readOnly = true)
	public Iterable<Carro> findAll() {
		
		return carroRepository.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Page<Carro> findAl(Pageable pegeable) {
		
		return carroRepository.findAll(pegeable);
	}

	@Override
	@Transactional(readOnly = true)
	public Optional<Carro> findById(Long id) {
		
		return carroRepository.findById(id);
	}

	@Override
	@Transactional
	public Carro save(Carro carro) {
		
		return carroRepository.save(carro);
	}

	@Override
	@Transactional
	public void deleteById(Long id) {
		
		carroRepository.deleteById(id);
		
		
	}

}
