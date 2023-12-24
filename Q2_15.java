public class Q2_15 {
    private int balance;
    public void makePayment(double amount) { // make a payment
        if(amount<0)
            throw new
                    IllegalArgumentException("Negative Amount is noAllowed");
           balance -= amount;
    }
}
