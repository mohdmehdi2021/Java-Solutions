package com.anoman.javaherbert;

import java.util.Scanner;

public class Signup {
    String FirstName,SecondName;
    long PhoneNumber;
    String password;

    // Setters
    public void setFirstName(String fn){
        FirstName = fn;
    }
    public void setSecondName(String sn){
        SecondName = sn;
    }
    public void setPhoneNumber(long pn){
        PhoneNumber = pn;
    }
    public void setPassword(String pw){
        password = pw;
    }

    // Getters

    public String getFirstName(){
        return FirstName;
    }
    public String getSecondName(){
        return SecondName;
    }
    public long getPhoneNumber(){
        return PhoneNumber;
    }
    public String getPassword(){
        return password;
    }
}


class Mukhiya{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your First Name : ");
        String fname = input.next();

        System.out.print("Enter your Second Name : ");
        String sname = input.next();

        System.out.print("Enter your Phone Number (not more than 6 digit) : ");
        long pnumber = input.nextLong();

        System.out.print("Enter your Password (good password is the combination of alphabets and numbers) : ");
        String pwd = input.next();

        Signup form1 = new Signup();

        form1.setFirstName(fname);
        form1.setSecondName(sname);
        form1.setPhoneNumber(pnumber);
        form1.setPassword(pwd);

        System.out.println("\n\n\nHey " + form1.getFirstName() + "!,");
        System.out.println("Kindly check your credentials before proceeding.");
        System.out.println("Full Name : "+form1.getFirstName() + " " + form1.getSecondName());
        System.out.println("Phone Number : " + form1.getPhoneNumber());
        System.out.println("Password : " + form1.getPassword());

    }
}
