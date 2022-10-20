package adairassignment9;
public class AdairAssignment9 {
    public static void main(String[] args) {
        // display a welcome message
        System.out.println("Welcome to the Customer Type Test application\n");

        // get and display the discount percent for a customer type
        CustomerType d = CustomerType.CUSTOMER_RETAIL;
        double discountPercent = (AdairAssignment9.getCustomerType(d))*100;
        System.out.println("The discount percent is " + discountPercent + "%");
        
        // display the value of the toString method of a customer type
        CustomerType printString = CustomerType.CUSTOMER_RETAIL;
        System.out.println(printString.toString());
    }

    // a method that accepts a CustomerType enumeration
    public static double getCustomerType(CustomerType customerType) {
        double d = 0;
        if (customerType == customerType.CUSTOMER_RETAIL)
            d = .1;
        if (customerType == customerType.CUSTOMER_TRADE)
            d = .3;
        if (customerType == customerType.CUSTOMER_COLLEGE)
            d = .2;
        return d;
    }
}
