package Section35;

public class exceptionDemo {

    public static void main(String[] args) {

        int a = 25;
        int b = 5;
        int c = 0;

        // One Try block may have Multiple Catch blocks
        // The try block is always followed by Catch block
        try{
            int x = b/c;
        } catch (Exception e){
            //System.out.println("The exception is caught.");
            e.printStackTrace();
        }

        finally {
            System.out.println("Anyways I will get executed.");
        }
    }
}
