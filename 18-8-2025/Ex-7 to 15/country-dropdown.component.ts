import { Component } from '@angular/core';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'country-dropdown',
  standalone: true,
  imports: [CommonModule],
  template: `
    <select>
      <option *ngFor="let country of visibleCountries">{{ country }}</option>
    </select>
    <button (click)="loadCountries()">Load</button>
  `,
  styles: [`
    select, button {
      margin: 5px;
      padding: 6px;
    }
  `]
})
export class CountryDropdownComponent {
  countryNames: string[] = ['India', 'USA', 'France', 'Germany', 'Japan', 'Brazil', 'Australia'];
  visibleCountries: string[] = [];

  loadCountries() {
    this.visibleCountries = this.countryNames;
  }
}
