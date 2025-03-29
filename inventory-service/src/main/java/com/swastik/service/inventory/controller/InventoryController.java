package com.swastik.service.inventory.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.swastik.service.inventory.dto.InventoryCreateRequestDto;
import com.swastik.service.inventory.dto.InventoryCreateResponse;
import com.swastik.service.inventory.dto.InventoryInquiryRequestDto;
import com.swastik.service.inventory.dto.InventoryInquiryResponse;
import com.swastik.service.inventory.service.InventoryService;


@RestController
@RequestMapping("/api")
public class InventoryController {

	private static final Logger log = LoggerFactory.getLogger(InventoryController.class);
			
	@Autowired
	InventoryService inventoryService;
	
	@PostMapping(value = "/{version}/inventory/create")
	public ResponseEntity<?> addNewInventory(@PathVariable("version") String version, @RequestBody InventoryCreateRequestDto request){
		log.info("Entered in method-addNewInventory of class-InventoryController");
		InventoryCreateResponse response = inventoryService.addNewInventory(request);
		return ResponseEntity.ok(response);
	}
	
	@GetMapping(value = "/{version}/inventory/inquiry")
	public ResponseEntity<?> getInventory(@PathVariable("version") String version,  @RequestBody InventoryInquiryRequestDto request){
		log.info("Entered in method-getInventory of class-InventoryController");
		InventoryInquiryResponse response = inventoryService.getInventory(request);
		return ResponseEntity.ok(response);
	}
	 
	
}
