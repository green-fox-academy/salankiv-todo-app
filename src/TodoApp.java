import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

public class TodoApp {

	public static void main(String[] args) {

		if (args.length == 0) {
			greetings();
		} else if (args[0].equals("-l")) {
			System.out.println("listing tasks");
		} else if (args[0].equals("-a")) {
			System.out.println("adding task");
		} else if (args[0].equals("-r")) {
			System.out.println("remove task");
		} else if (args[0].equals("-c")) {
			System.out.println("complete task");
		} else System.out.println("Please try something else");

	}

	public static void greetings() {
		Path head = Paths.get("/home/salankiv/greenfox/salankiv-todo-app/assets/head.txt");

		try {
			System.out.print("\033\143");
			List<String> lines = Files.readAllLines(head);
			for (String l : lines) {
				System.out.println(l);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
