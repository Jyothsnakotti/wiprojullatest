import { Injectable, signal } from '@angular/core';
import { Booking, Payment } from '../models/models';

@Injectable({ providedIn: 'root' })
export class BookingService {
  booking = signal<Booking | null>(null);

  initBooking(partial: Omit<Booking, 'status' | 'pnr'>) {
    // ✅ Generate a 6-character alphanumeric PNR
    const pnr = 'PNR' + Math.random().toString(36).substring(2, 8).toUpperCase();

    const b: Booking = { 
      ...partial, 
      status: 'initiated',
      pnr            // ✅ Add PNR to booking
    };

    this.booking.set(b);
  }

  setPayment(p: Payment, success: boolean) {
    const b = this.booking();
    if (!b) return;
    b.payment = p;
    b.status = success ? 'successful' : 'failed';
    this.booking.set({ ...b });
  }

  getBooking() { 
    return this.booking(); 
  }
}
