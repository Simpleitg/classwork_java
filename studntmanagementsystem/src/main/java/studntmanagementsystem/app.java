package studntmanagementsystem;

import java.time.LocalDate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class app {

	public static void main(String[] args) {
		SessionFactory sf = HibernateUtil.getSessionFactory();
		
		LocalDate d1 = LocalDate.of(2007, 6 , 22);
		
		Student s1 = new Student("S123","Karveti","Hacker",d1,"F","kara@gmaail.com","5843143734");
		
		Session s = sf.openSession();
		
		Transaction tx = s.beginTransaction();
		
		//Student s1 = s.get(Student.class, "S123");//even we give random record sight it will throw null instead of exception.
		//Student s1 = s.load(Student.class, "S121");
		s.save(s1);
		tx.commit();
		s.close();
	}

}

