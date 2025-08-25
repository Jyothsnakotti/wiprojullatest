export interface Vehicle {
  id?: number;  // optional for new entries before backend assigns
  make: string;
  fuelType: string;
  model: string;
  price: number;
}
