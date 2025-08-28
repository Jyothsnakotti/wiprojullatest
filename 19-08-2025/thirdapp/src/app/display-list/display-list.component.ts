import { Component } from '@angular/core';
import { CommonModule } from '@angular/common';

interface Fruit {
  name: string;
  description: string;
  image: string;
}

@Component({
  selector: 'display-list',
  standalone: true,
  imports: [CommonModule],
  template: `
    <div class="row">
      <div class="col-md-4 mb-4" *ngFor="let fruit of fruits">
        <div class="card h-100">
          <img [src]="fruit.image" class="card-img-top" alt="{{fruit.name}}" style="height:200px;object-fit:cover;">
          <div class="card-body">
            <h5 class="card-title">{{ fruit.name }}</h5>
            <p class="card-text">{{ fruit.description }}</p>
          </div>
        </div>
      </div>
    </div>
  `
})
export class DisplayListComponent {
  fruits: Fruit[] = [
    {
      name: 'Apple',
      description: 'Red, juicy, and crunchy fruit.',
      image: 'https://images.unsplash.com/photo-1567306226416-28f0efdc88ce?auto=format&fit=crop&w=400&q=80'
    },
    {
      name: 'Banana',
      description: 'Soft, sweet fruit packed with potassium.',
      image: 'https://images.unsplash.com/photo-1574226516831-e1dff420e8f8?auto=format&fit=crop&w=400&q=80'
    },
    {
      name: 'Mango',
      description: 'Tropical stone fruit, sweet and refreshing.',
      image: 'https://images.unsplash.com/photo-1502741338009-cac2772e18bc?auto=format&fit=crop&w=400&q=80'
    }
  ];
}
