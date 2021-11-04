package hello;

import java.util.ArrayList;
import java.util.List;

public class CommunityWithVIPs {
    List<VeryImportantPerson> theGroup = new ArrayList();

    public void addPersonToCommunity(VeryImportantPerson person) {
        theGroup.add(person);
    }

    public VeryImportantPerson getNthPersonFromCommunity(int n) {
        return theGroup.get(n);
    }
}
