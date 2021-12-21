package CreationalPatterns.Singleton;

import java.util.ArrayList;

public class Logger {
	private static Logger logger = new Logger();
	private ArrayList<String> log;

	private Logger() {
		log = new ArrayList<String>();
	}

	public static synchronized Logger getInstance() {
		if (logger == null)
			logger = new Logger();
		return logger;
	}

	public ArrayList<String> getLog() {
		return log;
	}

	public void log(String msg) {
		log.add(msg);
	}
}
