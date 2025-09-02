export interface Flight {
  id: string;
  airline: string;
  flightNo: string;
  source: string;
  destination: string;
  departTime: string;
  arriveTime: string;
  date: string;
  durationMins: number;
  price: number;
  stops: number;
}

export interface Booking {
  id: string;
  flightId: string;
  name: string;
  email: string;
  phone: string;
  seatClass: 'ECONOMY' | 'BUSINESS';
  amount: number;
  status: 'initiated' | 'successful' | 'failed' | 'cancelled';
  payment?: Payment;
  pnr?: string;   // ✅ Added field for PNR
}

export interface Payment {
  mode: 'CARD';
  cardLast4: string;
  txnId: string;
  status: 'Successful' | 'Failed';
}
