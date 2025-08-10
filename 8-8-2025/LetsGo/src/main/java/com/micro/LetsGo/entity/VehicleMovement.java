package com.micro.LetsGo.entity; 
import jakarta.persistence.*; 
import java.time.LocalDateTime; 
@Entity 
@Table(name = "vehicle_movement") 
public class VehicleMovement { 
@Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY) 
    private Long id; 
 
    @Column(name = "veh_id", nullable = false) 
    private Long vehicleId; 
 
    @Column(name = "latitude") 
    private Double latitude; 
 
    @Column(name = "longitude") 
    private Double longitude; 
 
    @Column(name = "moved_at") 
    private LocalDateTime movedAt; 
 
    @PrePersist 
    public void prePersist() { 
        this.movedAt = LocalDateTime.now(); 
    } 
 
    // getters and setters 
 
    public Long getId() { return id; } 
    public void setId(Long id) { this.id = id; } 
 
    public Long getVehicleId() { return vehicleId; } 
public void setVehicleId(Long vehicleId) { this.vehicleId = vehicleId; } 
public Double getLatitude() { return latitude; } 
public void setLatitude(Double latitude) { this.latitude = latitude; } 
public Double getLongitude() { return longitude; } 
public void setLongitude(Double longitude) { this.longitude = longitude; } 
public LocalDateTime getMovedAt() { return movedAt; } 
public void setMovedAt(LocalDateTime movedAt) { this.movedAt = movedAt; } 
}