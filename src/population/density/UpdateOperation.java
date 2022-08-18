package population.density;
import org.hibernate.cfg.Configuration;
import org.hibernate.SessionFactory;
import org.hibernate.Session;
import java.util.Scanner;
import org.hibernate.Transaction;
public class UpdateOperation {
   public static void main(String...args)
   {
       Configuration c1 = new Configuration();
       Configuration c2 = c1.configure();
       SessionFactory sf = c2.buildSessionFactory();
       Session session = sf.openSession();
       Transaction tx  = session.beginTransaction();
      Scanner sc = new Scanner(System.in);       
       System.out.println("enter your regno of the record to be updation");
       String regNo = sc.next();
       Signup sg = (Signup) session.get(Signup.class,regNo);
       if (sg==null)
       {
           System.out.println("no record found");
           System.exit(0);
       }
       else
       {
           System.out.println(sg.getRegNo()+" "+sg.getName()+" "+sg.getCity()+" "+sg.getPincode()+" "+sg.getAge()+" "+sg.getContactNo()+" "+sg.getPassword()+" "+sg.getConfirmPassword());
       }
       System.out.println("enter 1 for name");
       System.out.println("enter 1 for city");
       System.out.println("enter 1 for pincode ");
       System.out.println("enter 1 for contact number");
       System.out.println("enter 1 for age");
       System.out.println("enter 1 for password");
       int choice = sc.nextInt();
       switch(choice)
       {
           case 1:
               System.out.println("enter the  update name");
               String uname = sc.next();
               sg.setName(uname);
               session.update(sg);
               System.out.println("record updated");
               tx.commit();
       }
          }
}
