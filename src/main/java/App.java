import java.io.Console;

public  class App {
    public static void main(String[] args) {
        Console myConsole = System.console();
        System.out.println("THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG");
        String stringLength = myConsole.readLine();
        String stringplainText = myConsole.readLine();
    }
 }