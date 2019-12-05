package com.company;

public class Main {

    public static void main(String[] args) {
	MyWin myWin=new MyWin("First_Window");
	myWin.setVisible(true);
	Crypto crypto=new Crypto(112432);
	crypto.storePassword();
	crypto.letMeIn(1234);
	crypto.letMeIn(100105);
	crypto.letMeIn(112432);
    }
}
