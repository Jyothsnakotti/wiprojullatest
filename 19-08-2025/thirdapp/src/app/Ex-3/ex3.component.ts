import { Component } from '@angular/core';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'ex3',
  standalone: true,
  imports: [CommonModule],
  template: `
    <h2>Ex3: Dynamic ngClass via Function</h2>

    <p [ngClass]="getNgClass()">
      This paragraph’s style is dynamically set via <code>getNgClass()</code>.
    </p>

    <button (click)="toggleStyles()">
      Toggle styles
    </button>
  `,
  styles: [`
    .highlight {
      background-color: yellow;
      font-weight: bold;
    }
    .italic {
      font-style: italic;
      color: darkblue;
    }
  `]
})
export class Ex3Component {
  useHighlight = true;
  useItalic = false;

  getNgClass() {
    return {
      'highlight': this.useHighlight,
      'italic': this.useItalic
    };
  }

  toggleStyles() {
    this.useHighlight = !this.useHighlight;
    this.useItalic = !this.useItalic;
  }
}
