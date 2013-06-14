import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;


public class Logging {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws SecurityException, IOException {
		
		Logger l = Logger.getLogger("Test");
		Handler h = new FileHandler("logging.txt");
		SimpleFormatter f = new SimpleFormatter();
		
		h.setFormatter(f);
		l.addHandler(h);
		l.setLevel(Level.FINE); // chose a level for logging
		
		l.severe("LogLevel SEVERE");
		l.info("LogLevel INFO");
		
		// never shown, as Log level was set to fine, which is lower than finest
		l.finest("LogLevel Finest");
		
		l.log(Level.SEVERE, "This is a log message set to severe.");
	}

}
