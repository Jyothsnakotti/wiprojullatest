import { Component } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'color-picker',
  standalone: true,
  imports: [CommonModule, FormsModule],
  template: `
    <label for="colorSelect">Choose a color:</label>
    <select id="colorSelect" [(ngModel)]="selectedColor">
      <option *ngFor="let color of colors" [value]="color">{{ color }}</option>
    </select>
    <div 
      style="margin-top: 20px; font-size: 1.2em;"
      [style.color]="selectedColor">
      This text changes color!
    </div>
  `
})
export class ColorPickerComponent {
  colors: string[] = ['red', 'green', 'blue', 'orange', 'purple', 'black'];
  selectedColor = 'black';
}
