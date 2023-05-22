public class SimpleProgram {

    public static void main(String[] args) {
        // decision making
        int age = 25;
        if(age > 25){
            System.out.println("You are an adult");
        }else{
            System.out.println("You are not an adult yet");
        }

        // Iteration
        while (age <= 18){
            System.out.println("You are aging by 1 year at a time");
            age++;
        }
    }
}
