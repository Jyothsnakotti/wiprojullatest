import { Injectable } from '@angular/core';
import { Vehicle } from '../models/vehicle.interface';

@Injectable({
  providedIn: 'root'
})
export class VehicleService {
  private vehicles: Vehicle[] = [
    { id: 1, make: 'Toyota', fuelType: 'Petrol', model: 'Camry', price: 30000 },
    { id: 2, make: 'Honda', fuelType: 'Diesel', model: 'Civic', price: 28000 },
    { id: 3, make: 'Tesla', fuelType: 'Electric', model: 'Model 3', price: 45000 }
  ];

  getVehicles(): Vehicle[] {
    return [...this.vehicles]; // Return a copy of the array
  }
}
