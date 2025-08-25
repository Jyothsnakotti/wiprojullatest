import { Component, OnInit } from '@angular/core';
import { Vehicle } from './models/vehicle.interface';
import { VehicleService } from './services/vehicle.service';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'app-vehicle-comp',
  standalone: true,
  imports: [CommonModule],
  templateUrl: './vehicle.component.html',
  styleUrls: ['./vehicle.component.css']
})
export class VehicleComponent implements OnInit {
  vehicles: Vehicle[] = [];

  constructor(private vehicleService: VehicleService) {}

  ngOnInit(): void {
    this.vehicles = this.vehicleService.getVehicles();
  }
}
