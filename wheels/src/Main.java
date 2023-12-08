
public class Main {
    public static void main(String[] args) {
        IssueBikeUI ui = new IssueBikeUI();

        ui.showBikeDetails(100);

        ui.calculateCost(5);

        ui.createCustomer("Nayanda Robers", "PW2 6TR", 1462501339, "nayanda.robers@gmail.com");

        ui.calculateTotalPayment();
    }
}