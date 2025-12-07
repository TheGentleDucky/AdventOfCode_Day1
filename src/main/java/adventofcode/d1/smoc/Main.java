package adventofcode.d1.smoc;

public class Main {

    public static void main(String[] args) {
        adventofcode.d1.smoc.PasswordSolver solver = new adventofcode.d1.smoc.PasswordSolver();

        try {
            int password = solver.solve("Input.txt");
            System.out.println("The password is: " + password);
        } catch (Exception e) {
            System.err.println("Failed to compute password: " + e.getMessage());
        }
    }
}