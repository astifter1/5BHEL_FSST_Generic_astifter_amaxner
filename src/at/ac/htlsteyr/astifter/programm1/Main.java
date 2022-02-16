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
            s.pop();

        } catch (ArrayIndexOutOfBoundsException | Stackunderflow | Stackoverflow e){//Bypass the ArrayIndexOutOfBoundsException
            try {
                throw new Stackoverflow();
            } catch (Stackoverflow stackoverflow) {
                stackoverflow.printStackTrace();
            }
        }
    }
}


