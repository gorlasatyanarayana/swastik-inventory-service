package com.swastik.service.inventory.service;

import com.swastik.service.inventory.dto.InventoryCreateRequestDto;
import com.swastik.service.inventory.dto.InventoryCreateResponse;
import com.swastik.service.inventory.dto.InventoryInquiryRequestDto;
import com.swastik.service.inventory.dto.InventoryInquiryResponse;

public interface InventoryService {
	InventoryCreateResponse addNewInventory(InventoryCreateRequestDto request);
	InventoryInquiryResponse getInventory(InventoryInquiryRequestDto request);
	
}
