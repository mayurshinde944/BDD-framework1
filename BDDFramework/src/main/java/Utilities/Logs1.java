package Utilities;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Logs1 {

	/*private static Logger logger = LogManager.getLogger();

	private Logs1() {

	}

	private Logs1 logs = new Logs1();

	public Logs1 getLogs1() {
		
		return logs;

	}
	public Logger getLogger()
	{
		return logger;
		
	}*/
	public static void main(String[] args)
	{
		Logs.getLog().getLogger("Logs1").info("Message1");
	}
}
