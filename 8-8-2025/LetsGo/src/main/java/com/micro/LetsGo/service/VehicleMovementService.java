package com.micro.LetsGo.service; 
 
import com.micro.LetsGo.dto.VehicleMovementDto; 
import com.micro.LetsGo.entity.VehicleMovement; 
import com.micro.LetsGo.repository.VehicleMovementRepository; 
import org.springframework.stereotype.Service; 
 
@Service 
public class VehicleMovementService { 
 
    private final VehicleMovementRepository repo; 
 
    public VehicleMovementService(VehicleMovementRepository repo) { 
        this.repo = repo; 
    } 
 
    public VehicleMovement saveMovement(VehicleMovementDto dto) { 
        VehicleMovement vm = new VehicleMovement(); 
        vm.setVehicleId(dto.getVehicleId()); 
        vm.setLatitude(dto.getLatitude()); 
        vm.setLongitude(dto.getLongitude()); 
        return repo.save(vm); 
    } 
} 
