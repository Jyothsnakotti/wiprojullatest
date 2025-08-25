//import { Component } from '@angular/core';
//import { StyleExampleComponent } from './style-example.component';

//@Component({
  //selector: 'home',
  //standalone: true,
  //imports: [StyleExampleComponent],
  //template: `
    //<h1>ngClass Demo</h1>
    //<style-example></style-example>  `
//})
//export class HomeComponent {}

//import { Component } from '@angular/core';
//import { Ex3Component } from './Ex-3/ex3.component';

//@Component({
  //selector: 'home',
  //standalone: true,
  //imports: [Ex3Component],
  //template: `
    //<ex3></ex3>  `
//})
//export class HomeComponent {}

//import { Component } from '@angular/core';
//import { Ex4Component } from './Ex-4/ex4.component';

//@Component({
  //selector: 'home',
  //standalone: true,
  //imports: [Ex4Component],
  //template: `
    //<ex4></ex4>  `
//})
//export class HomeComponent {}

import { Component } from '@angular/core';
import { HomeComponent } from './home/home.component';

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [HomeComponent],
  template: `<home></home>`
})
export class App {}





