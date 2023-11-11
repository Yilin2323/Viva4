/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package viva4;

/**
 *
 * @author User
 */
import java.util.Scanner; 
public class Viva4 { 
    public static void main(String[] args) {
         
      Scanner scanner=new Scanner(System.in); 
      System.out.println("Enter a string: ");
      String password=scanner.nextLine();
      
        final int NUM_UPPER_LETTERS=1;
        final int NUM_LOWER_LETTERS=1;
        final int NUM_SPECIAL_CHAR=1;
        final int NUM_DIGITS=1;
        int uppercasecount=0;
        int lowercasecount=0;
        int specialcharcount=0;
        int digit=0;
        
        for (int i=0;i<password.length();i++){
            char ch=password.charAt(i);
            if (Character.isUpperCase(ch)){
                uppercasecount++;
         }else if(Character.isLowerCase(ch)){
                lowercasecount++;
            }else if (Character.isDigit(ch)){
                digit++;
                // the index of method will return -1 if certain character in the string could not be found
            }else if ("!@#$%^&*()-+".indexOf(ch)>=0){
                specialcharcount++;          
            }
              
        }
        if (uppercasecount>=NUM_UPPER_LETTERS && lowercasecount>=NUM_LOWER_LETTERS && digit>=NUM_DIGITS &&  specialcharcount>=NUM_SPECIAL_CHAR && password.length()>=8){
            System.out.println("Strength of password: Strong");
        }
        else if (uppercasecount>=NUM_UPPER_LETTERS && lowercasecount>=NUM_LOWER_LETTERS && specialcharcount>=NUM_SPECIAL_CHAR&&password.length()>=6){
            System.out.println("Strength of password: Moderate");
        }else{
            System.out.println("Strength of password: Weak");
        }
        
         } 
    
    }

