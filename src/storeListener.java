

import java.sql.Connection;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

import AccountManager.storeManager;

/**
 * Application Lifecycle Listener implementation class storeListener
 *
 */
@WebListener
public class storeListener implements HttpSessionListener, ServletContextListener {

    /**
     * Default constructor. 
     */
    public storeListener() {
        // TODO Auto-generated constructor stub
    }

	/**
     * @see HttpSessionListener#sessionCreated(HttpSessionEvent)
     */
    public void sessionCreated(HttpSessionEvent arg0)  { 
        arg0.getSession().setAttribute("cart", new cart());
    }

	/**
     * @see HttpSessionListener#sessionDestroyed(HttpSessionEvent)
     */
    public void sessionDestroyed(HttpSessionEvent arg0)  { 
         // TODO Auto-generated method stub
    }

	/**
     * @see ServletContextListener#contextDestroyed(ServletContextEvent)
     */
    public void contextDestroyed(ServletContextEvent arg0)  { 
    	
    }

	/**
     * @see ServletContextListener#contextInitialized(ServletContextEvent)
     */
    public void contextInitialized(ServletContextEvent arg0)  { 
    	myDB db = new myDB();
    	Connection con = db.getConnection();
    	storeManager sm = new storeManager(con);
    	
       arg0.getServletContext().setAttribute("storeManager", sm);
    }
	
}
