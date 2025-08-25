import { Component } from '@angular/core';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'style-example',
  standalone: true,
  imports: [CommonModule],
  template: `
    <h2>ngClass Example</h2>

    <!-- Using string -->
    <p [ngClass]="'red-text'">
      This text has class <code>red-text</code> applied as a string.
    </p>

    <!-- Using array -->
    <p [ngClass]="['red-text', 'bold-text']">
      This text has classes <code>red-text</code> and <code>bold-text</code> as an array.
    </p>

    <!-- Using object -->
    <p [ngClass]="{ 'red-text': true, 'bold-text': applyBold }">
      This text uses an object. <code>red-text</code> is always applied, and <code>bold-text</code> applies conditionally.
    </p>

    <button (click)="toggleBold()">
      Toggle Bold Text Class (currently {{ applyBold ? 'ON' : 'OFF' }})
    </button>
  `,
  styles: [`
    .red-text {
      color: red;
    }
    .bold-text {
      font-weight: bold;
    }
  `]
})
export class StyleExampleComponent {
  applyBold = false;

  toggleBold() {
    this.applyBold = !this.applyBold;
  }
}
