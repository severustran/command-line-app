package vn.com.liemtt.ago;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of element: ");
        int numElement = Integer.parseInt(sc.nextLine());
        ArrayList<Integer> elements = new ArrayList();
        if (numElement == 0 ) {
            System.out.println("Abort!!!");
            return;
        } else {
            for (int i = 0; i<numElement; i++) {
                int userInput = Integer.parseInt(sc.nextLine());
                elements.add(userInput);
            }
        }

        Iterator iterator = elements.iterator();
        while (iterator.hasNext()) {
            int temp = (int) iterator.next();
            if(temp%2 != 0 || temp == 0) {
                iterator.remove();
            }
        }

        System.out.println(elements.size());

        if(elements.size()!=0) {
            elements.forEach(element -> {
                System.out.println(element);
            });
        } else {
            System.out.println("Do not have any even number!!!");
        }
    }
}
