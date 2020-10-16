package vn.com.liemtt.ago;

import java.util.ArrayList;
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
                if(userInput%2==0 && userInput!=0) {
                    elements.add(userInput);
                }
            }
        }
        if(elements.size()!=0) {
            elements.forEach(element -> {
                System.out.println(element);
            });
        } else {
            System.out.println("Do not have any even number!!!");
        }
    }
}
