import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { FormsModule } from '@angular/forms';
import { AppComponent } from './app.component';

@NgModule({
  imports: [
    BrowserModule,
    FormsModule,
    AppComponent  // Import standalone component here, not declare
  ],
  bootstrap: [AppComponent]
})
export class AppModule {}
