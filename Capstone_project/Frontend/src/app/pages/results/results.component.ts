import { Component, signal } from '@angular/core';
import { CommonModule } from '@angular/common';
import { RouterLink } from '@angular/router';
import { FlightService } from '../../services/flight.service';
import { Flight } from '../../models/models';

@Component({
  selector: 'app-results',
  standalone: true,
  imports: [CommonModule, RouterLink],
  templateUrl: './results.component.html'
})
export class ResultsComponent {
  flights = signal<Flight[]>([]);

  constructor(private flightSvc: FlightService) {
    this.flights.set(this.flightSvc.listResults());
  }
}
