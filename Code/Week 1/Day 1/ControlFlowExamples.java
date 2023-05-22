public class ControlFlowExamples {
    public static void main(String[] args) {
        // if, if-else, switch-case
        // for, for each, while, do-while

        // if
        int age = 25;
        if (age >= 18){
            System.out.println("you are an adult");
        }

        //if - else
        if(age >= 18){
            System.out.println("you are an adult");
        }else{
            System.out.println("You are not an adult");
        }

        // switch case
        switch(age){
            case 25:
                System.out.println("You are 25");
                break;
            default:
                System.out.println("You are not 25");
                break;
        }

        // for

        for(int i = 0; i < 5; i++){
            System.out.println(i);
        }

        // while
        int i = 0;
        while(i < 5){
            System.out.println(i);
            i++;
        }

        // do while
        do{
            System.out.println(i);
            i++;
        }while(i < 5);
    }   
}
