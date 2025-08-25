import { Component, OnInit } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';

import { VehicleService } from './vehicle.service';
import { Vehicle } from './vehicle.interface';

@Component({
  selector: 'app-vehicle-comp',
  standalone: true,
  imports: [CommonModule, FormsModule],
  templateUrl: './vehicle.component.html',
  styleUrls: ['./vehicle.component.css']
})
export class VehicleComponent implements OnInit {
  vehicles: Vehicle[] = [];
  vehicleModel: Vehicle = { make: '', fuelType: '', model: '', price: 0 };
  isEditMode = false;

  constructor(private vehicleService: VehicleService) {}

  ngOnInit(): void {
    this.loadVehicles();
  }

  loadVehicles(): void {
    this.vehicles = this.vehicleService.getAll();
  }

  addOrUpdateVehicle(): void {
    if (this.isEditMode) {
      this.vehicleService.update(this.vehicleModel);
    } else {
      this.vehicleService.add(this.vehicleModel);
    }
    this.resetForm();
    this.loadVehicles();
  }

  editVehicle(vehicle: Vehicle): void {
    this.vehicleModel = { ...vehicle };
    this.isEditMode = true;
  }

  deleteVehicle(id?: number): void {
    if (id !== undefined) {
      this.vehicleService.delete(id);
      this.loadVehicles();
    }
  }

  resetForm(): void {
    this.vehicleModel = { make: '', fuelType: '', model: '', price: 0 };
    this.isEditMode = false;
  }
}
