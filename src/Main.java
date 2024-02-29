public class Main {
    public static void main(String[] args) {

        System.out.println("ECommerce");

        ECommerceFacade eCommerceFacade = new ECommerceFacade(new UserAuthentication(),
                new PaymentProcessing(), new InventoryManagement(), new OrderFulfillment());

        eCommerceFacade.purchaseProduct("Rebeca", "123", "QR", "1Au7", 3);

    }
}