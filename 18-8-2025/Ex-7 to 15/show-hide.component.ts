import { Component } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'show-hide-message',
  standalone: true,
  imports: [CommonModule, FormsModule],
  template: `
    <label>
      <input type="checkbox" [(ngModel)]="isChecked" />
      Show message
    </label>
    <div *ngIf="isChecked">
      <p>The message is now visible!</p>
    </div>
  `
})
export class ShowHideComponent {
  isChecked = false;
}
