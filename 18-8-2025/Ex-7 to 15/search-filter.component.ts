import { Component } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'search-filter',
  standalone: true,
  imports: [CommonModule, FormsModule],
  template: `
    <input
      type="text"
      [(ngModel)]="searchText"
      placeholder="Type to search..."
      style="margin-bottom:10px;width:200px;padding:5px;"
    />

    <select size="6" style="width:200px;">
      <option *ngFor="let name of filteredNames()">{{ name }}</option>
    </select>
  `
})
export class SearchFilterComponent {
  names: string[] = [
    'Jayanta',
    'Jayaram',
    'Ankit',
    'Suresh',
    'Vijay',
    'Ajay',
    'Piyush',
    'Maya'
  ];
  searchText = '';

  filteredNames(): string[] {
    const term = this.searchText.trim().toLowerCase();
    // Always show all names if search box is empty
    if (!term) return this.names;
    // Filter by case-insensitive includes
    return this.names.filter(name => name.toLowerCase().includes(term));
  }
}
