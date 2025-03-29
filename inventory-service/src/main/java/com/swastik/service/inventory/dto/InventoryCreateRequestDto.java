package com.swastik.service.inventory.dto;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class InventoryCreateRequestDto {	
	
	private String productId;	
	private int quantity;
	

}
