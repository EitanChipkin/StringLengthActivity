/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package stringlength;
import java.util.Scanner;

/**
 *
 * @author eitanchipkin
 */
public class StringLength 
{

    
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter any String");
        String userInput = sc.nextLine();
        
        String updateInput = userInput.replace("a", "m");
        
        int stringLength = userInput.length();
        
        System.out.println("The original string was: " + userInput);
        System.out.println("The updated string is: " + updateInput);
        System.out.println("The length of the stirng is: " + stringLength);
       
    }
    
}

