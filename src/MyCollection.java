
import java.util.ArrayList;
import java.util.Collections;

public class MyCollection {

    public static void main(String[] args) {
            ArrayList<Integer> numbers = new ArrayList<Integer>();
            numbers.add(5);
            numbers.add(10);
            numbers.add(23);
            numbers.add(21);
            numbers.add(25);
            numbers.add(30);
            numbers.add(35);
            numbers.add(40);
            numbers.add(45);
            numbers.add(50);
            System.out.println(numbers);
            ArrayList<Integer> newCollection = new ArrayList<Integer>(numbers.subList(5,10));
            System.out.println("My new Collection" + newCollection);


            boolean isRemoved = numbers.removeIf(integer -> (integer < 20));
           System.out.println(numbers);
           System.out.println(isRemoved);

            numbers.set(2,1);
            numbers.set(5,-3);
            numbers.set(7,-4);
            int index =0;
            Collections.sort(numbers);
            for(int i : numbers) {
            System.out.println("position:" + (index++) + " value of element " + i);
        }

        }}




