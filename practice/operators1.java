public class operators1 
{
    public static void main(String[] args) 
    {
        
        int quantity=5;
        double itemPrice=12.99, taxRate=0.08, discount=2.50,subtotal,taxAmount,discountedAmount,finalTotal;
        
        
        subtotal= itemPrice * quantity;
        taxAmount= subtotal*taxRate;
        discountedAmount= subtotal - discount;
        finalTotal= discountedAmount + taxAmount;

        
        System.out.println("Shopping Calculator Results:");
        System.out.println("-------------------------");
        System.out.println("Item Price: $" + itemPrice);
        System.out.println("Quantity: " + quantity);
        System.out.println("Subtotal: $" + subtotal);
        System.out.println("Tax Amount: $" + taxAmount);
        System.out.println("Discounted Amount: $" + discountedAmount);
        System.out.println("Final Total: $" + finalTotal);
    }
}

/*

Output:

Shopping Calculator Results:
-------------------------
Item Price: $12.99
Quantity: 5
Subtotal: $64.95
Tax Amount: $5.196000000000001
Discounted Amount: $62.45
Final Total: $67.646

NOTE: double has 64-bit precision
      float has 32-bit precision

      i.e why when Tax Amount is in float datatype
      the value comes out to be 5.195999755859375.

*/