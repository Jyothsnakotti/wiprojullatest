import { Component } from '@angular/core';
import { CommonModule } from '@angular/common';
import { HighlightStrikethruDirective } from './highlight-strikethru.directive';

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [CommonModule, HighlightStrikethruDirective],
  templateUrl: './app.component.html'
})
export class AppComponent {
  sampleText = 'Highlight this text with yellow color and strikethrough';
}
