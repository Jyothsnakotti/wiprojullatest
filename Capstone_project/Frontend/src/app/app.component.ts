import { Component } from '@angular/core';
import { RouterOutlet } from '@angular/router';

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [RouterOutlet],
  template: `
    <header class="header">
      <h1>✈️ Flight Booking App</h1>
      <nav>
        <a routerLink="/">Home</a>
      </nav>
    </header>

    <main class="container">
      <router-outlet></router-outlet>
    </main>

    <footer class="footer">
      <small>© 2025 My Flight Booking App</small>
    </footer>
  `,
  styles: [`
    :host { display:block; font-family:sans-serif; }
    .header { display:flex; justify-content:space-between; padding:10px; background:#eee; }
    .container { max-width:960px; margin:auto; padding:10px; }
    .footer { text-align:center; padding:10px; background:#f9f9f9; }
    a { margin-right: 8px; }
  `]
})
export class AppComponent {}
