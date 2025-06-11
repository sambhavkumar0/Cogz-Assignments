// Base class
class Payment {
    void payAmount() {
        System.out.println("Processing generic payment...");
    }
}

// Derived class: CreditCardPayment
class CreditCardPayment extends Payment {
    @Override
    void payAmount() {
        System.out.println("Paid using Credit Card.");
    }
}

// Derived class: UPIPayment
class UPIPayment extends Payment {
    @Override
    void payAmount() {
        System.out.println("Paid using UPI.");
    }
}

// Derived class: CashPayment
class CashPayment extends Payment {
    @Override
    void payAmount() {
        System.out.println("Paid using Cash.");
    }
}

// Main class
public class Payments {
    public static void main(String[] args) {
        Payment p;

        p = new CreditCardPayment();
        p.payAmount();

        p = new UPIPayment();
        p.payAmount();

        p = new CashPayment();
        p.payAmount();
    }
}
