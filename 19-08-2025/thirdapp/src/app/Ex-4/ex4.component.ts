import { Component } from '@angular/core';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'ex4',
  standalone: true,
  imports: [CommonModule],
  template: `
    <h2>Ex4: Using ngStyle Example</h2>

    <p [ngStyle]="getStyles()">
      This paragraph is styled dynamically using <code>ngStyle</code>.
    </p>

    <button (click)="toggleStyle()">Toggle Style</button>
  `,
  styles: [`
    button {
      margin-top: 10px;
      padding: 6px 12px;
      font-size: 1em;
    }
  `]
})
export class Ex4Component {
  applyStyle = true;

  getStyles() {
    return {
      'color': this.applyStyle ? 'darkgreen' : 'darkred',
      'font-weight': this.applyStyle ? 'bold' : 'normal',
      'background-color': this.applyStyle ? '#e0ffe0' : '#ffe0e0',
      'padding': '10px',
      'border-radius': '6px'
    };
  }

  toggleStyle() {
    this.applyStyle = !this.applyStyle;
  }
}
