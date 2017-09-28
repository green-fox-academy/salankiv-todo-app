import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TodoApp {

	public static void main(String[] args) {

		if (args.length == 0) {
			greetings();
		} else if (args[0].equals("-l")) {
			listing();
		} else if (args[0].equals("-a")) {
			addTask(args[1]);
		} else if (args[0].equals("-r")) {
			System.out.println("remove task");
		} else if (args[0].equals("-c")) {
			System.out.println("complete task");
		} else {
			System.out.println("Unsupported argument");
			greetings();
		}

	}

	public static void greetings() {
		try {
			Path head = Paths.get("/home/salankiv/greenfox/salankiv-todo-app/assets/head.txt");
	//clear screen		System.out.print("\033\143");
			List<String> lines = Files.readAllLines(head);
			for (String l : lines) {
				System.out.println(l);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void listing() {
		try {
			Path taskFile = Paths.get("/home/salankiv/greenfox/salankiv-todo-app/assets/tasks.txt");
			List<String> lines = Files.readAllLines(taskFile);
			for (int i = 0; i < lines.size(); i++) {
				System.out.println((i + 1) + ". " + lines.get(i));
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public static void addTask(String taskFromUser) {

		try {
			Path taskFile = Paths.get("/home/salankiv/greenfox/salankiv-todo-app/assets/tasks.txt");
			List<String> taskName = new ArrayList<>();
			taskName.add(taskFromUser);
			Files.write(taskFile, taskName, StandardOpenOption.APPEND);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}


}
