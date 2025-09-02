import { Component, OnInit } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';
import { ActivatedRoute, Router } from '@angular/router';
import { FlightService } from '../../services/flight.service';
import { BookingService } from '../../services/booking.service';

@Component({
  selector: 'app-booking',
  standalone: true,
  imports: [CommonModule, FormsModule],
  templateUrl: './booking.component.html'
})
export class BookingComponent implements OnInit {
  flight: any;
  name = '';
  email = '';
  phone = '';
  gender: 'MALE' | 'FEMALE' | 'OTHER' = 'MALE';
  age: number | null = null;   // 👈 Added age
  seatClass: 'ECONOMY' | 'BUSINESS' = 'ECONOMY';

  constructor(
    private route: ActivatedRoute,
    private router: Router,
    private flightSvc: FlightService,
    private bookingSvc: BookingService
  ) {}

  ngOnInit(): void {
    const flightId = this.route.snapshot.params['id'];
    this.flight = this.flightSvc.getById(flightId);
  }

  proceed() {
    if (!this.flight) return;
    const amount = this.seatClass === 'BUSINESS'
      ? this.flight.price * 1.7
      : this.flight.price;

    this.bookingSvc.initBooking({
      id: 'BKG-' + Math.random().toString(36).slice(2, 8).toUpperCase(),
      flightId: this.flight.id,
      name: this.name,
      email: this.email,
      phone: this.phone,
      gender: this.gender,
      age: this.age,   // 👈 Added
      seatClass: this.seatClass,
      amount
    } as any);

    this.router.navigate(['/payment', this.flight.id]);
  }
}
