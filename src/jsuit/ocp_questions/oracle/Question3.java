package jsuit.ocp_questions.oracle;

import java.io.Closeable;
import java.io.IOException;

public class Question3 {

    public static void main(String[] args){

        System.out.println("Question3.main");


    }

    static class MyResource1 implements Closeable {
        public void close() throws IOException {
            System.out.print("1 ");
//            throw new IOException();
        }
    }
    static class MyResource2 implements AutoCloseable {
        public void close() throws IOException {
            System.out.print("2 ");
//            throw new IOException();
        }
    }

    static class TestRes {
        public static void main(String[] args) {
            try (MyResource1 r1 = new MyResource1(); MyResource2 r2 = new MyResource2();) {
                System.out.print("T ");
            } catch (IOException ioe) {
                System.out.print("IOE ");
            } finally {
                System.out.print("F ");
            }
            try (MyResource2 r2 = new MyResource2(); MyResource1 r1 = new MyResource1()) {
                System.out.print("T ");
            } catch (IOException ioe) {
                System.out.print("IOE ");
            } finally {
                System.out.print("F ");
            }
        }
    }
}
