import { Component } from '@angular/core';
import { CommonModule } from '@angular/common';
import { RouterLink } from '@angular/router';

@Component({
  selector: 'app-failure',
  standalone: true,
  imports: [CommonModule, RouterLink],
  templateUrl: './failure.component.html'
})
export class FailureComponent {}
