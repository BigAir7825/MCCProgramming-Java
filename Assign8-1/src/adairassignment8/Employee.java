package adairassignment8;
public class Employee implements DepartmentConstants, Displayable{

    private int department;
    private String firstName;
    private String lastName;

    public Employee(int department, String lastName, String firstName) {
        this.department = department;
        this.lastName = lastName;
        this.firstName = firstName;
    }
    
    @Override
    public String toString() {
        String Department = "Unknown";
        if (department == 1)
            Department = "Administration";
        else if (department == 2)
            Department = "Editorial";
        else if (department == 3)
            Department = "Marketing";
        String nameAndDepartment = (firstName + " " + lastName + " (" + Department + ") "); 
        return nameAndDepartment;
    }
}