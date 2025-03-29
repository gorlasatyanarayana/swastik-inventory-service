package com.swastik.service.inventory.entity;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(schema = "swastikinventory", name = "inventory_mast")
public class InventoryMastEntity  implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 4779627437692806293L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", unique = true,  nullable = false)
	private UUID id;
	
	@Column(name = "product_id")
	private UUID product_id;
		
	@Column(name = "quantity")
	private int quantity;
	
	@Column(name = "created_at")
	private LocalDateTime createdAt;
	
	@Column(name = "created_by")
	private String createdBy;

	

}
