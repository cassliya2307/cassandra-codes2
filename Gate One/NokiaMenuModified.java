import java.util.Scanner;

public class NokiaMenuModified{

public static void main(String[] args){

String prompt = """
Menu-  	1.Phone book
	2.Messages
	3.Chat
	4.Call Register
	5.Tones
	6.Settings
	7.Call Divert
	8.Games
	9.Calculator
	10.Reminders
	11.Clock
	12.Profiles
	13.SIM Services
	
	""";



Scanner scanner = new Scanner(System.in);

boolean isReturning = true;

while(isReturning){ 
System.out.println(prompt);
System.out.print("Enter a menu number: ");
int userInput = scanner.nextInt();
if(userInput != 0 ){isReturning = true;
}
else{isReturning = false;
}

switch(userInput){
	case 1 -> {

	System.out.println("1.Search");
	
	System.out.println("2.Service Nos");
	
	System.out.println("3.Add Name");
	
	System.out.println("4.Erase");
	
	System.out.println("5.Edit");
	
	System.out.println("6.Assign tone");
	
	System.out.println("7.Send b'card");
	
	System.out.println("8.Options");
	
	System.out.println("9.Speed dials");
	
	System.out.println("10.Voice Tags");

	System.out.print("Enter a menu number: ");
	 userInput = scanner.nextInt();
	

		
	if(userInput == 8){

	System.out.println("1.Type of view");
	
	System.out.println("2.Memory status");
	
	System.out.print("Enter a menu number: ");
	 userInput = scanner.nextInt();
	
	if(userInput == 1){System.out.println("1.Type of view");
	}

	else if(userInput == 2){System.out.println("2.Memory status");
	}
	else{System.out.print("Invalid number");}
			

	}
	
	else if(userInput == 1){System.out.println("1.Search");
}

	
	
	else if(userInput == 2){System.out.println("2.Service Nos");
	}

	else if(userInput == 3){System.out.println("3.Add Name");
}


	else if(userInput == 4){System.out.println("4.Erase");
}

	else if(userInput == 5){System.out.println("5.Edit");
}

	else if(userInput == 6){System.out.println("6.Assign tone");
	}

	else if(userInput == 7){System.out.println("7.Send b'card");}

	else if(userInput == 9){System.out.println("9.Speed dials");}

	else if(userInput == 10){System.out.println("10.Voice Tags");
}

	else{System.out.print("Invalid Number");}

	System.out.print("Enter number (0) to return to previous menu: ");
		 userInput = scanner.nextInt();
	}
	
	


	case 2 ->{
	
	System.out.println("1.Write messages");
	
	System.out.println("2.Inbox");
	
	System.out.println("3.Outbox");
	
	System.out.println("4.Picture messages");
	
	System.out.println("5.Templates");
	
	System.out.println("6.Smileys");
	
	System.out.println("7.Message settings");
	
	System.out.println("8.Info service");
	
	System.out.println("9.Voice mailbox number");
	
	System.out.println("10.Service command editor");

	System.out.print("Enter a menu number: ");
	userInput = scanner.nextInt();
	
	if(userInput == 7){

	System.out.println("1.Set 1");
	
	System.out.println("2.Common");
	
	System.out.print("Enter a menu number: ");
	userInput = scanner.nextInt();
	
	if(userInput == 1){
	System.out.println("1.Message centre number");
	System.out.println("2.Messages sent as");
	System.out.println("3.Message validity");

	System.out.print("Enter a menu number: ");
	userInput = scanner.nextInt();
	
	if(userInput == 1){System.out.println("1.Message centre number");
	}

	else if(userInput == 2){System.out.println("2.Messages sent as");
	}

	else if(userInput == 3){System.out.println("3.Message validity");
	}

	else{System.out.print("Invalid number");}
	}

	if(userInput == 2){
	
	System.out.println("1.Delivery reports");
	System.out.println("2.Reply via same centre");
	System.out.println("3.Character support");	
	

	System.out.print("Enter a menu number: ");
	userInput = scanner.nextInt();

	
	if(userInput == 1){System.out.println("1.Delivery reports");
	}

	else if(userInput == 2){System.out.println("2.Reply via same centre");
	}

	else if(userInput == 3){System.out.println("3.Character support");
	}

	else{System.out.print("Invalid number");}
	}
	
	}

	else if(userInput == 1){System.out.println("1.Write messages");}

	else if(userInput == 2){System.out.println("2.Inbox");
}

	else if(userInput == 3){System.out.println("3.Outbox");
}

	else if(userInput == 4){System.out.println("4.Picture messages");
}

	else if(userInput == 5){System.out.println("5.Templates");
}

	else if(userInput == 6){System.out.println("6.Smileys");}

	
	else if(userInput == 8){System.out.println("8.Info service");
}

	else if(userInput == 9){System.out.println("9.Voice mailbox number");}

	else if(userInput == 10){
	System.out.println("10.Service command editor");}

		
	
		else{System.out.println("Invalid Number");}

	System.out.print("Enter number (0) to return to previous menu: ");
		 userInput = scanner.nextInt();

	
	}

	
	
	

	
	
	


	case 3 ->{
	
	System.out.println("1.Chat");

	System.out.print("Enter number (0) to return to previous menu: ");
		 userInput = scanner.nextInt();

	}






	case 4 ->{

	System.out.println("1.Missed calls");
	
	System.out.println("2.Received calls");
	
	System.out.println("3.Dialed numbers");
	
	System.out.println("4.Erase recent call lists");
	
	System.out.println("5.Show call duration");
	
	System.out.println("6.Show call costs");
	
	System.out.println("7.Call cost settings");
	
	System.out.println("8.Prepaid credit");

	System.out.print("Enter a menu number: ");
	userInput = scanner.nextInt();

	if(userInput == 5){

	System.out.println("1.Last call duration");
	
	System.out.println("2.All calls' duration");
	
	System.out.println("3.Received calls' duration");
	
	System.out.println("4.Dialed calls' duration");
	
	System.out.println("5.Clear timers");

	System.out.print("Enter a menu number: ");
	userInput = scanner.nextInt();
	
	if(userInput == 1){System.out.println("1.Last call duration");}

	else if(userInput == 2){System.out.println("2.All calls' duration");}

	else if(userInput == 3){System.out.println("3.Received calls' duration");
}

	else if(userInput == 4){System.out.println("4.Dialed calls' duration");}

	else if(userInput == 4){System.out.println("5.Clear timers");
}

	else{System.out.println("Invalid number");}

	}

	if(userInput == 6){
	
	System.out.println("1.Last call cost");
	
	System.out.println("2.All calls' cost");
	
	System.out.println("3.Clear counters");
	
	System.out.print("Enter a menu number: ");
	userInput = scanner.nextInt();
	
	if(userInput == 1){System.out.println("1.Last call cost");
}
	else if(userInput == 2){System.out.println("2.All calls' cost");
}
	else if(userInput == 3){System.out.println("3.Clear counters");
}

	else{System.out.println("Invalid number");}

	}
	
	if(userInput == 7){
	System.out.println("1.Call cost limit");
	
	System.out.println("2.Show costs in");

	System.out.print("Enter a menu number: ");
	userInput = scanner.nextInt();

	if(userInput == 1){System.out.println("1.Call cost limit");
}	
	else if(userInput == 2){System.out.println("2.Show costs in");
}

	else{System.out.println("Invalid number");}

	}

	else if(userInput == 1){System.out.println("1.Missed calls");	
}

	else if(userInput == 2){System.out.println("2.Received calls");	
}

	else if(userInput == 3){System.out.println("3.Dialed numbers");	
}

	else if(userInput == 4){System.out.println("4.Erase recent call lists");}

	else if(userInput == 8){System.out.println("8.Prepaid credit");
}

	else{System.out.println("Invalid number");}


	System.out.print("Enter number (0) to return to previous menu: ");
		 userInput = scanner.nextInt();





	}

	case 5 ->{

	System.out.println("1.Ringing tone");
	
	System.out.println("2.Ringing volume");
	
	System.out.println("3.Incoming call alert");
	
	System.out.println("4.Composer");
	
	System.out.println("5.Meassage alert tone");
	
	System.out.println("6.Keypad tones");
	
	System.out.println("7.Warning and game tones");
	
	System.out.println("8.Vibrating alert");

	System.out.println("9.Screen saver");

	System.out.print("Enter number (0) to return to previous menu: ");
		 userInput = scanner.nextInt();


	}

	case 6 ->{

	System.out.println("1.Call settings");

	System.out.println("2.Phone settings");

	System.out.println("3.Security settings");

	System.out.println("4.Restore factory settings");
	
	System.out.print("Enter a menu number: ");
	userInput = scanner.nextInt();
	
	if(userInput == 1){

	System.out.println("1.Automatic redial");

	System.out.println("2.Speed dialing");

	System.out.println("3.Call waiting options");

	System.out.println("4.Own number settings");

	System.out.println("5.Phone line in use");

	System.out.println("6.Automatic answer");

	System.out.print("Enter a menu number: ");
	userInput = scanner.nextInt();
	
	if(userInput == 1){System.out.println("1.Automatic redial");}

	else if(userInput == 2){System.out.println("2.Speed dialing");
}
	else if(userInput == 3){System.out.println("3.Call waiting options");
}
	else if(userInput == 4){System.out.println("4.Own number settings");}

	else if(userInput == 5){System.out.println("5.Phone line in use");}

	else if(userInput == 6){System.out.println("6.Automatic answer");
}

	else{System.out.println("Invalid number");}
	}

	if(userInput == 2){
	
	System.out.println("1.Language");

	System.out.println("2.Cell info display");

	System.out.println("3.Welcome note");

	System.out.println("4.Network selection");

	System.out.println("5.Lights");

	System.out.println("6.Confirm SIM service actions");

	System.out.print("Enter a menu number: ");
	userInput = scanner.nextInt();
	
	if(userInput == 1){System.out.println("1.Language");}

	else if(userInput == 2){System.out.println("2.Cell info display");
}
	else if(userInput == 3){System.out.println("3.Welcome note");
}
	else if(userInput == 4){System.out.println("4.Network selection");}

	else if(userInput == 5){System.out.println("5.Lights");}

	else if(userInput == 6){System.out.println("6.Confirm SIM service actions");
}

	else{System.out.println("Invalid number");}
	}


	if(userInput == 3){
	
	System.out.println("1.PIN code request");

	System.out.println("2.Call barring service");

	System.out.println("3.Fixed dialing");

	System.out.println("4.Closed user group");

	System.out.println("5.Phone security");

	System.out.println("6.Change access codes");

	System.out.print("Enter a menu number: ");
	userInput = scanner.nextInt();

	if(userInput == 1){System.out.println("1.PIN code request");}

	else if(userInput == 2){System.out.println("2.Call barring service");
}
	else if(userInput == 3){System.out.println("3.Fixed dialing");
}
	else if(userInput == 4){System.out.println("4.Closed user group");}

	else if(userInput == 5){System.out.println("5.Phone security");}

	else if(userInput == 6){System.out.println("6.Change access codes");
}

	else{System.out.println("Invalid number");}


	}

	else if(userInput == 4){System.out.println("4.Restore factory settings");}


	else{System.out.println("Invalid number");}
	
	System.out.print("Enter number (0) to return to previous menu: ");
		 userInput = scanner.nextInt();

	}

	case 7 ->{

	System.out.println("1.Call divert");


	System.out.print("Enter number (0) to return to previous menu: ");
		 userInput = scanner.nextInt();

	}


	case 8 ->{

	System.out.println("1.Games");
         System.out.print("Enter number (0) to return to previous menu: ");
		 userInput = scanner.nextInt();


	}


	case 9 ->{

	System.out.println("1.Calculator");

	System.out.print("Enter number (0) to return to previous menu: ");
		 userInput = scanner.nextInt();

	}

	case 10 ->{

	System.out.println("1.Reminders");
		System.out.print("Enter number (0) to return to previous menu: ");
		 userInput = scanner.nextInt();


	}

	case 11 ->{

	System.out.println("1.Clock");

	System.out.print("Enter a menu number: ");
	userInput = scanner.nextInt();
	
	if(userInput == 1){
	System.out.println("1.Alarm clock");

	System.out.println("2.Clock settings");

	System.out.println("3.Date setting");

	System.out.println("4.Stop watch");

	System.out.println("5.Countdown timer");

	System.out.println("6.Auto update of date and time");


	System.out.print("Enter a menu number: ");
	userInput = scanner.nextInt();


	if(userInput == 1){System.out.println("1.Alarm clock");}

	else if(userInput == 2){System.out.println("2.Clock settings");
}
	else if(userInput == 3){System.out.println("3.Fixed dialing");
}
	else if(userInput == 4){System.out.println("4.Date setting");}

	else if(userInput == 5){System.out.println("5.Stop watch");}

	else if(userInput == 6){System.out.println("6.Countdown timer");}


	}

		System.out.print("Enter number (0) to return to previous menu: ");
		 userInput = scanner.nextInt();

	}



	case 12 ->{ System.out.println("1.Profiles");


	System.out.print("Enter number (0) to return to previous menu: ");
		 userInput = scanner.nextInt();



	}

	case 13 ->{ System.out.println("1.SIM services");


	System.out.print("Enter number (0) to return to previous menu: ");
		 userInput = scanner.nextInt();


	}

	/*case 14 ->{System.out.println("Enter number (0) to return to previous menu");
		 userInput = scanner.nextInt();}*/
	
		}


	
	}
	




}




}