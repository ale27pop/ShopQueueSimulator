import BusinessLogic.Controller;
import View.View;

public class Main {
    public static void main( String[] args ) throws InterruptedException {
        View view = new View();
        Controller controller = new Controller(view);
    }
}
