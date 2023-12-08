
public class Payment {
    private Customer customer = null;
    private int paymentId = 0;

    private static int paymentCount = 1;

    public Payment(Customer cust){
        customer = cust;
        paymentId = paymentCount++;
    }

    public void calculateTotalPayment(Hire hire){
        issueReceipt(hire);
        sendReceiptByEmail(hire);
    }


    private void sendReceiptByEmail(Hire hire){
        String to = customer.getEmail();
        String subject = "Recibo de Aluguel de Bicicleta";
        String body = generateReceiptBody(hire);

        EmailSender.sendEmail(to, subject, body);
    }

    private String generateReceiptBody(Hire hire){
        String cust = hire.getCustomer().getName();
        String pCode = hire.getCustomer().getPostcode();
        String bikeNum = Integer.toString(hire.getBike().getBikeNumber());
        int numDays = hire.getNumberOfDays();
        int cost = hire.getBike().calculateCost(numDays);

        return "Recibo para: " + cust + "\n"
                + "Código postal: " + pCode + "\n"
                + "Aluguel da bicicleta número " + bikeNum + " por " + numDays + " dias\n"
                + "Custo total: $" + cost + "\n";
    }
}

