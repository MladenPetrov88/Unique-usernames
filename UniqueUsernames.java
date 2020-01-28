import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class UniqueUsernames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = Integer.parseInt(scanner.nextLine());

        Set<String> names = new LinkedHashSet<>();

        for (int i = 0; i < count; i++) {
            String currentName = scanner.nextLine();
            names.add(currentName);
        }

        for (String name : names) {
            System.out.println(name);
        }

    }
}
