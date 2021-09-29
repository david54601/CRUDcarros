package co.com.quind.CRUDcarros.controller;



import static org.mockito.Mockito.*;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;

import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import co.com.quind.CRUDcarros.entity.Carro;
import co.com.quind.CRUDcarros.repository.ICarroRepository;
import co.com.quind.CRUDcarros.service.CarroInterfaceServiceIplementacion;

@RunWith(MockitoJUnitRunner.class)
class CarroControllerTest {
	
	/*
	@Autowired
	public ICarroRepository carroRepository;*/

	
	
	@InjectMocks //dependiente
	//CarroInterfaceServiceIplementacion servicio1= new CarroInterfaceServiceIplementacion();
	CarroController implementa;
	//CarroController implementa=new CarroController();
	//Carro servicio1;

	
	 //dependencia
	@Mock
	 public CarroInterfaceServiceIplementacion servicio1= new CarroInterfaceServiceIplementacion();
	// @Mock
	// public ICarroRepository carroRepository = new ICarroRepository;
	// public  ICarroRepository carroRepository;(
	// public ICarroRepository carroRepository;
//	 public CarroController implementa;
	//private CarroController implementa;
	//private CarroInterfaceServiceIplementacion implementa= new CarroInterfaceServiceIplementacion();
	// private CarroInterfaceServiceIplementacion implementa;
	 
	@Test
	void testCreate() {
		
		
		//when(servicio1.save(carro))
		//Carro carro =new Carro("hola","azul","1945","otro","wqe15","autommovil");
		
		//CarroInterfaceServiceIplementacion servicio = new CarroInterfaceServiceIplementacion();
		
		
		Carro carro= new Carro();
		//Carro carro= new Carro("sdd0","sdsd","sdsdads","sdsdsdsd","asasas","sddad");
		
	
		carro.setMarca("hola");
		carro.setColor("azul");
		carro.setFechaModelo("1945");
		carro.setModelo("otro");
		carro.setPlaca("wqe15");
		carro.setTipo("autommovil");
		
		//System.out.println("el valor del carro es "+ servicio1.save(carro));
		
		//System.out.println("El resultadoo es "+servicio1.save(carro) );
		when(implementa.create(servicio1.save(carro))).equals(carro);
		//when(implementa.create(servicio1.save(carro))).thenReturn(carro, carro);
		//.thenAnswer(HttpStatus.CREATED);
		//System.out.println("el resultado del carro es "+servicio.save(carro));  
	
		
		//assertEquals(carro,  implementa.save(carro));
		//Carro numero = servicio.save(carro);
		
		//assertTrue(ResponseEntity.status(HttpStatus.CREATED).body(servicio.save(carro)) != null);
		//assertEquals(1,ResponseEntity.status(1).body(servicio.save(carro)));
		//return ResponseEntity.status(HttpStatus.CREATED).body(servicio.save(carro));
		//
		 
		//assertEquals(carro, numero);
		
		
	}
	   /*

	@Test
	void testRead() {
		fail("Not yet implemented");
	}

	@Test
	void testUpdate() {
		fail("Not yet implemented");
	}

	@Test
	void testDelete() {
		fail("Not yet implemented");
	}

	@Test
	void testReadAll() {
		fail("Not yet implemented");
	}*/

}
