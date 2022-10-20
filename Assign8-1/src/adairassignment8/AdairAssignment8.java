package adairassignment8;
public class AdairAssignment8 {
    public static void main(String[] args) {
        
        // Call the heading and date
        AdairDate.datemain();
        System.out.println("\n\n  Displayable Interface Application\n");

        Displayable e1 = new Employee(5, "Roosevelt", "Theodore");
        Displayable e2 = new Employee(1, "John", "Smith");
        Displayable e3 = new Employee(2, "Smyth", "Jahn");
        Displayable e4 = new Employee(3, "Smithe", "Jon");
        Displayable e5 = new Employee(4, "Adair", "Will");

        Displayable p1 = new Product("java", "Murach's Beginning Java", 49.50);
        Displayable p2 = new Product("jsps", "Murach's Servlets", 53.00);
        
        System.out.println("  E M P L O Y E E S");
        System.out.println("  First Name Last Name  Salary $$$  Department");
        System.out.println("  ---------- ---------  ----------  ----------");
        AdairAssignment8.display(e1);
        AdairAssignment8.display(e2);
        AdairAssignment8.display(e3);
        AdairAssignment8.display(e4);
        AdairAssignment8.display(e5);
        
        System.out.println("\n  P R O D U C T S");
        System.out.println("  Code       Title                  Price Each");
        System.out.println("  ---------- ---------------------  ----------");
        AdairAssignment8.display(p1);
        AdairAssignment8.display(p2);
        
        System.out.println();        
    }

    private static void display(Displayable d) {
        System.out.printf(d.toString());
    }
}                
