import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class TodoApp {

	public static void main(String[] args) {
		greetings();
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
