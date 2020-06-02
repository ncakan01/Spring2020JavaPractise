package OfficeHours;

import java.util.ArrayList;

public class ScrumTeam {

    ArrayList<Tester> testersTeam = new ArrayList<>();
    ArrayList<Developer> devpTeam = new ArrayList<>();


    public void hireATester(Tester tester){
        testersTeam.add(tester);
    }

    public void fireATester(long id) {
        testersTeam.removeIf(p->p.employeeID ==id) ;   // p reperesent evey single element

    }

    public void hireADeveloper(Developer developer){
        devpTeam.add(developer);
    }
    protected void fireADevelop(long id){
        devpTeam.removeIf(p-> p.employeeID==id);
    }



}
