import { Component } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';
import { Router } from '@angular/router';
import { FlightService } from '../../services/flight.service';

@Component({
  selector: 'app-search',
  standalone: true,
  imports: [CommonModule, FormsModule],
  templateUrl: './search.component.html'
})
export class SearchComponent {
  // List of available cities
  cities = ['BLR', 'DEL', 'HYD', 'MAA', 'BOM', 'CCU', 'PNQ'];

  source = '';
  destination = '';
  date = '';
  msg = '';

  constructor(private flightSvc: FlightService, private router: Router) {}

  onSearch() {
    // validation: ensure user selected all fields
    if (!this.source || !this.destination || !this.date) {
      this.msg = 'Please select Source, Destination, and Date';
      return;
    }

    // call flight service
    const results = this.flightSvc.search(this.source, this.destination, this.date);
    if (results.length === 0) {
      this.msg = 'No Flights available matching your criteria';
    } else {
      this.msg = '';
      this.router.navigate(['/results']);
    }
  }

  swapCities() {
    const temp = this.source;
    this.source = this.destination;
    this.destination = temp;
  }
}
