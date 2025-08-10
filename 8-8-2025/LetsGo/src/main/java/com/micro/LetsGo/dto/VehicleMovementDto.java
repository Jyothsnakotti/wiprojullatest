package com.micro.LetsGo.dto; 
 
import com.fasterxml.jackson.annotation.JsonProperty; 
 
public class VehicleMovementDto { 
 
    @JsonProperty("vehId") 
    private Long vehicleId; 
 
    @JsonProperty("lat") 
    private Double latitude; 
 
    // map JSON key "long" to this field 
    @JsonProperty("long") 
    private Double longitude; 
 
    // constructors, getters, setters 
public VehicleMovementDto() {} 
public Long getVehicleId() { return vehicleId; } 
public void setVehicleId(Long vehicleId) { this.vehicleId = vehicleId; } 
public Double getLatitude() { return latitude; } 
public void setLatitude(Double latitude) { this.latitude = latitude; } 
public Double getLongitude() { return longitude; } 
public void setLongitude(Double longitude) { this.longitude = longitude; } 
}