import { bootstrapApplication } from '@angular/platform-browser';
import { provideServerRendering } from '@angular/platform-server';
import { AppComponent } from './app/app.component';

export default function main() {
  return bootstrapApplication(AppComponent, {
    providers: [provideServerRendering()]
  });
}
