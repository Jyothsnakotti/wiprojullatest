import { Routes } from '@angular/router';
import { SearchComponent } from './pages/search/search.component';
import { ResultsComponent } from './pages/results/results.component';
import { BookingComponent } from './pages/booking/booking.component';
import { PaymentComponent } from './pages/payment/payment.component';
import { SuccessComponent } from './pages/success/success.component';
import { FailureComponent } from './pages/failure/failure.component';

export const routes: Routes = [
  { path: '', component: SearchComponent, title: 'Flight Search' },
  { path: 'results', component: ResultsComponent, title: 'Search Results' },
  { path: 'booking/:id', component: BookingComponent, title: 'Booking' },
  { path: 'payment/:id', component: PaymentComponent, title: 'Payment' },
  { path: 'success/:id', component: SuccessComponent, title: 'Payment Success' },
  { path: 'failure/:id', component: FailureComponent, title: 'Payment Failed' },
  { path: '**', redirectTo: '' }
];
