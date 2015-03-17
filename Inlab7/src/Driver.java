/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Drew
 */
public class Driver {
    public static int binarySearch(Comparable[] array, Comparable value) {
        int midpoint;
        int low = 0;
        int high = array.length - 1;

        while (low <= high) {
            midpoint = (low + high) / 2;
            if (array[midpoint].compareTo(value) == 0) {
                return midpoint;
            } else if (array[midpoint].compareTo(value) < 0) {
                low = midpoint + 1;
            } else {
                high = midpoint - 1;
            }
        }
        return -1;
    }
    
    public static void main(String[] args){
        Comparable[] intArray = new Comparable[10];
        for(int i = 0; i < intArray.length; i++) {
            intArray[i] = i*3;
            System.out.print(intArray[i] + " ");
        }
        System.out.println();
        
        System.out.println(binarySearch(intArray, 18));
        System.out.println(binarySearch(intArray, 13));        
        
        String[] stringArray = new String[10];
        stringArray[0] = "Alex";
        stringArray[1] = "Ben";
        stringArray[2] = "Carl";
        stringArray[3] = "Drew";
        stringArray[4] = "Eric";
        stringArray[5] = "Frank";
        stringArray[6] = "Guss";
        stringArray[7] = "Hugh";
        stringArray[8] = "Ian";
        stringArray[9] = "Jack"; 
        
        for(int i = 0; i < stringArray.length; i++) {
            System.out.print(stringArray[i] + " ");
        }
        System.out.println();        
        
        System.out.println(binarySearch(stringArray, "Eric"));
        System.out.println(binarySearch(stringArray, "Mark"));
    }
}
