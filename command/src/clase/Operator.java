package clase;

import java.util.ArrayList;
import java.util.List;

public class Operator {

    List<ICommand> stivaComenzi = new ArrayList<>();

    public void invoca(ICommand command) {

        stivaComenzi.add(command);
    }

    public void undo(ICommand command) {
        if(stivaComenzi.size()>0) {
            stivaComenzi.get(0).executa();
            stivaComenzi.remove(stivaComenzi.get(0));
        }
    }
}
