package com.anoman.javainterm;

import java.net.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws UnknownHostException {
	// write your code here
        // IP4 address Detector
        String website;
        Scanner input;
        input= new Scanner(System.in);

        System.out.println("Enter the website domain as, example.com");
        website = input.nextLine();

        InetAddress address_of_target;
        address_of_target = InetAddress.getByName(website);
        System.out.println("Target Website : "+website);
        System.out.println("\t IP version 4 : "+address_of_target);

    }
}
