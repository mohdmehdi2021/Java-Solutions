// *************************************************** Project Name = Music App ***************************************************
// *************************************************** Developer Name = Mohd Mehdi khan *******************************************
// *************************************************** Development started = 12/11/2021 *******************************************

import java.util.Scanner;

public class Main{
 public static void main(String args[]){

int language_option,hindiSongOption;

Scanner input = new Scanner(System.in); // ***********************SCANNER

System.out.println("\n\tMusic App v1.0");
System.out.println("\tDeveloped by = Mohd Mehdi Khan");
System.out.println("\tDevelopment Date = 12/11/2021\n\n\n");

System.out.println("\tWelcome To Music App");
System.out.println("\tPlease choose the language : \n\t1 for Hindi \n\t2 for English \n\t3 for Urdu");


language_option = input.nextInt();


if(language_option == 1){
	System.out.println("\tChoose index number to play that song.");
	System.out.println("\t1. Ae dil hai mushkil");
	System.out.println("\t2. Ya Ali ");
	System.out.println("\t3. Maa tujhe salam");
	
	hindiSongOption = input.nextInt();
	
	if(hindiSongOption == 1){
		System.out.println("\tPlaying Ae dil hai mushkil... ... ...");
		System.out.println("\t----Hope you Enjoyed!----");
	}
	else if(hindiSongOption == 2){
		System.out.println("\tPlaying Ya Ali... ... ...");
		System.out.println("\t----Hope you Enjoyed!----");
	}
	else if(hindiSongOption == 3){
		System.out.println("\tPlaying Maa Tujhe Salam... ... ...");
		System.out.println("\t----Hope you Enjoyed!----");
	}
	else{
		System.out.println("\tUnexpected choice. Closing the app.");
	}


}
else if(language_option == 2){
	System.out.println("\tChoose index number to play that song.");
	System.out.println("\t1. Shape Of You");
	System.out.println("\t2. Severus Snape Song ");
	System.out.println("\t3. Twinkle Twinkle Little Star");
	
	hindiSongOption = input.nextInt();
	
	if(hindiSongOption == 1){
		System.out.println("\tPlaying Shape Of You... ... ...");
		System.out.println("\t----Hope you Enjoyed!----");
	}
	else if(hindiSongOption == 2){
		System.out.println("\tPlaying Severus Snape Song... ... ...");
		System.out.println("\t----Hope you Enjoyed!----");
	}
	else if(hindiSongOption == 3){
		System.out.println("\tPlaying Twinkle Twinkle Little Star... ... ...");
		System.out.println("\t----Hope you Enjoyed!----");
	}
	else{
		System.out.println("\tUnexpected choice. Closing the app.");
	}

}
else if(language_option == 3){
	System.out.println("\tChoose index number to play that song.");
	System.out.println("\t1. Idhar Zindagi ka Janaza");
	System.out.println("\t2. Main Abdul Qadir Hoon ");
	System.out.println("\t3. Mujhe Dushman ke bachcho ko padhana hai");
	
	hindiSongOption = input.nextInt();
	
	if(hindiSongOption == 1){
		System.out.println("\tPlaying Idhar Zindagi ka Janaza... ... ...");
		System.out.println("\t----Hope you Enjoyed!----");
	}
	else if(hindiSongOption == 2){
		System.out.println("\tPlaying Main Abdul Qadir Hoon... ... ...");
		System.out.println("\t----Hope you Enjoyed!----");
	}
	else if(hindiSongOption == 3){
		System.out.println("\tPlaying Mujhe Dushman ke bachcho ko padhana hai... ... ...");
		System.out.println("\t----Hope you Enjoyed!----");
	}
	else{
		System.out.println("\tUnexpected choice. Closing the app.");
	}
}
else{
	System.out.println("Unexpected Choice. Closing the app.");
}



}
}