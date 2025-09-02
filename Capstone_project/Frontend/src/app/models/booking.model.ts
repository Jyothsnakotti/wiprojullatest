export interface Booking {
  id: number;                  // Unique identifier for the booking
  name: string;                // Name of the passenger or customer
  flightNumber: string;        // Flight number associated with the booking
  aircraftName?: string;       // Optional aircraft name
  source: string;              // Flight origin
  destination: string;         // Flight destination
  travelDate: Date;            // Date of travel as Date object
  price: number;               // Price for the booking
  seatNumber?: string;         // Optional seat number
  status?: string;             // Optional booking status (e.g., confirmed, cancelled)
}