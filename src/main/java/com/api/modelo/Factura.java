package com.api.modelo;

import java.sql.Date;

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
@Table(name="fatura", catalog="apiboot", schema="")
public class Factura {
	/**
	 * mapeo de los campos de la tabla
	 */
	
	@Id
	@Column
	
	private Integer id;
	@Column
	private Integer id_cliente;
	@Column
	private Date fecha;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getId_cliente() {
		return id_cliente;
	}
	public void setId_cliente(Integer id_cliente) {
		this.id_cliente = id_cliente;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	
	
	
	
	
	
	
	

}