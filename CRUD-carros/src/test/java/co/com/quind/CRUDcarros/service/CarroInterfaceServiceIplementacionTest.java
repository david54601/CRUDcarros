package co.com.quind.CRUDcarros.service;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.http.HttpStatus;

import co.com.quind.CRUDcarros.entity.Carro;

import org.mockito.InjectMocks;
import org.mockito.Mock;
import static org.mockito.Mockito.*;




@RunWith(MockitoJUnitRunner.class)
class CarroInterfaceServiceIplementacionTest {
	
	@InjectMocks
	CarroInterfaceServiceIplementacion imple = new CarroInterfaceServiceIplementacion();
	
	
	@Mock
	private ICarroService service;
	

	
	@Test
	void testSave() {
		Carro carro= new Carro();
		
		
		
		carro.setMarca("hola");
		carro.setColor("azul");
		carro.setFechaModelo("1945");
		carro.setModelo("otro");
		carro.setPlaca("wqe15");
		carro.setTipo("autommovil");
		
		
		when(imple.save(carro)).equals(HttpStatus.OK);
		
	}

	@Test
	void testFindAll() {
		fail("Not yet implemented");
	}

	@Test
	void testFindAl() {
		fail("Not yet implemented");
	}

	@Test
	void testFindById() {
		fail("Not yet implemented");
	}

	

	@Test
	void testDeleteById() {
		fail("Not yet implemented");
	}

}
