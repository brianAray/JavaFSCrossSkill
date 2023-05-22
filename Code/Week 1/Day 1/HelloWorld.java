public class HelloWorld {

    public static void main(String[] args){
        Printer messagePrinter = new Printer();
        messagePrinter.print("Hello World");
        messagePrinter.print("World WOrld world");
    }

}

class Printer {
    //fields are properties or variables associated with the class
    int number;
    String name;

    // methods are functions associated with an object
    public void print(String message){
        System.out.println(message);
    }

}