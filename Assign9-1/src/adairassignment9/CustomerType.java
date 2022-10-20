package adairassignment9;
public enum CustomerType {
    CUSTOMER_RETAIL,
    CUSTOMER_TRADE,
    CUSTOMER_COLLEGE;
    
    @Override
    public String toString() {
        String s = "";
        if (this.ordinal() == 0)
            s = "Retail Customer";
        else if (this.ordinal() == 1)
            s = "Trade Customer";
        else if (this.ordinal() == 2)
            s = "College Customer";
        return s;
    }
}
