//import { Component, Input } from '@angular/core';

//@Component({
  //selector: 'fruit',
  //standalone: true,
  //templateUrl: './fruit.component.html',
  //styleUrls: ['./fruit.component.css']
//})
//export class FruitComponent {
  //@Input() fruit!: { name: string; description: string; image: string };
//}

//import { Component, Input } from '@angular/core';
//import { IFruit } from '../models/fruit.interface';

//@Component({
  //selector: 'fruit',
  //standalone: true,
  //templateUrl: './fruit.component.html',
  //styleUrls: ['./fruit.component.css']
//})
//export class FruitComponent {
 // @Input() fruit!: IFruit;  // Use IFruit interface here
//}

import { Component, Input, Output, EventEmitter } from '@angular/core';
import { IFruit } from '../models/fruit.interface';

@Component({
  selector: 'fruit',
  standalone: true,
  templateUrl: './fruit.component.html',
  styleUrls: ['./fruit.component.css']
})
export class FruitComponent {
  @Input() fruit!: IFruit;
  @Output() remove = new EventEmitter<IFruit>();

  onRemoveClick() {
    this.remove.emit(this.fruit);
  }
}




