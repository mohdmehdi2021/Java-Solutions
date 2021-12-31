// Author : Mohd Mehdi
// Date : January 1, 2022 02:36 AM

// New Year greetings to all


import java.util.Scanner;
import java.net.*;

class IPAddressDetector{
	String website;
	IPAddressDetector(String websiteName){
		website = websiteName;	
	}
public void ipadd(){	

try{
	InetAddress inet = InetAddress.getLocalHost();
	inet = InetAddress.getByName(website);
	System.out.println("Website : "+website);
	System.out.println("IP Address :"+inet);
}catch(Exception e){
	e.printStackTrace();
}
}
}


public class Main {
	public static void main(String[] args) {
		
		Scanner scanWebName = new Scanner(System.in);
		
	System.out.println("Enter website name : ");
	String web = scanWebName.nextLine();
	IPAddressDetector ip = new IPAddressDetector(web);
	ip.ipadd();
	}
}