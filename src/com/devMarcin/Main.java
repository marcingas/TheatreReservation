package com.devMarcin;

public class Main {
    public static void main(String[] args) {

Theatre theatre = new Theatre("Narodowy", 8, 12);
//theatre.getSeats();
theatre.reserveSeat("A05");
theatre.reserveSeat("A06");
if(theatre.reserveSeat("H11")){
    System.out.println("Please, pay");
} else{
    System.out.println("sorry seat taken");
}
    }
}