package Demo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.TreeSet;

public class Practise {
    public static void main(String[] args) {
        System.out.println("Welcome to iterator method for arraylist");
        ArrayList<String> Books = new ArrayList<>();
        Books.add("B5");
        Books.add("B2");
        Books.add("B3");
        Books.add("B4");

        //for each loop:
        for (String ris:Books
             ) {
            System.out.print(ris + "\t" + ris.length()+"\t");
            StringBuffer br = new StringBuffer(ris);
            System.out.println("br.reverse() = " + br.reverse());

        }
        System.out.println("___*******************____________________");

        //transversing using ITERATOR
         Iterator<String> iterator = Books.iterator();
         while (iterator.hasNext()){
             String ne = iterator.next();
             System.out.println("ne = " + ne);
         }
        System.out.println("************************************");
         //Backward transvering
         ListIterator<String>  iterator1 = Books.listIterator(Books.size());
         while(iterator1.hasPrevious()){
             String ne2 = iterator1.previous();
             System.out.println("ne2 = " + ne2);
         }
        System.out.println("*************************");

         //for each method
        Books.forEach(str->{
            System.out.println("str = " + str);
        });
        System.out.println("****************************");

        TreeSet<String> set = new TreeSet<>();
        set.addAll(Books);
        set.forEach(str1->{
            System.out.println("str1 = " + str1);
        });
 

    }
}
