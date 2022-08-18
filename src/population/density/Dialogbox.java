
package population.density;
import org.hibernate.Session;
import org.hibernate.cfg.Configuration;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import javax.swing.JOptionPane;
public class Dialogbox {
     public static void main(String[] args) {
     Configuration c1 = new Configuration();
     Configuration c2 = c1.configure();
     SessionFactory sf = c2.buildSessionFactory();
     Session session = sf.openSession();
     Transaction tx = session.beginTransaction();
     String regNo = JOptionPane.showInputDialog(null,"enter your registration number");
     String name = JOptionPane.showInputDialog(null,"enter your name");
     String city = JOptionPane.showInputDialog(null,"enter your city");
     String pincode = JOptionPane.showInputDialog(null,"enter your pincode");
     String contactNo = JOptionPane.showInputDialog(null,"enter your contact number");
     String age = JOptionPane.showInputDialog(null,"enter your age");
     String password = JOptionPane.showInputDialog(null,"enter your Password");
     String confirmPassword = JOptionPane.showInputDialog(null,"enter your Confirm password");
     Signup sign = new Signup(regNo, name , city, pincode, contactNo, age, password, confirmPassword);
     session.save(sign);
     tx.commit();
     session.close();
     System.out.println("record inserted!!!!!");
    }
    
}
 