/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package midtermexam_versiona_extensioncode;
import java.util.Scanner;

/**
 *
 * @author Sarah
 */
public class TestUserProfile {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        //user profile
        UserProfile user = new UserProfile();
        
        System.out.print("Enter your name: ");
        String name = input.next();
        
        System.out.println(user.getGenres());
        
        System.out.print("Enter your favourite genre: ");
        String genre = input.next();
        
        //sets the userprofile
        UserProfile user2 = new UserProfile(name, genre);
        
        System.out.println("Your userprofile was created.");
       
    }
}
