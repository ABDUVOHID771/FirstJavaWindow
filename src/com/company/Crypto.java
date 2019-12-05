package com.company;

public class Crypto {
    private static final int key=12345;
    private final int encryptedPassword;
    public Crypto(int password){
        this.encryptedPassword=encryptDecrypt(password);
    }
    private int encryptDecrypt(int password){
        return password^key;
    }
    public void storePassword(){
        System.out.println("Saving password as : "+this.encryptedPassword);
    }
    public boolean letMeIn(int password){
        if(encryptDecrypt(password)==this.encryptedPassword){
            System.out.println("Welcome");
            return true;
        }else{
            System.out.println("You cannot come in !");
            return false;
        }
    }
}
