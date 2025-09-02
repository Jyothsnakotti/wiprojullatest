// payment.model.ts

export interface Payment {
  id: number;                    // Unique payment identifier
  bookingId: number;             // Associated booking ID
  amount: number;                // Payment amount
  currency: string;              // Currency code, e.g. 'USD', 'INR'
  paymentDate: Date;             // Date of payment
  paymentMethod: string;         // Payment method, e.g., 'Credit Card', 'UPI', 'PayPal'
  transactionId?: string;        // Optional transaction reference/ID from payment gateway
  status: string;                // Payment status like 'Pending', 'Completed', 'Failed'
  cardNumber?: string;           // Optional masked card number (for display only)
  cardHolderName?: string;       // Optional card holder name
  expiryDate?: string;           // Optional expiry date for card payments MM/YY
  cvv?: string;                  // Optional CVV for card payments (handle securely)
}
