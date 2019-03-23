package CallEg;

class CallEg {

    public void methodA() throws ArithmeticException {
        try {
            methodB();
        }catch(ArithmeticException ae){
            ae.getStackTrace();
        }
    }

    public void methodB() throws ArithmeticException {
        try {
            methodC();
        }catch(ArithmeticException ae){
            ae.getStackTrace();
        }
    }


    public void methodC() throws ArithmeticException {
        try {
            int error = 2 / 0;

        }catch(ArithmeticException ae){
            ae.getStackTrace();
        }
    }
}

public class TestTrace {

    public static void main(String[] args) {
        CallEg eg = new CallEg();   // use default constructor
        try {
            eg.methodA();
        } catch (ArithmeticException oops) {
            oops.printStackTrace();
        }

    }

}
