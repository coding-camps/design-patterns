package utils;

public class ReflectUtil {

    /**
     * print current method.
     */
    public static void printCurrentMethod() {
        StackTraceElement[] traces = Thread.currentThread().getStackTrace();
        int index = 2;
        String className = traces[index].getClassName();
        String methodName = traces[index].getMethodName();
        System.out.println(className + " => " + methodName);
    }
}
