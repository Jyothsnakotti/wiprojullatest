package com.micro.LetsGo.repository; 
import com.micro.LetsGo.entity.VehicleMovement; 
import org.springframework.data.jpa.repository.JpaRepository; 
public interface VehicleMovementRepository extends JpaRepository<VehicleMovement, Long> 
{ 
}