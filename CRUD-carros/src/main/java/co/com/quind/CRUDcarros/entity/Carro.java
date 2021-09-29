package co.com.quind.CRUDcarros.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="carros")
public class Carro implements Serializable{

	/*
	public Carro(String marca, String modelo, String color, String placa, String tipo, String fechaModelo) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.color = color;
		this.placa = placa;
		this.tipo = tipo;
		this.fechaModelo = fechaModelo;
	}*/

	private static final long serialVersionUID = 1145827382100494118L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	


	@Column(length =50)
	private String marca;
	
	@Column(name = "modeloCarro",nullable = false, length = 20 )
	private String modelo;
	
	@Column(length =50)
	private String color;
	
	
	private String placa;
	
	@Column(length =50)
	private String tipo;

	private String fechaModelo;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getFechaModelo() {
		return fechaModelo;
	}

	public void setFechaModelo(String fechaModelo) {
		this.fechaModelo = fechaModelo;
	}
	
	
	
	
	
	
}
