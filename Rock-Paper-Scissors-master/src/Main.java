import java.util.Scanner;
public class Main {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        String gameWelcome = "Welcome to rock, paper, scissors. \nPlease press \"1\" for multiplayer or \"2\" for single player";
        System.out.println(gameWelcome);
        int gameModeSelect = scanner.nextInt();

        if (gameModeSelect == 1) {
            String firstPlayerNameText = "Please chose a name for the first player";
            System.out.println(firstPlayerNameText);
            String firstPlayerName = scanner.nextLine();

            String secondPlayerNameText = "Please chose a name for the second player";
            System.out.println(secondPlayerNameText);
            String secondPlayerName = scanner.nextLine();
        } else if (gameModeSelect == 2) {
            String firstPlayerNameText = "Please chose a name for the first player";
            System.out.println(firstPlayerNameText);
            String firstPlayerName = scanner.nextLine();
        }

        rockPaperScissorSout();

        //rockPaperScissorSelectorFirstPlayer(firstPlayerName);
        //rockPaperScissorSelectorSecondPlayer(secondPlayerName);

    }

    public static void rockPaperScissorSelectorFirstPlayer(String firstPlayerName) {
        String selectMSG = "Please select either \"1\" \"2\" \"3\" ";
        System.out.println(selectMSG + firstPlayerName);
        int firstPlayerChoice = scanner.nextInt();
    }

    public static void rockPaperScissorSelectorSecondPlayer(String secondPlayerName) {
        String selectMSG = "Please select either \"1\" \"2\" \"3\" ";
        System.out.println(selectMSG + secondPlayerName);
        int secondPlayerChoice = scanner.nextInt();
    }

    public static int gameDecider(){
        int gameModeKey = 0;
        return gameModeKey;
    }

    public static void rockPaperScissorSout() {
        String[] rockPaperScissors = {"Rock", "Paper", "Scissors"};
        int[] rockPaperScissorsNumbers = {1, 2, 3};
        for (int i = 0; i < rockPaperScissorsNumbers.length; i++) {
            System.out.println(rockPaperScissorsNumbers[i] + " " + rockPaperScissors[i]);
        }
    }




}
