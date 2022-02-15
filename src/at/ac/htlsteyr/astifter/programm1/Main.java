package at.ac.htlsteyr.astifter.programm1;


import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Stack<Arrays> s = new Stack<>();


    }
}

class Stack<A> {

    int array[];

    public Stack(){

    }

    void push(int value) {
        int i = 0;
        boolean control = true;

        while (array[i] != 0 && control) {
            if (i >= 10) {
                control = false;
                System.out.println("Array voll");
            }
            i++;

        }
        if (control) {
            array[i] = value;
        }

    }

        int pull(int i){
            return array[i];
    }

}