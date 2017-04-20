package GrapeFrame.GrapeConfig;

import httpServer.booter;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		booter booter = new booter();
		System.out.println("GrapeConfig!");
		try {
			System.setProperty("AppName", "GrapeConfig");
			booter.start(108);
		} catch (Exception e) {

		}
	}
}
