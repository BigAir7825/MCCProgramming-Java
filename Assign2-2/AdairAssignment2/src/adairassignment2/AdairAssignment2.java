package adairassignment2;
import java.util.Scanner;
public class AdairAssignment2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a name: ");
        String fullName = sc.nextLine();
        
        String trimmedName = fullName.trim();
        String nameParts[] = trimmedName.split(" ");
        int numberOfNames = nameParts.length;
        
        if (numberOfNames < 2 || numberOfNames > 3)
            System.out.println("The entered name is not in between 2 and 3 names");
        else if (numberOfNames == 2){
            System.out.println("\nFirst Name: " + nameParts[0]);
            System.out.println("Last Name: " + nameParts[1]);
        } else if (numberOfNames == 3){
            System.out.println("\nFirst Name: " + nameParts[0]);
            System.out.println("Middle Name: " + nameParts[1]);
            System.out.println("Last Name: " + nameParts[2]);            
        }
    }   
}
