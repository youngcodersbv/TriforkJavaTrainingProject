package hello;

import java.util.ArrayList;
import java.util.List;

public class CommunityWithGenerics {
    List<AbstractPerson> theGroup = new ArrayList();

    public void addPersonToCommunity(AbstractPerson person) {
        theGroup.add(person);
    }

    public AbstractPerson getNthPersonFromCommunity(int n) {
        return theGroup.get(n);
    }

    /*public void addSomethingElse(Object something) {
        theGroup.add(something);
    }*/
}
