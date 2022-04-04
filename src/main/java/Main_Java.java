import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import javax.imageio.spi.ServiceRegistry;
public class Main_Java {
    public static void main(String[] args) {
        Student s=new Student();
        s.setSid(11);
        s.setSname("E");
        s.setSage(60);
        Configuration configuration = new Configuration().configure();
        // System.out.println(configuration.getProperty("hibernate.connection.url"));
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        //Configuration con=new Configuration().configure().addAnnotatedClass(Student.class);
        //SessionFactory sf=con.buildSessionFactory();
        Session s1=sessionFactory.openSession();
        Transaction t= s1.beginTransaction();
        s1.save(s);
        t.commit();
    }
}
