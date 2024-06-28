package com.javarush.task.jdk13.task41.task4121;

import com.javarush.task.jdk13.task41.task4121.support.*;

public class CRM {

    private TechSupport techSupport;

    public CRM() {
        techSupport = new CallCenter();
        HelpDesk helpDesk = new HelpDesk();
        SysAdmin sysAdmin = new SysAdmin();
        ITDirector itDirector = new ITDirector();
        techSupport.setNextLevel(helpDesk);
        helpDesk.setNextLevel(sysAdmin);
        sysAdmin.setNextLevel(itDirector);


    }

    public void register(String problem) {
        System.out.println(problem);
        techSupport.solve(problem.trim().toLowerCase());
    }
}
