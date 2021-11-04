package hello;

import java.util.ArrayList;
import java.util.List;

public class CommunityWithoutGenerics {
    List theGroup = new ArrayList();

    public void addPersonToCommunity(AbstractPerson person) {
        Object unknown = (Object) person;
        theGroup.add(unknown);
    }

    public AbstractPerson getNthPersonFromCommunity(int n) {
        Object object = theGroup.get(n);
        return (AbstractPerson) object;
    }

    public void addSomethingElse(Object something) {
        theGroup.add(something);
    }
}
