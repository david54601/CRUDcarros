package co.com.quind.CRUDcarros.controller;

import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

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

import co.com.quind.CRUDcarros.entity.Carro;
import co.com.quind.CRUDcarros.service.CarroInterfaceServiceIplementacion;

@RestController
@RequestMapping("/ap/carros")
public class CarroController {
	
	
	@Autowired
	private CarroInterfaceServiceIplementacion CarroService;
	
	//agregar carro  
	@PostMapping
	public ResponseEntity<Carro> create(@RequestBody Carro carro){
		//System.out.println("el restorna es " + CarroService.save(carro));
		return ResponseEntity.ok(CarroService.save(carro));
		//return new ResponseEntity<Carro>("agregado",HttpStatus.CREATED)
		//return ResponseEntity.status(HttpStatus.CREATED).body(CarroService.save(carro));
		
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<?> read(@PathVariable(value ="id") Long carroId){
		Optional <Carro> optionalCarro =CarroService.findById(carroId);
		if(!optionalCarro.isPresent()) {
			return ResponseEntity.notFound().build();
		}
			return ResponseEntity.ok(optionalCarro);		
			
	}
	//actulizar usuario
	@PutMapping("/{id}")
	public ResponseEntity<?> update (@RequestBody Carro carroBuscado, @PathVariable(value="id") Long carroId ){
		Optional<Carro> carro= CarroService.findById(carroId);
		if(!carro.isPresent()) {
			return ResponseEntity.notFound().build();
			}
		carro.get().setMarca(carroBuscado.getMarca());
		carro.get().setColor(carroBuscado.getColor());
		carro.get().setFechaModelo(carroBuscado.getFechaModelo());
		carro.get().setPlaca(carroBuscado.getPlaca());
		carro.get().setModelo(carroBuscado.getModelo());
		carro.get().setTipo(carroBuscado.getTipo());
	
		return ResponseEntity.status(HttpStatus.CREATED).body(CarroService.save(carro.get()));
		
	}
	
	//borrar carro
	@DeleteMapping("/{id}")
	public ResponseEntity<?> delete (@PathVariable (value ="id") Long carroId){
		
		
		if(!CarroService.findById(carroId).isPresent()) {
			return ResponseEntity.notFound().build();
			}
		CarroService.deleteById(carroId);
		return ResponseEntity.ok().build();
		
	}
	
	
	//lista Carros
	
	@GetMapping
	public java.util.List<Carro> readAll() {
		
		java.util.List<Carro> carros=StreamSupport
				.stream(CarroService.findAll().spliterator(), false)
				.collect(Collectors.toList());
		
		return carros;
	}
	
	
	
	
	
	

}
