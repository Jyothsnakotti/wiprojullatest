import { Component, OnInit } from '@angular/core';
import { CommonModule } from '@angular/common';
import { RouterLink } from '@angular/router';
import { BookingService } from '../../services/booking.service';

@Component({
  selector: 'app-success',
  standalone: true,
  imports: [CommonModule, RouterLink],
  templateUrl: './success.component.html'
})
export class SuccessComponent implements OnInit {
  booking: any;

  constructor(private bookingSvc: BookingService) {}

  ngOnInit(): void {
    this.booking = this.bookingSvc.getBooking();
  }
}
