// В этом примере класс Order отвечает за несколько вещей: хранение
//  данных о заказе, расчет стоимости заказа с учетом скидок, обработку платежа и отправку уведомления пользователю
class Order {

    private String productName;
    private int quantity;
    private double price;

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}

interface Discount{
    double calculateTotalPrice();
}

class Discount20 implements Discount{
    
    @Override
    public double calculateTotalPrice(){
        return quantity * price * 0.2;
    }
}

class Discount30 implements Discount{
    @Override
    public double calculateTotalPrice(){
        return quantity * price * 0.3;
    }
}

interface SendConf{
    public SendConfirmation() {
    }
}

class SendConfirmationEmail{
    public void sendConfirmationEmail(String email){
        System.out.println("Derzhi kod");
    }
}

interface PaymentProcess {
    void paymentSucces();
}

class CardPayment implements PaymentProcess{
    @Override
    public void paymentSucces(){
        System.out.println("oplata throw card");
    }
}







// public double getPrice() {
//         return price;
//     }

//    public void setPrice(double price) {
//        this.price = price;
//     }

    // public void sendConfirmationEmail(String email) {
    //     System.out.println("Confirmation email sent to: " + email);
    // }

    
// public double calculateTotalPrice() {
//     return quantity * price * 0.9;
// }

// public void processPayment(String paymentDetails) {
//     System.out.println("Payment processed using: " + paymentDetails);
// }