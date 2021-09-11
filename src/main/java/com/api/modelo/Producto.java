package com.api.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="producto", catalog="apiboot", schema="")
public class Producto {
	

			
			  @Id
			  @Column
			  private int Id;
			  @Column
			  private String producto;
			  @Column
			  private Float precio;
			  
			public int getId() {
				return Id;
			}
			public void setId(int id) {
				Id = id;
			}
			public String getProducto() {
				return producto;
			}
			public void setProducto(String producto) {
				this.producto = producto;
			}
			public Float getPrecio() {
				return precio;
			}
			public void setPrecio(Float precio) {
				this.precio = precio;
			}
			
			  

}
