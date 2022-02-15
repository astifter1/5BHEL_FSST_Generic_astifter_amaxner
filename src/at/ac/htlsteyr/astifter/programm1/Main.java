package at.ac.htlsteyr.astifter.programm1;


import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        Stack<> head = new Stack<>();
    }
}

class Stack{
    List list = new LinkedList();

    public <T> List<T> fromArrayToList(T[] a) {
        return Arrays.stream(a).collect(Collectors.toList());
    }

    public Stack(){

    }

    void push(){

    }
    void pull(){

    }

}