package at.ac.htlsteyr.astifter.programm1;


import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();//Creating a Stack Object with the generic data type Integer

        //Testing
        int i=0;
        //Check if an Overflow occured
        try {
            s.push(25);
            s.push(32);

        } catch (ArrayIndexOutOfBoundsException e){//Bypass the ArrayIndexOutOfBoundsException
            try {
                throw new Stackoverflow();
            } catch (Stackoverflow stackoverflow) {
                stackoverflow.printStackTrace();
            }
        }
        s.pull();
       /* i = s.pull();
        System.out.println(i);

        i = s.pull();
        System.out.println(i);
*/
    }
}

class Stack<T> {

    //Make an Array and an Object with a length of 10
    T array[];
    Object a = new Object[10];
    int stackpointer = 0;

    //Constructor that initalises the Array with the Object
    public Stack(){
        array = (T[])new Object[10];
    }

    //Add a value to Stack and increment the Stackpointer
    void push(T value) {
        array[stackpointer] = value;
        stackpointer++;

    }

    //Get a value from stack and decrement the Stackpointer
    T pull(){
        //Check if the Stack is empty
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

//Exception classes
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