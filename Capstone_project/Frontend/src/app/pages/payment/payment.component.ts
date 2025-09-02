import { Component, OnInit } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';
import { ActivatedRoute, Router } from '@angular/router';
import { BookingService } from '../../services/booking.service';
import jsPDF from 'jspdf';

@Component({
  selector: 'app-payment',
  standalone: true,
  imports: [CommonModule, FormsModule],
  templateUrl: './payment.component.html'
})
export class PaymentComponent implements OnInit {
  booking: any;
  cardNumber = '';
  expiry = '';
  cvv = '';

  constructor(
    private route: ActivatedRoute,
    private router: Router,
    private bookingSvc: BookingService
  ) {}

  ngOnInit(): void {
    this.booking = this.bookingSvc.getBooking();
  }

  get validCard() {
    return /^\d{16}$/.test(this.cardNumber.replace(/\s+/g, ''));
  }

  get validExpiry() {
    const m = this.expiry.match(/^(0[1-9]|1[0-2])\/(\d{2})$/);
    if (!m) return false;
    const mm = parseInt(m[1], 10);
    const yy = parseInt('20' + m[2], 10);
    const d = new Date(yy, mm - 1, 1);
    return d > new Date();
  }

  get validCvv() {
    return /^\d{3,4}$/.test(this.cvv);
  }

  pay() {
    if (!this.booking) return;

    const last4 = this.cardNumber.slice(-4);
    const success = parseInt(last4[last4.length - 1], 10) % 2 === 0;

    this.bookingSvc.setPayment({
      mode: 'CARD',
      cardLast4: last4,
      txnId: 'TXN-' + Math.random().toString(36).slice(2, 8).toUpperCase(),
      status: success ? 'Successful' : 'Failed'
    }, success);

    if (success) {
      this.generateTicket();
      this.router.navigate(['/success', this.booking.flightId]);
    } else {
      this.router.navigate(['/failure', this.booking.flightId]);
    }
  }

  private generateTicket() {
    const doc = new jsPDF();
    doc.setFontSize(18);
    doc.text('✈ Flight Ticket', 20, 20);

    doc.setFontSize(12);
    doc.text(`Booking ID: ${this.booking.id}`, 20, 40);
    doc.text(`Flight ID: ${this.booking.flightId}`, 20, 50);
    doc.text(`Passenger: ${this.booking.passenger || 'N/A'}`, 20, 60);
    doc.text(`Source: ${this.booking.source}`, 20, 70);
    doc.text(`Destination: ${this.booking.destination}`, 20, 80);
    doc.text(`Date: ${this.booking.date}`, 20, 90);
    doc.text(`Amount Paid: ₹${this.booking.amount}`, 20, 100);
    doc.text(`Payment Status: Successful`, 20, 110);

    doc.save(`Ticket-${this.booking.id}.pdf`);
  }
}
