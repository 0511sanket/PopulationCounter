
package population.density;
import org.hibernate.Session;
import org.hibernate.cfg.Configuration;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import java.util.Scanner;

public class PopulationCounter {

   
    public static void main(String[] args) {
     Configuration c1 = new Configuration();
     Configuration c2 = c1.configure();
     SessionFactory sf = c2.buildSessionFactory();
     Session session = sf.openSession();
     Transaction tx = session.beginTransaction();
     Scanner sc = new Scanner(System.in);
     System.out.println("enter your registrstion number");
     String regNo = sc.next();
     System.out.println("enter your name");
     String name = sc.next();
     System.out.println("enter your city");
     String city = sc.next();
     System.out.println("enter your pincode");
     String pincode = sc.next();
     System.out.println("enter your contact no");
     String contactNo = sc.next();
     System.out.println("enter your age");
     String age = sc.next();
     System.out.println("enter your password");
     String password = sc.next();
     System.out.println("confirm your password");
     String confirmPassword = sc.next();
     Signup sign = new Signup( regNo,name , city, pincode, contactNo, age, password, confirmPassword);
     session.save(sign);
     tx.commit();
     session.close();
     System.out.println("record inserted!!!!!");
    }
    
}
