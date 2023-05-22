public class ExceptionExamples {

    public static void main(String[] args) {

        try{
            // int[] numArray = {1, 2, 3, 4};
            // System.out.println(numArray[4]);
            System.out.println(1/0);
        }catch(ArrayIndexOutOfBoundsException e){
            // Exception handling for Exception type ArrayIndexOutOfBoundsException
            System.out.println("Whoops, I tried an index that was out of bounds. SOrry!!");
        }catch(Exception e){
            // Will catch all exceptions
            System.out.println("I have caught a stray exception: " + e);
        }finally{
            // code to be executed regardless of exception occurrence
            System.out.println("Hello I am in the finally block, I will always run");
        }

        System.out.println("Hi I got to this part of the code~!!!!!");
    }
    
}
