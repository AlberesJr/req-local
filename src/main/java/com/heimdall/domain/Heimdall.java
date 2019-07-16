package com.heimdall.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Heimdall implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private String equipamentoNome;
	private String city;
	private String statusMessage;
	private String imagem;
	private String color;
	private String equipamentoEndereco;
	private String placa;
	private String state;
	private String modelYear;
	private String senha;
	private String model;
	private String dataS;

    public Heimdall() {
    	
    }

	public Heimdall(Integer id, String equipamentoNome, String city, String statusMessage, String imagem, String color,
			String equipamentoEndereco, String placa, String state, String modelYear, String senha, String model,
			String dataS) {
		super();
		this.id = id;
		this.equipamentoNome = equipamentoNome;
		this.city = city;
		this.statusMessage = statusMessage;
		this.imagem = imagem;
		this.color = color;
		this.equipamentoEndereco = equipamentoEndereco;
		this.placa = placa;
		this.state = state;
		this.modelYear = modelYear;
		this.senha = senha;
		this.model = model;
		this.dataS = dataS;
	}

	
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getEquipamentoNome() {
		return equipamentoNome;
	}

	public void setEquipamentoNome(String equipamentoNome) {
		this.equipamentoNome = equipamentoNome;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getStatusMessage() {
		return statusMessage;
	}

	public void setStatusMessage(String statusMessage) {
		this.statusMessage = statusMessage;
	}

	public String getImagem() {
		return imagem;
	}

	public void setImagem(String imagem) {
		this.imagem = imagem;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getEquipamentoEndereco() {
		return equipamentoEndereco;
	}

	public void setEquipamentoEndereco(String equipamentoEndereco) {
		this.equipamentoEndereco = equipamentoEndereco;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getModelYear() {
		return modelYear;
	}

	public void setModelYear(String modelYear) {
		this.modelYear = modelYear;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getDataS() {
		return dataS;
	}

	public void setDataS(String dataS) {
		this.dataS = dataS;
	}
    
}
