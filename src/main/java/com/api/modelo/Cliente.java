package com.api.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
/**
 * name = tableName catalog = dbName shema=null for mysql
 * @author niels
 *
 */

@Entity
@Table(name="cliente", catalog="apiboot", schema="")
public class Cliente {
	/**
	 * mapeo de los campos de la tabla
	 */
	
	@Id
	@Column
	
	private Integer id;
	@Column
	private String nombre;
	@Column
	private String apellido;
	
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	

}
