
package population.density;
import org.hibernate.Session;
import org.hibernate.cfg.Configuration;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import java.util.Scanner;
public class CrudOperation {
    public static void main(String[] arg)
    {
       SessionFactory sf = new Configuration().configure().buildSessionFactory();
       Session session = sf.openSession();
       Transaction tx = session.beginTransaction();
       Scanner sc = new Scanner(System.in);
       System.out.println("enter the regno");
       String regNo = sc.next();
       AdminLogin sg = (AdminLogin) session.get(AdminLogin.class, regNo);
       if (sg==null)
       {
           System.out.println("no record found");
       }
       else
       {
           System.out.println(sg.getAdminId()+" "+sg.getAdminPassword());
       }
    }
    
}
