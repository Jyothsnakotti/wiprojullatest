import { Component, OnInit } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';

import { Vehicle } from './vehicle.interface';
import { VehicleService } from './vehicle.service';

@Component({
  selector: 'app-vehicle',
  standalone: true,
  imports: [CommonModule, FormsModule, HttpClientModule],
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
    this.vehicleService.getVehicles().subscribe(data => {
      this.vehicles = data;
    });
  }

  addOrUpdateVehicle(): void {
    if(this.isEditMode) {
      this.vehicleService.updateVehicle(this.vehicleModel).subscribe(() => {
        this.loadVehicles();
        this.resetForm();
      });
    } else {
      this.vehicleService.addVehicle(this.vehicleModel).subscribe(() => {
        this.loadVehicles();
        this.resetForm();
      });
    }
  }

  editVehicle(vehicle: Vehicle): void {
    this.vehicleModel = {...vehicle};
    this.isEditMode = true;
  }

  deleteVehicle(id: number): void {
    this.vehicleService.deleteVehicle(id).subscribe(() => {
      this.loadVehicles();
    });
  }

  resetForm(): void {
    this.vehicleModel = { make: '', fuelType: '', model: '', price: 0 };
    this.isEditMode = false;
  }
}
