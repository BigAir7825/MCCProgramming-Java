import java.sql.*;

public class TestDB {
 public static void connect() {
        Connection conn = null;
        try {
            // we're using an sqlite database
            // note the absolute file path to the database file
            String url = "jdbc:sqlite:C:/sqlite/db/products.db";
            // create a connection to the database
            conn = DriverManager.getConnection(url);
            // create a statement
            Statement st = conn.createStatement();
            // get ResultSet using executeQuery and SQL
            ResultSet rs = st.executeQuery("SELECT * FROM Products ORDER BY Description DESC");

            // loop through the ResultSet with the next method
            // display the data
            while (rs.next()) {
                System.out.println(rs.getString("ProductCode"));
                System.out.println(rs.getString("Description"));
                System.out.println(rs.getString("Price"));
            }
            
            
            //insert pyt
            String sq1 = "INSERT INTO Products "
                    + "VALUES ('pyt', 'Murach''s Python Programming', 57.50)";
            PreparedStatement ps = conn.prepareStatement(sq1);
            ps.executeUpdate();
            System.out.println("Insertion done");
            
            
            //delete htmlMurach's HTML and CSS
            String sq2 = "DELETE FROM Products "
                    + "WHERE Description = 'Murach''s HTML and CSS'";
            PreparedStatement ps1 = conn.prepareStatement(sq2);
            ps1.executeUpdate();
            System.out.println("Deletion done");
            
            
            //modify java
           String sq3 = "UPDATE Products SET "
                   + "   Description ='Murach''s Java Programming', "
                   + "   Price = 62.5 "
                   + "WHERE ProductCode = 'java'";
            PreparedStatement ps2 = conn.prepareStatement(sq3);
            ps2.executeUpdate();
            System.out.println("Modification done");
            
            
            //print again
            ResultSet rs1 = st.executeQuery("SELECT * FROM Products ORDER BY Description DESC");
            System.out.println("\n\nReprinting\n\n");
            while (rs1.next()) {
                System.out.println(rs1.getString("ProductCode"));
                System.out.println(rs1.getString("Description"));
                System.out.println(rs1.getString("Price"));
            }            
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (conn != null) {
                    conn.close(); //this closes he connection object if it exists
                }
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }
    public static void main(String[] args) {
        connect();
    }
}
