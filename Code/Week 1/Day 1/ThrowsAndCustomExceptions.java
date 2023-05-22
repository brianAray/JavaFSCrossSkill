public class ThrowsAndCustomExceptions {

    public static void main(String[] args) {
        // try{
        //     throw new MyException("I have been thrown");
        // }catch(MyException e){
        //     System.out.println(e.getMessage());
        // }

        Person person = new Person();
        try {
            person.sayHello();
        } catch (MyException e) {
            e.printStackTrace();
        }

        System.out.println("Hello, I ahve not crashed, I have been handled correctly");
    }
}

// RuntimeException = Unchecked
// Exception = Checked
class MyException extends Exception {
    public MyException(String message){
        super(message);
    }
}

class Person {

    public void sayHello() throws MyException{
        System.out.println("Hello");
        throw new MyException("I have been thrown inside an object");
    }
}