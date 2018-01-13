package jsuit.ocp_questions.whizlabs.ocpjp7;

import jsuit.ocp_questions.whizlabs.ocpjp7.Question3.StaticChild;
import jsuit.ocp_questions.whizlabs.ocpjp7.Question3.DynamicChild;

public class Question3 {

    static class StaticChild {
    }

    class DynamicChild {
    }

}

class SideClass {

    Question3.StaticChild sc = new StaticChild();
    StaticChild scALone = new StaticChild(); // works only with import

    Question3.DynamicChild dc = new Question3().new DynamicChild();
    DynamicChild dcAlone = new Question3().new DynamicChild(); // works only with import

}
