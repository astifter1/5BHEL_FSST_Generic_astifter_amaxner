package at.ac.htlsteyr.astifter.programm1;

class Stack<T> {

    //Make an Array and an Object with a length of 10
    T array[];
    int stackpointer = 0;

    //Constructor that initalises the Array with the Object
    public Stack() {
        array = (T[]) new Object[10];
    }

    //Add a value to Stack and increment the Stackpointer
    void push(T value) throws Stackoverflow {
        if (stackpointer >= 10) {
            throw new Stackoverflow();
        }
        array[stackpointer] = value;
        stackpointer++;

    }

    //Get a value from stack and decrement the Stackpointer
    T pop() throws Stackunderflow {
        //Check if the Stack is empty

        if (stackpointer == 0) {
            throw new Stackunderflow();
        }
        stackpointer--;
        return array[stackpointer];

    }
}