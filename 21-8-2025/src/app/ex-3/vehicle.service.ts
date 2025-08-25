import { Injectable } from '@angular/core';
import { Vehicle } from './vehicle.interface';

@Injectable({
  providedIn: 'root'
})
export class VehicleService {
  private vehicles: Vehicle[] = [
    { id: 1, make: 'Toyota', fuelType: 'Petrol', model: 'Camry', price: 30000 },
    { id: 2, make: 'Honda', fuelType: 'Diesel', model: 'Civic', price: 28000 },
    { id: 3, make: 'Tesla', fuelType: 'Electric', model: 'Model 3', price: 45000 }
  ];

  getAll(): Vehicle[] {
    return [...this.vehicles];
  }

  getById(id: number): Vehicle | undefined {
    return this.vehicles.find(v => v.id === id);
  }

  add(vehicle: Vehicle): void {
    vehicle.id = this.generateId();
    this.vehicles.push(vehicle);
  }

  update(vehicle: Vehicle): void {
    const index = this.vehicles.findIndex(v => v.id === vehicle.id);
    if (index !== -1) {
      this.vehicles[index] = vehicle;
    }
  }

  delete(id: number): void {
    this.vehicles = this.vehicles.filter(v => v.id !== id);
  }

  private generateId(): number {
    return this.vehicles.length > 0
      ? Math.max(...this.vehicles.map(v => v.id || 0)) + 1
      : 1;
  }
}
