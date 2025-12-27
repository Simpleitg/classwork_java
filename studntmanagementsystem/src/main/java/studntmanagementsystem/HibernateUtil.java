package studntmanagementsystem;

import org.hibernate.cfg.Configuration;
import org.hibernate.SessionFactory;
/* ---Session-Factory--- :
 * The session factory is a crucial component in hibernate, serving as a factory for creating Session objects.
 * - It is a interface.
 * - It is responsible for managing Database-connections, transaction management.
 * Handling the mapping of java objects to the database tables.
 * 
 * 
 * ---Configuration---:
 * -Configuration is a class which is in "org.hibernate.cfg" package.
 * -It achieves the hibernate framework.
 * -It reads both configuration and mapping files.
 * -It checks whether the configuration file  is syntactically correct (or) not.
 * -If the configuration file is not valid then, it will throw an Exception.
 * 
 * ---buildSessionFactory() method gathers the meta data which is in  the configuration object.
 * -From cfg object it takes the jdbc information and creates a JDBC-connection.
*/
public class HibernateUtil {
	
	private static final SessionFactory sf=buildSessionFactory();

	private static SessionFactory buildSessionFactory() {
		
		try {
			
			return new Configuration().configure("hibernet.cfg.xml").addAnnotatedClass(Student.class).buildSessionFactory();
		}
		catch(Throwable e) 
		{
			throw new ExceptionInInitializerError(e);
			
		}
		
		
	}
	public static SessionFactory getSessionFactory() {
	        return sf;
	}
}