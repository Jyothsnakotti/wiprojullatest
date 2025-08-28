import { Component } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';
import { CelsiusToFahrenheitPipe } from './celsius-to-fahrenheit.pipe';

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [CommonModule, FormsModule, CelsiusToFahrenheitPipe],
  template: `
    <div style="max-width: 350px; margin: 40px auto; font-family: Arial, sans-serif;">
      <h3>Ex 3: Celsius to Fahrenheit Custom Pipe</h3>

      <label for="celsiusInput" style="font-weight: 600;">Enter Celsius:</label>
      <input
        id="celsiusInput"
        type="number"
        [(ngModel)]="celsius"
        placeholder="Enter °C"
        style="width: 100%; padding: 8px; font-size: 16px; margin-top: 5px; border-radius: 5px; border: 2px solid #3e75c3; outline: none;"
      />

      <p style="margin-top: 20px; font-size: 18px; font-weight: 600; color: #2c3e50;">
        Fahrenheit: {{ celsius | celsiusToFahrenheit }}
      </p>
    </div>
  `,
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  celsius: number | null = null;
}
