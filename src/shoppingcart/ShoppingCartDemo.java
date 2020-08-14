/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shoppingcart;

/**
 *
 * @author Kennith Yu
 */
public class ShoppingCartDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PaymentServiceFactory factory = PaymentServiceFactory.getInstance();
        PaymentService creditService = factory.getPaymentService(PaymentServiceType.CREDIT);
        PaymentService debitService = factory.getPaymentService(PaymentServiceType.DEBIT);
        
        Cart cart = new Cart();
        cart.addProduct(new Product("shirt", 50));
        cart.addProduct(new Product("pants", 60));
        
        cart.setService(creditService);
        cart.payCart();
        
        cart.setService(debitService);
        cart.payCart();
    }
    
}
