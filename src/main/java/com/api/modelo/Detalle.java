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
@Table(name="detalle", catalog="apiboot", schema="")
public class Detalle {
	/**
	 * mapeo de los campos de la tabla
	 */
	
	@Id
	@Column
	
	private Integer no_registro;
	@Column
	private Integer id_producto;
	@Column
	private Integer id_factura;
	public Integer getNo_registro() {
		return no_registro;
	}
	public void setNo_registro(Integer no_registro) {
		this.no_registro = no_registro;
	}
	public Integer getId_producto() {
		return id_producto;
	}
	public void setId_producto(Integer id_producto) {
		this.id_producto = id_producto;
	}
	public Integer getId_factura() {
		return id_factura;
	}
	public void setId_factura(Integer id_factura) {
		this.id_factura = id_factura;
	}
	
	
	
	
}