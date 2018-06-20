package helper;

import org.apache.log4j.Logger;

public class Log {

	final static Logger Log = Logger.getLogger(Log.class);

	public static void info(String words) {

		Log.info(words);

	}

	public static void warn(String words) {

		Log.warn(words);

	}

	public static void error(String words) {

		Log.error(words);

	}

	public static void fatal(String words) {

		Log.fatal(words);

	}

	public static void debug(String words) {

		Log.debug(words);
	}

}
