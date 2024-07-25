/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ArrayRev;

import javax.swing.JOptionPane;

/**
 *
 * @author lab_services_student
 */
public class ArrayInputBased {
    
    
    public static void main(String[] args) {
        
        
        int size =  Integer.parseInt(JOptionPane.showInputDialog("Enter the size of the array"));
        int[] num = new int[size];
        
        for (int i = 0; i < size; i++) {
                    num[i]  =  Integer.parseInt(JOptionPane.showInputDialog("Enter num value"));

                    
                    
            
        }
        
      for (int i = 0; i < size - 1; i++) { 
    for (int j = 0; j < size - i - 1; j++) { 
        if (num[j] > num[j + 1]) { 
            
            int temp = num[j];
            num[j] = num[j + 1];
            num[j + 1] = temp;
        }
    }
}

        System.out.println("Sorted vertical order");

        for (int i = 0; i < size; i++) {
                                                    System.out.println(num[i]);

        }
        System.out.println(size);
        System.out.println("Max value " + num[size-1]);
        System.out.println("Min value " + num[0]);
        int total = 0;
        for (int i = 0; i < size; i++) {
            
            total = total + num[i];
            
        }
        if (total%2 ==0) {
            System.out.println(total + " is even");
        }
        else{
            System.out.println(total + " odd");
        }
        
    }
}
