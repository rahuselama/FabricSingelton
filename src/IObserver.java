//Interface for Observer pattern
import java.util.ArrayList;

public interface IObserver {
    public  void handleEvent(ArrayList<Property> newListOfProperties);
}
