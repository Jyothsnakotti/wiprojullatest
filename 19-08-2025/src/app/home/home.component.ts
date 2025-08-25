//import { Component } from '@angular/core';
//import { CommonModule } from '@angular/common';
//import { StyleExampleComponent } from '../style-example.component'; // Adjust path here

//@Component({
  //selector: 'home',
  //standalone: true,
  //imports: [CommonModule, StyleExampleComponent],
  //template: `
    //<h1>ngClass Demo</h1>
    //<style-example></style-example>  `
//})
//export class HomeComponent {}

//import { Component } from '@angular/core';
//import { CommonModule } from '@angular/common';
//import { FruitComponent } from '../fruit/fruit.component';

//@Component({
//  selector: 'home',
//  standalone: true,
 // imports: [CommonModule, FruitComponent],
//  templateUrl: './home.component.html',
 // styleUrls: ['./home.component.css']
//})
//export class HomeComponent {
//  fruits = [
  //  {
     // name: 'Apple',
     // description: 'Red, juicy, and crunchy fruit.',
    //  image: 'https://images.unsplash.com/photo-1567306226416-28f0efdc88ce?auto=format&fit=crop&w=400&q=80',
      //price: 250
  //  },
  //  {
   //   name: 'Banana',
     // description: 'Soft, sweet fruit packed with potassium.',
    //  image: 'https://tse4.mm.bing.net/th/id/OIP.UR8IIclztIWLAZ9oH3lZxgHaE8?pid=Api&P=0&h=220',
    //  price: 60
   // },
   // {
   //   name: 'Mango',
     // description: 'Tropical stone fruit, sweet and refreshing.',
   //   image: 'https://daganghalal.blob.core.windows.net/28749/Product/1000x1000__mango-1657087656055.jpg',
   //   price: 150
  //  },
   // {
     // name: 'Orange',
     // description: 'Refreshing citrus packed with vitamin C.',
     // image: 'https://tse2.mm.bing.net/th/id/OIP.Ma0f_Z3WDbz4EfbwoTvLPQHaHI?pid=Api&P=0&h=220',
     // price: 70
    //},
    //{
     // name: 'Pomegranate',
     // description: 'Juicy and packed with antioxidants.',
     // image: 'https://tse4.mm.bing.net/th/id/OIP.YUigCCTZYgrVVWbRyZwFGAHaFa?pid=Api&P=0&h=220',
      //price: 150
    //},
    //{
      //name: 'Guava',
      //description: 'Sweet and sometimes tangy tropical fruit.',
      //image: 'https://healthjade.net/wp-content/uploads/2018/05/guava-fruit.jpg',
      //price: 150
    //}
  //];

  //onKnowMore(fruitName: string) {
    //alert(`More information about ${fruitName} will be available soon!`);
 // }
//}

//import { Component } from '@angular/core';
//import { CommonModule } from '@angular/common';
//import { FruitComponent } from '../fruit/fruit.component';
//import { IFruit } from '../models/fruit.interface';

//@Component({
  //selector: 'home',
  //standalone: true,
  //imports: [CommonModule, FruitComponent],
  //templateUrl: './home.component.html',
  //styleUrls: ['./home.component.css']
//})
//export class HomeComponent {
 // fruits: IFruit[] = [
   // {
     // name: 'Apple',
      //description: 'Red, juicy, and crunchy fruit.',
      //image: 'https://images.unsplash.com/photo-1567306226416-28f0efdc88ce?auto=format&fit=crop&w=400&q=80',
      //price: 250
    //},
    //{
      //name: 'Banana',
      //description: 'Soft, sweet fruit packed with potassium.',
      //image: 'https://tse4.mm.bing.net/th/id/OIP.UR8IIclztIWLAZ9oH3lZxgHaE8?pid=Api&P=0&h=220',
      //price: 60
    //},
    //{
      //name: 'Mango',
      //description: 'Tropical stone fruit, sweet and refreshing.',
      //image: 'https://daganghalal.blob.core.windows.net/28749/Product/1000x1000__mango-1657087656055.jpg',
      //price: 150
    //},
    //{
      //name: 'Orange',
      //description: 'Refreshing citrus packed with vitamin C.',
      //image: 'https://tse2.mm.bing.net/th/id/OIP.Ma0f_Z3WDbz4EfbwoTvLPQHaHI?pid=Api&P=0&h=220',
      //price: 70
    //},
    //{
      //name: 'Pomegranate',
      //description: 'Juicy and packed with antioxidants.',
      //image: 'https://tse4.mm.bing.net/th/id/OIP.YUigCCTZYgrVVWbRyZwFGAHaFa?pid=Api&P=0&h=220',
      //price: 150
    //},
   // {
     // name: 'Guava',
     // description: 'Sweet and sometimes tangy tropical fruit.',
     // image: 'https://healthjade.net/wp-content/uploads/2018/05/guava-fruit.jpg',
     // price: 150
    //}
  //];

  //onKnowMore(fruitName: string) {
    //alert(`More information about ${fruitName} will be available soon!`);
  //}
//}

import { Component } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FruitComponent } from '../fruit/fruit.component';
import { IFruit } from '../models/fruit.interface';

@Component({
  selector: 'home',
  standalone: true,
  imports: [CommonModule, FruitComponent],
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent {
  fruits: IFruit[] = [
    {
      name: 'Apple',
      description: 'Red, juicy, and crunchy fruit.',
      image: 'https://images.unsplash.com/photo-1567306226416-28f0efdc88ce?auto=format&fit=crop&w=400&q=80',
      price: 250
    },
    {
      name: 'Banana',
      description: 'Soft, sweet fruit packed with potassium.',
      image: 'https://tse4.mm.bing.net/th/id/OIP.UR8IIclztIWLAZ9oH3lZxgHaE8?pid=Api&P=0&h=220',
      price: 60
    },
    {
      name: 'Mango',
      description: 'Tropical stone fruit, sweet and refreshing.',
      image: 'https://daganghalal.blob.core.windows.net/28749/Product/1000x1000__mango-1657087656055.jpg',
      price: 150
    },
    {
      name: 'Orange',
      description: 'Refreshing citrus packed with vitamin C.',
      image: 'https://tse2.mm.bing.net/th/id/OIP.Ma0f_Z3WDbz4EfbwoTvLPQHaHI?pid=Api&P=0&h=220',
      price: 70
    },
    {
      name: 'Pomegranate',
      description: 'Juicy and packed with antioxidants.',
      image: 'https://tse4.mm.bing.net/th/id/OIP.YUigCCTZYgrVVWbRyZwFGAHaFa?pid=Api&P=0&h=220',
      price: 150
    },
    {
      name: 'Guava',
      description: 'Sweet and sometimes tangy tropical fruit.',
      image: 'https://healthjade.net/wp-content/uploads/2018/05/guava-fruit.jpg',
      price: 150
    }
  ];

  onKnowMore(fruitName: string) {
    alert(`More information about ${fruitName} will be available soon!`);
  }
onRemoveFruit(fruitToRemove: IFruit) {
  this.fruits = this.fruits.filter(fruit => fruit !== fruitToRemove);
}

}








