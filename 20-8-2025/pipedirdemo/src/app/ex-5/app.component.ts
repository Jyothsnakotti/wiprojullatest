import { Component } from '@angular/core';
import { CommonModule } from '@angular/common';
import { MovieComponent } from './movie.component';

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [CommonModule, MovieComponent],
  templateUrl: './app.component.html'
})
export class AppComponent {}
