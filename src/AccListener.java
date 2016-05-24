
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

import AccountManager.AccountManager;

/**
 * Application Lifecycle Listener implementation class AccListener
 *
 */
@WebListener
public class AccListener implements ServletContextListener {

	/**
	 * Default constructor.
	 */
	public AccListener() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see ServletContextListener#contextDestroyed(ServletContextEvent)
	 */
	public void contextDestroyed(ServletContextEvent arg0) {
		// TODO Auto-generated method stub
	}

	/**
	 * @see ServletContextListener#contextInitialized(ServletContextEvent)
	 */
	public void contextInitialized(ServletContextEvent arg0) {
		AccountManager accManager = new AccountManager();
		arg0.getServletContext().setAttribute("Account Manager", accManager);
	}

}
