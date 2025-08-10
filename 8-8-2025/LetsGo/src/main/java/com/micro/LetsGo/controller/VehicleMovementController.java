package com.micro.LetsGo.controller; 
import com.micro.LetsGo.dto.VehicleMovementDto; 
import com.micro.LetsGo.entity.VehicleMovement; 
import com.micro.LetsGo.service.VehicleMovementService; 
import org.slf4j.Logger; 
import org.slf4j.LoggerFactory; 
import org.springframework.http.ResponseEntity; 
import org.springframework.web.bind.annotation.*; 
@RestController 
public class VehicleMovementController { 
private static final Logger logger = 
LoggerFactory.getLogger(VehicleMovementController.class); 
private final VehicleMovementService service; 
public VehicleMovementController(VehicleMovementService service) { 
this.service = service; 
} 
@PostMapping("/move") 
public ResponseEntity<VehicleMovement> move(@RequestBody VehicleMovementDto dto) { 
logger.info("Received move: vehId={}, lat={}, long={}", dto.getVehicleId(), dto.getLatitude(), 
dto.getLongitude()); 
        VehicleMovement saved = service.saveMovement(dto); 
        logger.info("Saved movement id={}", saved.getId()); 
        return ResponseEntity.status(201).body(saved); 
    } 
}