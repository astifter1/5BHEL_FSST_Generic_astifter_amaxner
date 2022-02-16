package at.ac.htlsteyr.astifter.programm1;


import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();

        //Testing
        int i=0;
        s.push(25);
        s.push(32);
        i = s.pull();
        System.out.println(i);

        i = s.pull();
        System.out.println(i);

    }
}

class Stack<T> {

    T array[];
    Object a = new Object[10];
    int stackpointer = 0;

    public Stack(){
        array = (T[])new Object[10];
    }

    void push(T value) {
        array[stackpointer] = value;
        stackpointer++;
    }

    T pull(){
        return array[stackpointer];
    }

}