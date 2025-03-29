package com.swastik.service.inventory.service.impl;

import java.time.LocalDateTime;
import java.util.UUID;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.swastik.service.inventory.dto.InventoryCreateRequestDto;
import com.swastik.service.inventory.dto.InventoryCreateResponse;
import com.swastik.service.inventory.dto.InventoryInquiryRequestDto;
import com.swastik.service.inventory.dto.InventoryInquiryResponse;
import com.swastik.service.inventory.entity.InventoryMastEntity;
import com.swastik.service.inventory.repository.InventoryHistRepository;
import com.swastik.service.inventory.repository.InventoryMastRepository;
import com.swastik.service.inventory.service.InventoryService;

@Service
public class InventoryServiceImpl implements InventoryService{
	
	private static final Logger log = LoggerFactory.getLogger(InventoryServiceImpl.class);
	
	@Autowired
	InventoryMastRepository inventoryMastRepository;
	
	@Autowired
	InventoryHistRepository inventoryHistRepository;

	@Override
	public InventoryCreateResponse addNewInventory(InventoryCreateRequestDto request) {
		// TODO Auto-generated method stub
		InventoryCreateResponse response = null;
		log.info("[Add-New-Inventory] entered {} ",request);
		
		log.info("[Add-New-Inventory] add new inventory item");
		
	
		InventoryMastEntity inventoryMastEntity  = new InventoryMastEntity();
		inventoryMastEntity.setProduct_id(UUID.fromString(request.getProductId()));
		inventoryMastEntity.setQuantity(request.getQuantity());
		inventoryMastEntity.setCreatedBy("Inventory Service");
		inventoryMastEntity.setCreatedAt(LocalDateTime.now());
		
		inventoryMastEntity = inventoryMastRepository.save(inventoryMastEntity);
		
		
		if(inventoryMastEntity !=null && inventoryMastEntity.getId() != null) {
			log.info("[Add-New-Inventory] inventory added successfully with inventory id : {} ",inventoryMastEntity.getId());
			response = InventoryCreateResponse.builder().success(true).inventoryId(inventoryMastEntity.getId().toString()).build();
		} else {	
			log.info("[Add-New-Inventory] failed to create product");
			response = InventoryCreateResponse.builder().success(false).inventoryId(null).build();
		}
		
		
		return response;
	}

	@Override
	public InventoryInquiryResponse getInventory(InventoryInquiryRequestDto request) {
		// TODO Auto-generated method stub
		return null;
	}

}
