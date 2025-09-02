import { Injectable } from '@angular/core';
import { Observable, of } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class PaymentService {
  processPayment(paymentDetails: any): Observable<boolean> {
    // Simulate payment processing delay and result
    return of(true); // or 'false' to simulate failure
  }
}
