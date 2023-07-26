/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2.pkg2;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author KTMAIT
 */
public class Lab22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Please enter your email address ");
        String input = obj.nextLine();
        Pattern pattern = Pattern.compile("^(?!\\.|@|www)[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$");
        Matcher matcher = pattern.matcher(input);
        boolean matchFound = matcher.find();
        if(matchFound){
            
            System.out.println(input + " is valid email");
             
        }else{
            System.out.println(input + " is not valid email");
            
        }
    }
    
}
