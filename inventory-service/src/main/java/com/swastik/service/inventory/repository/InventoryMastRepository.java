package com.swastik.service.inventory.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.swastik.service.inventory.entity.InventoryMastEntity;


public interface InventoryMastRepository extends JpaRepository<InventoryMastEntity, UUID>{

}