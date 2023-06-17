import java.sql.*;

public class POSTRE {
    String connectionUrl1="jdbc:postgresql://localhost:5432/postgres";
    Connection con1=null;
    ResultSet rs1=null;
    Statement stmt1=null;
    public POSTRE() {
        try {
            Class.forName("org.postgresql.Driver");
            con1 = DriverManager.getConnection(connectionUrl1, "postgres", "makotako");
            stmt1 = con1.createStatement();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    public void add(String _name, int cost, String place) {
        try {
            stmt1.executeUpdate("INSERT INTO public.\"overall\" (name1, cost1, place1)" + "VALUES ('" + _name + "' , '" + cost + "' , '" + place + "')");
        }
        catch(Exception e) {
            try {
                stmt1.executeUpdate("DELETE FROM public.\"overall\"");
            }
            catch(Exception w) {
                System.out.println(w);
            }
            System.out.println(e);
        }
    }
    public void add1(String name, int cost) {
        try {
            stmt1.executeUpdate("INSERT INTO public.\"Cheezeburgeer\" (name1, cost1)" + "VALUES ('" + name + "' , '" + cost + "')");
        }
        catch(Exception e) {
            try {
                stmt1.executeUpdate("DELETE FROM public.\"Cheezeburgeer\"");
            }
            catch(Exception w) {
                System.out.println(w);
            }
            System.out.println(e);
        }
    }
    public void add2(String name, int cost) {
        try {
            stmt1.executeUpdate("INSERT INTO public.\"CoffeeDoom\" (name1, cost1)" + "VALUES ('" + name + "' , '" + cost + "')");
        }
        catch(Exception e) {
            try {
                stmt1.executeUpdate("DELETE FROM public.\"CoffeeDoom\"");
            }
            catch(Exception w) {
                System.out.println(w);
            }
            System.out.println(e);
        }
    }
    public void add3(String name, int cost) {
        try {
            stmt1.executeUpdate("INSERT INTO public.\"Johnspapa\" (name1, cost1)" + "VALUES ('" + name + "' , '" + cost + "')");
        }
        catch(Exception e) {
            try {
                stmt1.executeUpdate("DELETE FROM public.\"Johnspapa\"");
            }
            catch(Exception w) {
                System.out.println(w);
            }
            System.out.println(e);
        }
    }
}
