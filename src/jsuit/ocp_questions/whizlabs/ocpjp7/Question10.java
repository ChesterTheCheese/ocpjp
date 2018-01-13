package jsuit.ocp_questions.whizlabs.ocpjp7;

public class Question10 {

    static class MyException extends Exception {
    }

    static void doThrow() throws MyException {
        System.out.println("MyException thrown!");
        throw new MyException();
    }

    public static void main(String[] args) throws MyException {
        MyException e = null;

        if (false) {
            System.out.println("This should not be printed!"); // dead code, but compiles ok
        }

        boolean x = false;
        if (x) {
            System.out.println("This also should not be printed."); // compiles ok
        }

        try {
            doThrow();
        } catch (MyException e1) {
            System.out.println("MyException caught!");
            e = e1;
        } finally {
            System.out.println("Finally executed.");
            throw e;
        }

//        System.out.println("Main method end!"); // unreachable statement, compilation fails

    }
}
