package app;
import app.MyMethodClass;

public class App {

    public static void main(String[] args) throws Exception {
        MyMethodClass mmc = new MyMethodClass(5);
        System.out.println(mmc.getNumber());

        System.out.println("New commit");
        System.out.println("Even newer commit");

        System.out.println("Created a new branch with this feature!");
    }
    
}