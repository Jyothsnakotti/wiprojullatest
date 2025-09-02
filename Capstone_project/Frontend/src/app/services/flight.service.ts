import { Injectable, signal } from '@angular/core';
import { Flight } from '../models/models';

@Injectable({ providedIn: 'root' })
export class FlightService {
  private flights = signal<Flight[]>([
    { id:'F101', airline:'IndiGo', flightNo:'6E-201', source:'BLR', destination:'DEL', departTime:'08:00', arriveTime:'10:30', date:'2025-09-01', durationMins:150, price:5600, stops:0 },
    { id:'F102', airline:'Air India', flightNo:'AI-302', source:'BLR', destination:'DEL', departTime:'09:30', arriveTime:'12:15', date:'2025-09-01', durationMins:165, price:6400, stops:1 },
    { id:'F103', airline:'Vistara', flightNo:'UK-810', source:'BLR', destination:'BOM', departTime:'11:00', arriveTime:'12:30', date:'2025-09-01', durationMins:90, price:4200, stops:0 }
  ]);

  results = signal<Flight[]>([]);

  search(source: string, destination: string, date: string, maxStops?: number) {
    const res = this.flights().filter(f =>
      f.source === source && f.destination === destination && f.date === date &&
      (maxStops === undefined || f.stops <= maxStops)
    );
    this.results.set(res);
    return res;
  }

  listResults() { return this.results(); }
  getById(id: string) { return this.flights().find(f => f.id === id); }
}
