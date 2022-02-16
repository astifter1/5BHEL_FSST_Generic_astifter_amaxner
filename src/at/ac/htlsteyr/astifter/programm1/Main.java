package at.ac.htlsteyr.astifter.programm1;


import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();

        //Testing
        int i=0;
        s.push(25);
        s.push(32);
        s.pull();
       /* i = s.pull();
        System.out.println(i);

        i = s.pull();
        System.out.println(i);
*/
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

        try {
            if(stackpointer >= 10) {
                throw new Stackoverflow();
            }

        } catch (Stackoverflow stackoverflow) {
            stackoverflow.printStackTrace();
        }
        array[stackpointer] = value;
        stackpointer++;

    }

    T pull(){


        try {
            if(stackpointer == 0){
                throw new Stackunderflow();
            }
        } catch (Stackunderflow stackunderflow) {
            stackunderflow.printStackTrace();
        }

        return array[stackpointer];
    }

}

class Stackoverflow extends Exception{
    public Stackoverflow(){
        System.out.println("Stackoverflow Error");
    }
}

class Stackunderflow extends Exception{
    public Stackunderflow(){
        System.out.println("Stackunderflow Error");
    }
}