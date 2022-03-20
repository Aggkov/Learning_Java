public class Main {

    public static void main(String[] args) {

        Stack s = new Stack();

            //push 4 items in Stack (1,2,3,4)
        for(int i = 1; i <= 4; i++)
            s.push(i);


        System.out.println(s.pop());
        System.out.println(s.pop());

        //push 5,6,7,8 in stack
        for(int i = 4; i < 9; i++)
            s.push(i);

        //do as many pops (and print them) until stack is empty
        while(!s.empty())
            System.out.println(s.pop());


    }

}
