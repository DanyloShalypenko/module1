import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Введите текущее положение коня: ");
            String currentPosition = scanner.next();
            System.out.print("Введите клетку, в которую вы хотите передвинуть коня: ");
            String targetPosition = scanner.next();

            if (checkValidMove(currentPosition, targetPosition)) {
                System.out.println("Ход коня возможен.");
            } else {
                System.out.println("Ход коня невозможен.");
            }
        }
    }

    public static boolean checkValidMove(String currentPos, String targetPos) {

        int moveX = Math.abs(currentPos.charAt(0) - targetPos.charAt(0));
        int moveY = Math.abs(currentPos.charAt(1) - targetPos.charAt(1));

        boolean validMove = (moveX == 1 && moveY == 2) || (moveX == 2 && moveY == 1);
        boolean validPos = checkValidPosition(currentPos) && checkValidPosition(targetPos);

        return validMove && validPos;
    }

    public static boolean checkValidPosition(String position) {
        char letter = position.charAt(0);
        char number = position.charAt(1);
        return letter >= 'a' && letter <= 'h' && number >= '1' && number <= '8';
    }
}