import { Component } from '@angular/core';
import { SecondcompComponent } from './secondcomp/secondcomp';

@Component({
  selector: 'app-root',
  standalone: true,
  templateUrl: './app.html',   // 👈 app.html is your template
  styleUrls: ['./app.css'],    // 👈 app.css is your styles
  imports: [SecondcompComponent]  // 👈 Import your new component
})
export class AppComponent { }
