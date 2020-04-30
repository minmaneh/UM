if (choice==10){
	System.out.println(“You provided ten”);
}
else if (choice==20 && choice==30){
	System.outprintln(“You provided either twenty or thirty”);
}
else if (choice==40){
	System.out.println(“You provided forty”);
}
else{
	System.out.println(“I don’t know what you provided but I don’t care”);
}



switch(choice){
	case 1:
		choice==10;
		System.outprintln(“You provided either twenty or thirty”);
		break;
	case 2:
		choice==20 && choice==30;
		System.outprintln(“You provided either twenty or thirty”);
		break;
	case 3:
		choice==40;
		System.out.println(“You provided forty”);
		break;
	default:
		System.out.println(“I don’t know what you provided but I don’t care”);
		break;
}