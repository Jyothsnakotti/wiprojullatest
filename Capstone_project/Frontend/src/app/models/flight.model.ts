// flight.model.ts

export interface Flight {
  id: number;
  flightNumber: string;
  source: string;
  destination: string;
  travelDate: Date;
  price: number;
  aircraftName?: string;
  seatNumber?: string;
  // other flight fields...
}
